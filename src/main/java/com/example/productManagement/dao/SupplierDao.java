package com.example.productManagement.dao;

import com.example.productManagement.tables.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Suppliers, Integer> {
}
