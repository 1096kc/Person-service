package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rId;

    private Long hId;

    private int capacity;

    private String roomType;

    private int roomNumber;

    private Double price;

    private String status;

    @Override
    public String toString() {
        return "Room{" +
                "rId=" + rId +
                ", capacity=" + capacity +
                ", roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return capacity == room.capacity &&
                roomNumber == room.roomNumber &&
                Objects.equals(rId, room.rId) &&
                Objects.equals(roomType, room.roomType) &&
                Objects.equals(price, room.price) &&
                Objects.equals(status, room.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rId, capacity, roomType, roomNumber, price, status);
    }

    public Long getrId() {

        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long gethId() {
        return hId;
    }

    public void sethId(Long hId) {
        this.hId = hId;
    }
}
