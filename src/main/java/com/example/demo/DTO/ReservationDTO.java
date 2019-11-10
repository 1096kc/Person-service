package com.example.demo.DTO;

public class ReservationDTO {

    private Long reservationId;

    private Long roomId;

    private String startDateTime;

    private String startDateTimeFormat;

    private String endDateTime;

    private String endDateTimeFormat;

    private Long uId;

    private String reservationDate;

    private String reservationDateFormat;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getStartDateTimeFormat() {
        return startDateTimeFormat;
    }

    public void setStartDateTimeFormat(String startDateTimeFormat) {
        this.startDateTimeFormat = startDateTimeFormat;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getEndDateTimeFormat() {
        return endDateTimeFormat;
    }

    public void setEndDateTimeFormat(String endDateTimeFormat) {
        this.endDateTimeFormat = endDateTimeFormat;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationDateFormat() {
        return reservationDateFormat;
    }

    public void setReservationDateFormat(String reservationDateFormat) {
        this.reservationDateFormat = reservationDateFormat;
    }
}
