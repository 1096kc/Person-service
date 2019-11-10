package com.example.demo.Marshaller.MarshellarImpl;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Marshaller.UserMarshaller;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMarshallerImpl implements UserMarshaller{


    @Override
    public User convertToModel(UserDTO dto) {
        User user = new User();

        user.setuId(dto.getuId());
        user.setEmail(dto.getEmail());
        user.setFullName(dto.getFirstName() + " " +dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());

        return user;
    }

    @Override
    public UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();

        dto.setuId(user.getuId());
        dto.setEmail(user.getEmail());

        String fullName = user.getFullName();
        String[] names = fullName.split(" ");

        dto.setFirstName(names[0]);
        dto.setLastName(names[1]);
        dto.setEmail(user.getEmail());
        dto.setUserName(user.getUserName());
        dto.setPassword(user.getPassword());

        return dto;
    }
}
