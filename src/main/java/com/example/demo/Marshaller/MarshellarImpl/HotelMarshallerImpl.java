package com.example.demo.Marshaller.MarshellarImpl;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.Marshaller.HotelMarshaller;
import com.example.demo.model.Hotel;
import org.springframework.stereotype.Component;

@Component
public class HotelMarshallerImpl implements HotelMarshaller {
    @Override
    public Hotel convertToModel(HotelDTO dto) {
        Hotel hotel = new Hotel();

        hotel.sethId(dto.gethId());
        hotel.setHotelName(dto.getHotelName());
        hotel.setBrand(dto.getBrand());
        hotel.setAddress(dto.getAddress());
        hotel.setCity(dto.getCity());
        hotel.setState(dto.getState());

        return hotel;
    }

    @Override
    public HotelDTO convertToDTO(Hotel hotel) {
        HotelDTO dto = new HotelDTO();

        dto.sethId(hotel.gethId());
        dto.setHotelName(hotel.getHotelName());
        dto.setBrand(hotel.getBrand());
        dto.setAddress(hotel.getAddress());
        dto.setCity(dto.getCity());
        dto.setState(dto.getState());

        return dto;
    }
}
