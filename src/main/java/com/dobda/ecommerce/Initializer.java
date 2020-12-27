package com.dobda.ecommerce;

import com.dobda.ecommerce.home.daos.ProductRepo;
import com.dobda.ecommerce.home.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Initializer implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(Initializer.class);
    @Autowired
    private ProductRepo repo;

    @Value( "${app.add.test_data}" )
    private boolean addDemoData;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("add demoData : "+addDemoData);
        if(addDemoData) {
            logger.info("adding testing product samples !");

            Product product = new Product();
            product.setProductName("test product 1");
            product.setDescription(" description for test product 1");
            product.setProductPrivilages(Collections.singletonList("home"));

            repo.save(product);

            product = new Product();
            product.setProductName("test product 2");
            product.setDescription(" description for test product 2");
            product.setProductPrivilages(Collections.singletonList("test partner"));

            repo.save(product);
        }else{
            logger.info("No need to add Demo samples :) ");
        }

    }
}
