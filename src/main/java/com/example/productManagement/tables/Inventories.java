package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//This is ORM (Object Relational Model)

@Data
@Entity
public class Inventories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventory_id;
    private Integer product_id;

    private Integer quantity;

}
