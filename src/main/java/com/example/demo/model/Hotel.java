package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String hotelName;
    private Integer price;
    private Integer totalRoom;
    private Integer remainRoom;

    public Long getId() {
        return id;
    }

    public void setBrand(String Brand) {
        this.brand = Brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelnName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalRoom() {
        return totalRoom;
    }

    public void setTotalRoom(Integer totalRoom) {
        this.totalRoom = totalRoom;
    }

    public Integer getRemainRoom() {
        return remainRoom;
    }

    public void setRemainRoom(Integer remainRoom) {
        this.remainRoom = remainRoom;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) &&
                Objects.equals(brand, hotel.brand) &&
                Objects.equals(hotelName, hotel.hotelName) &&
                Objects.equals(price, hotel.price) &&
                Objects.equals(totalRoom, hotel.totalRoom) &&
                Objects.equals(remainRoom, hotel.remainRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, hotelName, price, totalRoom, remainRoom);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                "brand=" + brand + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", price=" + price +
                ", totalRoom=" + totalRoom +
                ", remainRoom=" + remainRoom +
                '}';
    }
}
