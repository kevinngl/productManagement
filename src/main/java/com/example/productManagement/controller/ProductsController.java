package com.example.productManagement.controller;

import com.example.productManagement.tables.Products;
import com.example.productManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    ProductService productService;
    @GetMapping("allProducts")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }

}
//    @GetMapping("category/{categoryid}")
//    public List<Products> getProductsByCategory(@PathVariable Integer categoryid){
//        return productService.getProductsByCategory(categoryid);
//    }