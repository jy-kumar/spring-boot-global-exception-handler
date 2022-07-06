package com.test.controllers;

import com.test.beans.Product;
import com.test.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public ResponseEntity<Product> getAll(@RequestBody Product product) throws ProductNotFoundException {
        if(product.getProductId()==1)
            throw new ProductNotFoundException();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
