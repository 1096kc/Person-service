package com.example.demo.Marshaller;


import com.example.demo.DTO.UserDTO;
import com.example.demo.model.User;

public interface UserMarshaller {

    User convertToModel(UserDTO dto);

    UserDTO convertToDTO(User user);
}
