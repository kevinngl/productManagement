package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;
    private String category_name;
    @OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    private List<Products> products;
}