package com.spring.hikari.HikariPostgres.service;

import com.spring.hikari.HikariPostgres.model.Person;
import com.spring.hikari.HikariPostgres.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public void savePerson(Person person) {
        this.personRepository.save(person);
    }

}
