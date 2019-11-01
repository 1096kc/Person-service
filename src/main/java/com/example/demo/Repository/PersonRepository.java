package com.example.demo.Repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

    Person findAllByFirstNameAndLastName(String firstName,String lastName);
}
