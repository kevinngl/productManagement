package com.example.productManagement.service;

import com.example.productManagement.tables.Products;
import com.example.productManagement.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public List<Products> getAllProducts() {
        return productDao.findAll();
    }

}
//    public List<Products> getProductsByCategory(Integer categoryid) {
//        return productDao.findByCategoryId(categoryid);
//    }