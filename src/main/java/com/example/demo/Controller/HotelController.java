package com.example.demo.Controller;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.DTO.PersonDTO;
import com.example.demo.Marsheller.HotelMarshaller;
import com.example.demo.Service.HotelService;
import com.example.demo.model.Hotel;
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

    @GetMapping(value = "/price/{lowerBound}/{upperBound}", produces = "application/json")
    @ApiOperation(value = "This API call is used to find hotels in a price interval ", response = HotelDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found"),
            @ApiResponse(code = 404, message = "The specified was not found"),
            @ApiResponse(code = 400, message = "Missing required parameters"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public List<HotelDTO> findHotelWithPriceInterval(@PathVariable Integer lowerBound, @PathVariable Integer upperBound) {

        List<Hotel> hotelList = hotelService.findHotelWithPriceInterval(lowerBound, upperBound);
        List<HotelDTO> dtoList = new ArrayList<>();

        for(Hotel hotel : hotelList){
            dtoList.add(hotelMarshaller.convertToDTO(hotel));
        }

        return dtoList;
    }

    @GetMapping(value = "/all", produces = "application/json")
    @ApiOperation(value = "This API call is used to retrieve all hotels", response = HotelDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found"),
            @ApiResponse(code = 404, message = "The specified was not found"),
            @ApiResponse(code = 400, message = "Missing required parameters"),
            @ApiResponse(code = 500, message = "Service is having difficulties")
    }
    )
    public List<HotelDTO> findAll() {

        List<Hotel> hotelList = hotelService.findAll();
        List<HotelDTO> dtoList = new ArrayList<>();

        for(Hotel hotel : hotelList){
            dtoList.add(hotelMarshaller.convertToDTO(hotel));
        }

        return dtoList;
    }


}
