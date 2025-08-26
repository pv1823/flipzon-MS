package com.flipzon;

import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flipzon.model.Product;
import com.flipzon.service.ProductService;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
    }
}