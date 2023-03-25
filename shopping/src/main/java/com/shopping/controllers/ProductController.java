package com.shopping.controllers;

import com.shopping.model.Product;
import com.shopping.model.enums.ProductType;
import com.shopping.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

    @PostMapping("/product")
    Product postProduct(@RequestBody Product product){
        return this.productRepository.save(product);
    }
//    @GetMapping()
//    List<Product> findProductByType(@RequestBody ProductType productType){
//
//    }
}
