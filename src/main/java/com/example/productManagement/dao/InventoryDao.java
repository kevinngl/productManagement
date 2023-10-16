package com.example.productManagement.dao;

import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryDao extends JpaRepository<Inventories, Integer> {
}
