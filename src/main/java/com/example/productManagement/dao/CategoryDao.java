package com.example.productManagement.dao;

import com.example.productManagement.tables.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Categories, Integer> {
}
