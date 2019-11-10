package com.example.demo.Repository;

import com.example.demo.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReservationRepository extends CrudRepository<Reservation,Long>{
    List<Reservation> findByUIdAndAndStartDateTimeBeforeAndEndDateTimeAfter();
}
