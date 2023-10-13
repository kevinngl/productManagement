package com.example.productManagement.controller;

import com.example.productManagement.tables.Products;
import com.example.productManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//    @GetMapping("category/{categoryid}")
//    public List<Products> getProductsByCategory(@PathVariable Integer categoryid){
//        return productService.getProductsByCategory(categoryid);
//    }

    @PostMapping("addProducts")
    public String addProducts(@RequestBody Products products){
        return productService.addProducts(products);
    }

}
