package com.example.demo.DAO;

import com.example.demo.model.Hotel;

import java.util.List;

public interface HotelDao {

    Hotel create(Hotel hotel);

    List<Hotel> findAll();

    List<Hotel> findAllByPriceGraterThanEqualAndPriceLowerThanEqual(Integer lowerBound, Integer upperBound);
}
