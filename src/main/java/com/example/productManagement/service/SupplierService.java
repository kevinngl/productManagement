package com.example.productManagement.service;

import com.example.productManagement.dao.SupplierDao;

import com.example.productManagement.tables.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    SupplierDao supplierDao;
    public List<Suppliers> getAllSuppliers() {
        return supplierDao.findAll();
    }
}