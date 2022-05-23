package com.careerdevs.stockAPI.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class USD_JPY {

    @Autowired
    private Environment env;


    private final String BASE_URL = "https://www.alphavantage.co/query";


}
