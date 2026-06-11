package com.example.trainee_app.controller;

import com.example.trainee_app.demo.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    // Inject service layer — controller handles request/response only
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // DELETE endpoint — removes product by id from inventory
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProductById(id);
    }
}
