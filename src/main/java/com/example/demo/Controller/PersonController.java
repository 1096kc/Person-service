package com.example.demo.Controller;

import com.example.demo.DTO.PersonDTO;
import com.example.demo.Marsheller.PersonMarshaller;
import com.example.demo.Service.PersonService;
import com.example.demo.model.Person;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
@Component
@CrossOrigin
public class PersonController {


//mengyu wants to check some nasjfnrjfnjwndjansdje
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMarshaller marshaller;

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "This API call is used to create a new person.", response = PersonDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successfully created a person"),
            @ApiResponse(code = 404, message = "The specified person was not created"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public PersonDTO create(@RequestBody PersonDTO dto) {
        Person person = marshaller.convertToModel(dto);

        person = personService.create(person);

        return marshaller.convertTODTO(person);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ApiOperation(value = "This API call is used to retrieve a person", response = PersonDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found"),
            @ApiResponse(code = 404, message = "The specified was not found"),
            @ApiResponse(code = 400, message = "Missing required parameters"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public PersonDTO findById(@PathVariable("id") Long id) {
        Person person = personService.findById(id);

        return marshaller.convertTODTO(person);
    }

    @GetMapping(value = "/All", produces = "application/json")
    @ApiOperation(value = "This API call is used to retrieve all people", response = PersonDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found"),
            @ApiResponse(code = 404, message = "The specified was not found"),
            @ApiResponse(code = 400, message = "Missing required parameters"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public List<PersonDTO> findAll() {

        List<Person> personList = personService.findAll();
        List<PersonDTO> dtoList = new ArrayList<>();

        for(Person person : personList){
            dtoList.add(marshaller.convertTODTO(person));
        }

        return dtoList;
    }



    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "This API call is used to delete a person")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successfully deleted (no response body)"),
            @ApiResponse(code = 404, message = "The specified was not found"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public void deleteById(@PathVariable("id") Long id) {
        personService.delete(id);
    }


    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "This API call is use to update existing Equipment record", response = PersonDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Person metadata updated"),
            @ApiResponse(code = 404, message = "Unable to find Equipment"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public PersonDTO update(@PathVariable("id") Long id,
                               @RequestBody PersonDTO dto) {
       Person person = marshaller.convertToModel(dto);
       person.setId(id);
       person = personService.update(person);
       PersonDTO dtoToReturn =  marshaller.convertTODTO(person);

       return dtoToReturn;
    }

}
