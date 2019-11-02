package com.example.demo.DAO.DAOImpl;

import com.example.demo.DAO.HotelDao;
import com.example.demo.Repository.HotelRepository;
import com.example.demo.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelDaoImpl implements HotelDao {
    @Autowired
    private HotelRepository hotelRepository;
    public Hotel create (Hotel hotel){
        return hotelRepository.save(hotel);
    }
}
