package com.example.springwsclient.controller;

import com.example.springwsclient.jaxb.ProductRequest;
import com.example.springwsclient.jaxb.ProductResponse;
import com.example.springwsclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/api/product")
    public ProductResponse post(ProductRequest productRequest) {
        return service.getProduct(productRequest);
    }
}
