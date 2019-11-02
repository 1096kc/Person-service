package com.example.demo.Controller;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.DTO.PersonDTO;
import com.example.demo.Marsheller.HotelMarshaller;
import com.example.demo.Service.HotelService;
import com.example.demo.model.Hotel;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
@CrossOrigin
@Component


public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private HotelMarshaller hotelMarshaller;

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)

    public HotelDTO create(@RequestBody HotelDTO dto) {
        Hotel hotel = hotelMarshaller.convertToModel(dto);

        hotel = hotelService.addHotel(hotel);

        return hotelMarshaller.convertToDTO(hotel);
    }


}
