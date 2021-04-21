package com.flipzon.server.controller;

import com.flipzon.server.model.Products;
import com.flipzon.server.service.FZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

     private final FZService service;

     @Autowired
    public ProductController(FZService service) {
        this.service = service;
    }

    //  http://localhost:8080/products/search/001
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

    @PostMapping("/add")
    public ResponseEntity<Products> addProduct(@RequestBody Products newProduct) {
        ResponseEntity<Products> returnVal = null;
        Products p = null;

        try {
            p = service.addProduct(newProduct);
            returnVal = new ResponseEntity<>(p, HttpStatus.OK);
        }catch (Exception ex) {
            ex.printStackTrace();
            p = null;
            returnVal = new ResponseEntity<>(p, HttpStatus.BAD_REQUEST);
        }
        return returnVal;
    }
    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<Map<String, String>> deleteProduct(@PathVariable("pid") long pid) {
         ResponseEntity<Map<String, String>> delVal = null;
         Map<String, String> map = new HashMap<>();
         try {
             boolean d = service.deleteProduct(pid);
             map.put("pid",pid+"");
             map.put("status","DELETED");
             delVal = new ResponseEntity<>(map, HttpStatus.OK);
         } catch (Exception ex) {
             ex.printStackTrace();
             map.put("pid", pid+"");
             map.put("status", "FAILURE");
             delVal = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
         }
         return delVal;
    }

    @PostMapping("/modify")
    public ResponseEntity<Products> modifyProduct(@RequestBody Products modifiedProduct) {
         Products updatedProduct = service.modifyProduct(modifiedProduct);
         ResponseEntity<Products> retVal = null;
         try {
             retVal = new ResponseEntity<>(updatedProduct, HttpStatus.OK);
         } catch (Exception ex) {
             ex.printStackTrace();
             updatedProduct = null;
             retVal = new ResponseEntity<>(updatedProduct, HttpStatus.BAD_REQUEST);
         }
         return retVal;
    }

}

