package com.example.demo.Marshaller.MarshellarImpl;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.Marshaller.ReservationMarshaller;
import com.example.demo.Util.Constants;
import com.example.demo.Util.TemporalUtilities;
import com.example.demo.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationMarshallerImpl implements ReservationMarshaller{

    @Autowired
    private TemporalUtilities util;

    @Override
    public Reservation convertToModel(ReservationDTO dto) {
        Reservation reservation = new Reservation();

        reservation.setReservationId(dto.getReservationId());
        reservation.setuId(dto.getuId());
        reservation.setRoomId(dto.getRoomId());
        reservation.setReservationDate(util.parseDateTimeToLong(
                dto.getReservationDate(),
                dto.getReservationDateFormat()));
        reservation.setStartDateTime(util.getStartOfDate(
                dto.getStartDateTime(),
                dto.getStartDateTimeFormat()
        ));
        reservation.setEndDateTime(util.getEndOfDate(
                dto.getEndDateTime(),
                dto.getEndDateTimeFormat()
        ));
        return null;
    }

    @Override
    public ReservationDTO convertToDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();

        dto.setReservationId(reservation.getReservationId());
        dto.setRoomId(reservation.getRoomId());
        dto.setuId(reservation.getuId());

        dto.setReservationDate(util.parseDateToString(reservation.getReservationDate()));
        dto.setReservationDateFormat(Constants.DEFAULT_DATE_FORMAT);

        dto.setReservationDate(util.parseDateToString(reservation.getReservationDate()));
        dto.setReservationDateFormat(Constants.DEFAULT_DATE_FORMAT);

        dto.setReservationDate(util.parseDateToString(reservation.getReservationDate()));
        dto.setReservationDateFormat(Constants.DEFAULT_DATE_FORMAT);

        return dto;
    }
}
