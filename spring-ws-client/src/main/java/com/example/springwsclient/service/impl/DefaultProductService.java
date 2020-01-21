package com.example.springwsclient.service.impl;

import com.example.springwsclient.jaxb.ProductRequest;
import com.example.springwsclient.jaxb.ProductResponse;
import com.example.springwsclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class DefaultProductService implements ProductService {

    private WebServiceTemplate webServiceTemplate;

    @Autowired
    public DefaultProductService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    @Override
    public ProductResponse getProduct(ProductRequest productRequest) {
        return (ProductResponse) webServiceTemplate.marshalSendAndReceive(productRequest);
    }
}
