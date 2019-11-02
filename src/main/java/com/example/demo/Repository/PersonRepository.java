package com.example.demo.Repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {

    Person findAllByFirstNameAndLastName(String firstName,String lastName);

    List<Person> findAll();
}
