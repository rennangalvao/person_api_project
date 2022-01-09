package com.rennangalvao.personapi.repository;

import com.rennangalvao.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
