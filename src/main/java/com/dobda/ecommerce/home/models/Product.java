package com.dobda.ecommerce.home.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Product {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getProductPrivilages() {
        return productPrivilages;
    }

    public void setProductPrivilages(List<String> productPrivilages) {
        this.productPrivilages = productPrivilages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    private String id;

    private String productName;
    private List<String> productPrivilages;
    private String description;



}
