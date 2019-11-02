package com.example.demo.Service.ServiceImpl;

import com.example.demo.DAO.PersonDao;
import com.example.demo.Service.PersonService;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person create(Person person) {
        return  personDao.create(person);
    }

    @Override
    public Person findById(Long id) {
        return personDao.findById(id);
    }

    @Override
    public Person update(Person person) {
        return personDao.update(person);
    }

    @Override
    public void delete(Long id) {
        personDao.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
