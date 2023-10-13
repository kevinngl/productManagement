package com.example.productManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {
    @GetMapping("allProducts")
    public String getAllProducts(){
        return productService.getAllProducts();
    }
}
