package com.example.demo.Marshaller;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.model.Room;

public interface RoomMarshaller {

    Room convertToModel(RoomDTO dto);

    RoomDTO convertToDTO(Room room);
}
