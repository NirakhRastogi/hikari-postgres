package com.spring.hikari.HikariPostgres;

import com.spring.hikari.HikariPostgres.model.Person;
import com.spring.hikari.HikariPostgres.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class HikariPostgresApplication implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(HikariPostgresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Thread.sleep(10000);
        System.out.println("Started...");
        for (int i = 0; i < 100; i++) {
            this.personService.savePerson(Person.builder()
                    .age(20)
                    .id(UUID.randomUUID())
                    .name(UUID.randomUUID().toString())
                    .build());
        }
        System.out.println("Ended...");
    }
}
