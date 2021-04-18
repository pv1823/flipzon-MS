package com.flipzon.server.service;

import com.flipzon.server.model.Products;
import com.flipzon.server.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FZService {

    private final ProductRepo productRepo;

    @Autowired
    public FZService(ProductRepo productRepo) {
        this.productRepo = productRepo;
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
}
