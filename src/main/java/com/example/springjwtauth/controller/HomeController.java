package com.example.springjwtauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController

public class HomeController {


    Logger  logger = Logger.getLogger(String.valueOf(HomeController.class));


    @RequestMapping("/test")
    public String test() {
        this.logger.warning("This is working message");
        return "Testing message";
    }
    

}
