package com.rodrigomoreira.app.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigomoreira.app.domain.Person;

public interface PersonRepository extends JpaRepository<Person, UUID> {

    Optional<Person> findPersonByRegistration(String registration);

}
