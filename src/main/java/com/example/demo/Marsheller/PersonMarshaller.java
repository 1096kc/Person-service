package com.example.demo.Marsheller;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.model.Person;

public interface PersonMarshaller {

    Person convertToModel(PersonDTO dto);

    PersonDTO convertTODTO(Person person);
}
