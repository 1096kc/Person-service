package com.example.demo.Service.ServiceImpl;


import com.example.demo.DAO.HotelDao;
import com.example.demo.Service.HotelService;
import com.example.demo.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;
    public Hotel addHotel(Hotel hotel){
        return hotelDao.create(hotel);
    }

    @Override
    public List<Hotel> findHotelWithPriceInterval(Integer lowerBound, Integer upperBound) {
        return hotelDao.findAllByPriceGraterThanEqualAndPriceLowerThanEqual(lowerBound, upperBound);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelDao.findAll();

    }

}
