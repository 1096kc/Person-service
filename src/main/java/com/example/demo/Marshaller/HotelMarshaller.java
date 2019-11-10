package com.example.demo.Marshaller;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.model.Hotel;

public interface HotelMarshaller {

    Hotel convertToModel(HotelDTO dto);

    HotelDTO convertToDTO(Hotel hotel);
}
