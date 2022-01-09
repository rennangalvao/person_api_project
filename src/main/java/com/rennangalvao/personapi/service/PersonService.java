package com.rennangalvao.personapi.service;

import com.rennangalvao.personapi.dto.MessageResponseDTO;
import com.rennangalvao.personapi.entity.Person;
import com.rennangalvao.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Creted peron with ID" + savedPerson.getId())
                .build();
    }
}

