package com.dobda.ecommerce.utils;

import com.dobda.ecommerce.home.controllers.HomePageController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Util {

    private Logger logger = LoggerFactory.getLogger(Util.class);

    public void getEncodedPassword(String password){
        logger.info(new BCryptPasswordEncoder().encode(password));
    }

    public static void main(String[] args) {
        new Util().getEncodedPassword("secret123");
    }
}
