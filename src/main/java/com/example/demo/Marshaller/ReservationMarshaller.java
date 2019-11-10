package com.example.demo.Marshaller;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.model.Reservation;

public interface ReservationMarshaller {
    Reservation convertToModel(ReservationDTO dto);

    ReservationDTO convertToDTO(Reservation reservation);
}
