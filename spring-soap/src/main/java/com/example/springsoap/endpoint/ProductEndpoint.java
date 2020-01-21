package com.example.springsoap.endpoint;

import com.example.springsoap.domain.ProductRequest;
import com.example.springsoap.domain.ProductResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

@Endpoint
public class ProductEndpoint {


    @PayloadRoot(namespace = "http://www.sample.com/schemas", localPart = "productRequest")
    @ResponsePayload
    public ProductResponse getProduct(@RequestPayload ProductRequest productRequest) {
        String id = productRequest.getId();
        ProductResponse response = new ProductResponse();
        response.setName("iphone 8");
        response.setPrice(10000000);
        response.setType("PHONE");
        response.setCreationDate(new Date());
        return response;
    }
}
