package com.example.demo.Marsheller.MarshellerImpl;

import com.example.demo.DTO.HotelDTO;
import com.example.demo.Marsheller.HotelMarshaller;
import com.example.demo.model.Hotel;
import org.springframework.stereotype.Component;

@Component
public class HotelMarshallerImpl implements HotelMarshaller {

    @Override
    public Hotel convertToModel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        hotel.setId(hotelDTO.getId());
        String nameAndBrand = hotelDTO.getNameWithBrand();
        String[] arr = nameAndBrand.split(",");

        hotel.setBrand(arr[0]);
        hotel.setHotelnName(arr[1]);
        hotel.setPrice(hotelDTO.getPrice());
        hotel.setTotalRoom(hotelDTO.getTotalRoom());
        hotel.setRemainRoom(hotelDTO.getRemainRoom());

        return hotel;
    }

    @Override
    public HotelDTO convertToDTO(Hotel hotel) {


        HotelDTO hotelDTO = new HotelDTO();
        hotelDTO.setId(hotel.getId());
        String nameAndBrand = hotel.getBrand()+","+hotel.getHotelName();
        hotelDTO.setNameWithBrand(nameAndBrand);
        hotelDTO.setPrice(hotel.getPrice());
        hotelDTO.setRemainRoom(hotel.getRemainRoom());
        hotelDTO.setTotalRoom(hotel.getTotalRoom());

        return hotelDTO;

    }
}
