package com.example.demo.DAO;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonDao {

    Person create(Person person);

    Person findById(Long id);

    void deleteById(Long id);

    Person update(Person person);

    List<Person> findAll();
}
