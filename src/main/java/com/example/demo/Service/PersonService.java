package com.example.demo.Service;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonService {

    Person create(Person person);

    Person findById(Long id);

    Person update(Person person);

    void delete(Long id);

    List<Person> findAll();

    Person login(String userName, String password);
}
