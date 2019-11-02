package com.example.demo.DTO;

import java.util.Objects;

public class HotelDTO {
    private Long id;
    private String nameWithBrand;
    private Integer price;
    private Integer totalRoom;
    private Integer remainRoom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameWithBrand() {
        return nameWithBrand;
    }

    public void setNameWithBrand(String nameWithBrand) {
        this.nameWithBrand = nameWithBrand;
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
        HotelDTO hotelDTO = (HotelDTO) o;
        return Objects.equals(id, hotelDTO.id) &&
                Objects.equals(nameWithBrand, hotelDTO.nameWithBrand) &&
                Objects.equals(price, hotelDTO.price) &&
                Objects.equals(totalRoom, hotelDTO.totalRoom) &&
                Objects.equals(remainRoom, hotelDTO.remainRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameWithBrand, price, totalRoom, remainRoom);
    }


    @Override
    public String toString() {
        return "HotelDTO{" +
                "id=" + id +
                ", nameWithBrand='" + nameWithBrand + '\'' +
                ", price=" + price +
                ", totalRoom=" + totalRoom +
                ", remainRoom=" + remainRoom +
                '}';
    }
}
