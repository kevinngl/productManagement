package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

//This is ORM (Object Relational Model)

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String productname;
    private double price;

    @ManyToOne
    @JoinColumn(name = "categoryid", nullable = false)
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "supplierid", nullable = false)
    private Suppliers supplier;

    private int stockquantity;
}
