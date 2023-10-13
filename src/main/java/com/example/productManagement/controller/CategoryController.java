package com.example.productManagement.controller;
import com.example.productManagement.service.CategoryService;
import com.example.productManagement.tables.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("allCategories")
    public List<Categories> getAllCategories(){
        return categoryService.getAllCategories();
    }
}