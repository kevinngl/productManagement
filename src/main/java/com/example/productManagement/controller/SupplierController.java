package com.example.productManagement.controller;
import com.example.productManagement.service.SupplierService;
import com.example.productManagement.tables.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("suppliers")
public class SupplierController {
    @Autowired
    SupplierService supplierService;
    @GetMapping("allSuppliers")
    public List<Suppliers> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }
}