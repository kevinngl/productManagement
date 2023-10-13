package com.example.productManagement.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplier_id;
    private String supplier_name;
    private String contact_person;
    private String phone_number;
    @OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "supplier_id",referencedColumnName = "supplier_id")
    private List<Products> products;
}