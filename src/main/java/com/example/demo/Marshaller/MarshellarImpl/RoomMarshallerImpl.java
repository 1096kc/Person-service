package com.example.demo.Marshaller.MarshellarImpl;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.Marshaller.RoomMarshaller;
import com.example.demo.model.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMarshallerImpl implements RoomMarshaller{
    @Override
    public Room convertToModel(RoomDTO dto) {
        Room room = new Room();

        room.setrId(dto.getrId());
        room.setCapacity(dto.getCapacity());
        room.setPrice(dto.getPrice());
        room.setRoomNumber(dto.getRoomNumber());
        room.setRoomType(dto.getRoomType());
        room.setStatus(dto.getStatus());
        room.sethId(dto.gethId());

        return room;
    }

    @Override
    public RoomDTO convertToDTO(Room room) {
        RoomDTO dto = new RoomDTO();


        dto.setrId(room.getrId());
        dto.setCapacity(room.getCapacity());
        dto.setPrice(room.getPrice());
        dto.setRoomNumber(room.getRoomNumber());
        dto.setRoomType(room.getRoomType());
        dto.setStatus(room.getStatus());
        dto.sethId(room.gethId());

        return dto;
    }
}
