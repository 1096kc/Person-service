package com.example.demo.DAO.DAOImpl;

import com.example.demo.DAO.PersonDao;
import com.example.demo.Repository.PersonRepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }
}
