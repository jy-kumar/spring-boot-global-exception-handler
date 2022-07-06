package com.test.controllers;

import com.test.beans.Person;
import com.test.exceptions.NotValidToVoteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public ResponseEntity<Person> personResponseEntity(@RequestBody Person person) throws NotValidToVoteException {
        if(person.getAge()<=18)
            throw new NotValidToVoteException();
        return new ResponseEntity<>(person, HttpStatus.ACCEPTED);
    }
}
