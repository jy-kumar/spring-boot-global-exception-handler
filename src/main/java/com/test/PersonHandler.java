package com.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PersonHandler {
    @ExceptionHandler(value = NotValidToVoteException.class)
    public ResponseEntity<String> notValidToVote(){
        return new ResponseEntity<>("Not valid to vote", HttpStatus.NOT_FOUND);
    }
}
