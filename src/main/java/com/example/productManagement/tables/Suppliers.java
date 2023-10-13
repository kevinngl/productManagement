package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String suppliername;
    private String contactphone;
    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Products> products;
}