package com.example.demo.Marsheller.MarshellerImpl;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.Marsheller.PersonMarshaller;
import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMarshallerImpl implements PersonMarshaller {
    @Override
    public Person convertToModel(PersonDTO dto) {

        Person person = new Person();

        person.setId(dto.getId());
        person.setEmail(dto.getEmail());
        person.setScore(dto.getScore());
        String fullName = dto.getFullName();

        String[] names = fullName.split(" ");
        person.setFirstName(names[0]);
        person.setLastName(names[1]);

        return person;
    }

    @Override
    public PersonDTO convertTODTO(Person person) {
        PersonDTO dto = new PersonDTO();

        dto.setId(person.getId());
        dto.setEmail(person.getEmail());
        dto.setScore(person.getScore());
        dto.setFullName(person.getFirstName() + " " + person.getLastName());

        return dto;
    }
}
