package com.example.springwsclient.service;

import com.example.springwsclient.jaxb.ProductRequest;
import com.example.springwsclient.jaxb.ProductResponse;

public interface ProductService {

    ProductResponse getProduct(ProductRequest productRequest);
}
