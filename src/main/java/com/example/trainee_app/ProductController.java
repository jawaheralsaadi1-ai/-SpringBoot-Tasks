package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    // Inject service layer — controller handles request/response only
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


}
