package com.example.demo.Service.ServiceImpl;


import com.example.demo.DAO.HotelDao;
import com.example.demo.Service.HotelService;
import com.example.demo.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;
    public Hotel addHotel(Hotel hotel){
        return hotelDao.create(hotel);
    }

}
