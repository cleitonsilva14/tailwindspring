package br.com.tailwindspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {


    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }
    
    
}