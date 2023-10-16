package com.example.productManagement.controller;
import com.example.productManagement.service.CategoryService;
import com.example.productManagement.service.InventoryService;
import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Inventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventories")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @GetMapping("allInventories")
    public List<Inventories> getAllInventories(){
        return inventoryService.getAllInventories();
    }
}