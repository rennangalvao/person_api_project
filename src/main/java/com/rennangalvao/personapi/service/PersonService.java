package com.rennangalvao.personapi.service;

import com.rennangalvao.personapi.dto.request.PersonDTO;
import com.rennangalvao.personapi.dto.response.MessageResponseDTO;
import com.rennangalvao.personapi.entity.Person;
import com.rennangalvao.personapi.mapper.PersonMapper;
import com.rennangalvao.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave  = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Creted peron with ID" + savedPerson.getId())
                .build();
    }
}

