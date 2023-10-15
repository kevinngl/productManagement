package com.example.productManagement.service;

import com.example.productManagement.dao.CategoryDao;
import com.example.productManagement.tables.Categories;
import com.example.productManagement.tables.Products;
import com.example.productManagement.dao.ProductDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;
    @Transactional
    public ResponseEntity<List<Products>> getAllProducts() {
        try{
            return new ResponseEntity<>(productDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<String> addProducts(Products products) {
        productDao.save(products);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }
    public ResponseEntity<String> updateProducts(Integer productId, Products updatedProduct) {
        Optional<Products> existingProductOptional = productDao.findById(productId);

        if (existingProductOptional.isPresent()) {
            Products existingProduct = existingProductOptional.get();

            // Update the existing product with the new data
            existingProduct.setProduct_name(updatedProduct.getProduct_name());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setSupplier_id(updatedProduct.getSupplier_id());
            existingProduct.setCategory_id(updatedProduct.getCategory_id());

            // Save the updated product
            productDao.save(existingProduct);

            return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
        } else {
            // Product with the given ID not found
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }


    @Transactional
    public String deleteProduct(Integer productId) {
        productDao.deleteById(productId);
        return "Success";
    }
}
