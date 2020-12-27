package com.dobda.ecommerce.home.controllers;

import com.dobda.ecommerce.home.baos.PromotedProductsBao;
import com.dobda.ecommerce.home.baos.PromotedProductsBaoI;
import com.dobda.ecommerce.home.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/")
public class HomePageController {

    private Logger logger = LoggerFactory.getLogger(HomePageController.class);

    @Autowired
    private PromotedProductsBaoI promotedProductsBao;


    public PromotedProductsBaoI getPromotedProductsBao() {
        return promotedProductsBao;
    }

    public void setPromotedProductsBao(PromotedProductsBaoI promotedProductsBao) {
        this.promotedProductsBao = promotedProductsBao;
    }


    @GetMapping("/promotedProducts")
    public List<Product> getPromotedProducts(){
        logger.info("getting promoted products call ...");
        List<Product> products = null;
        products = promotedProductsBao.getAllPromotedProducts();
        logger.info("promoted products list is : "+products);

        return products;

    }

}
