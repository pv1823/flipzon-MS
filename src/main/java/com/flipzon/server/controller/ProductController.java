package com.flipzon.server.controller;

import com.flipzon.server.model.Products;
import com.flipzon.server.service.FZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
public class ProductController {

     private final FZService service;

     @Autowired
    public ProductController(FZService service) {
        this.service = service;
    }

    //      http://localhost:8080/products/search/001
    @GetMapping("/search/{pid}")
    public List<Products> searchProducts(@PathVariable("pid") String pid) {
        List<Products> products = null;
        try {
            long productid = Long.parseLong(pid);
            products = service.searchProduct(productid);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

}
