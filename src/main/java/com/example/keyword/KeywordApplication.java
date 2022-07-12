package com.example.keyword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class KeywordApplication {
    public static void main(String[] args) {
        SpringApplication.run(KeywordApplication.class, args);
    }
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

}
