package com.rennangalvao.personapi.controller;

import com.rennangalvao.personapi.dto.MessageResponseDTO;
import com.rennangalvao.personapi.entity.Person;
import com.rennangalvao.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){

        return personService.createPerson(person);
    }
}
