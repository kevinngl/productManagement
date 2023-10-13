package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

//This is ORM (Object Relational Model)

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    private String product_name;
    private double price;

    private Integer supplier_id;
    private Integer category_id;
}
