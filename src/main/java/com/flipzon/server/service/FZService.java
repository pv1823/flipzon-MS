package com.flipzon.server.service;

import com.flipzon.server.model.Products;
import com.flipzon.server.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FZService {

    private final ProductRepo productRepo;

    @Autowired
    public FZService(ProductRepo productRepo) {
        this.productRepo = productRepo;
        System.out.println("====FZService{}===");
    }

    public List<Products> searchProduct(long productId) {
        List<Products> li = null;

        try {
            li= productRepo.findById(productId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return li;
    }

    public Products addProduct(Products p) {
        try{
            p = productRepo.save(p);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return p;
    }

    public boolean deleteProduct(long pid) {
        try {
             productRepo.deleteById(pid);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public Products modifyProduct(Products givenProduct) {
        Products existingProduct = null;
        try {
            Optional<Products> fetchProduct = productRepo.findById(givenProduct.getPid());

            if (fetchProduct.isPresent()) {
                existingProduct = fetchProduct.get();
                existingProduct.setName(givenProduct.getName());
                existingProduct.setPdesc(givenProduct.getPdesc());
                existingProduct.setPtype(givenProduct.getPtype());
                existingProduct.setPrice(givenProduct.getPrice());
                existingProduct.setDimensions(givenProduct.getDimensions());
                existingProduct.setImage(givenProduct.getImage());

                productRepo.save(existingProduct);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return existingProduct;
    }
}
