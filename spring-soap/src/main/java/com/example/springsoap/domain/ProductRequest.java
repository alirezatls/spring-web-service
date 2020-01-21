package com.example.springsoap.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "http://www.sample.com/schemas")
@XmlType(name = "", namespace = "http://www.sample.com/schemas")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductRequest {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
