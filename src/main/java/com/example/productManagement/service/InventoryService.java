package com.example.productManagement.service;

import com.example.productManagement.dao.CategoryDao;
import com.example.productManagement.dao.InventoryDao;
import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Inventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryDao inventoryDao;
    public List<Inventories> getAllInventories() {
        return inventoryDao.findAll();
    }
}