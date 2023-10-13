package com.example.productManagement.service;

import com.example.productManagement.dao.CategoryDao;
import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Products;
import com.example.productManagement.dao.ProductDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;
    @Transactional
    public ResponseEntity<List<Products>> getAllProducts() {
        try{
            return new ResponseEntity<>(productDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<String> addProducts(Products products) {
        productDao.save(products);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }
    @Transactional
    public String deleteProduct(Integer productId) {
        productDao.deleteById(productId);
        return "Success";
    }
}
