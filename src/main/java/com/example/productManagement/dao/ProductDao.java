package com.example.productManagement.dao;

import com.example.productManagement.tables.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Products, Integer> {
}
//    List<Products> findByCategoryId(Integer categoryid);
