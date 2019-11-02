package com.example.demo.Repository;

import com.example.demo.model.Hotel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository<Hotel, Long> {
    List<Hotel> findAllByRemainRoom(Integer remainRoom);
}
