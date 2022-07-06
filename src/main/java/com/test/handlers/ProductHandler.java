package com.test.handlers;

import com.test.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductHandler {

    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<String> productNotFound(){
        return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    }
}
