package com.example.productManagement.service;

import com.example.productManagement.dao.CategoryDao;
import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Products;
import com.example.productManagement.dao.ProductDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;
    @Transactional
    public List<Products> getAllProducts() {
        return productDao.findAll();
    }
//    public List<Products> getProductsByCategory(Integer categoryid) {
//        return productDao.findByCategoryId(categoryid);
//    }
    public String addProducts(Products products) {
        productDao.save(products);
        return "Success";
    }
}
