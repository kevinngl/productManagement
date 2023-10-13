package com.example.productManagement.controller;

import com.example.productManagement.tables.Products;
import com.example.productManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    ProductService productService;
    @GetMapping("allProducts")
    public ResponseEntity<List<Products>> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("addProducts")
    public ResponseEntity<String> addProducts(@RequestBody Products products){
        return productService.addProducts(products);
    }
    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer productId) {
        String result = productService.deleteProduct(productId);
        return ResponseEntity.ok(result);
    }
}
