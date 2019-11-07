package com.example.demo.Service;

import com.example.demo.model.Hotel;

import java.util.List;

public interface HotelService {
    Hotel addHotel(Hotel hotel);
    List<Hotel> findHotelWithPriceInterval(Integer lowerBound, Integer upperBound);
    List<Hotel> findAll();

}
