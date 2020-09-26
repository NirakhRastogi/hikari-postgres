package com.spring.hikari.HikariPostgres.repository;

import com.spring.hikari.HikariPostgres.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends CrudRepository<Person, UUID> {
}
