package com.dobda.ecommerce.home.daos;

import com.dobda.ecommerce.home.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ProductRepo extends MongoRepository<Product, String> {
    List<Product> findByProductNameContaining(String productName);
    List<Product> findByDescription(String description);
    List<Product> findByproductPrivilagesContaining(String privilage);


}
