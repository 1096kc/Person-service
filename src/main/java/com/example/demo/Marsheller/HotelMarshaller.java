package com.example.demo.Marsheller;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.model.Hotel;

public interface HotelMarshaller {

    Hotel convertToModel(HotelDTO hotelDTO);
    HotelDTO convertToDTO(Hotel hotel);
}
