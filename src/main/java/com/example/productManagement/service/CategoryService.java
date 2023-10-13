package com.example.productManagement.service;

import com.example.productManagement.dao.CategoryDao;
import com.example.productManagement.tables.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;
    public List<Categories> getAllCategories() {
        return categoryDao.findAll();
    }
}