package com.dobda.ecommerce.home.baos;

import com.dobda.ecommerce.home.daos.ProductRepo;
import com.dobda.ecommerce.home.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotedProductsBao implements PromotedProductsBaoI{

    @Autowired
    private ProductRepo productRepo;

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllPromotedProducts(){
        List<Product> products=null;
        products = productRepo.findByproductPrivilagesContaining("home");
        return  products;
    }
}
