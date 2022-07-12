package com.example.keyword.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tools")
public class KeyController {
    @RequestMapping("/keyword")
     public String toIndex(){
         return "index";
     }
}
