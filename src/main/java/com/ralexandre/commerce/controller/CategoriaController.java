package com.ralexandre.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoria")
public class CategoriaController {

    @GetMapping("")
    public String categoria() {
        return "categoria";
    }

    @GetMapping("formcategoria")
    public String formcategoria() {
        return "formcategoria";
    }
    
}
