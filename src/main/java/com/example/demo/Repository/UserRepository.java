package com.example.demo.Repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User,Long>{
    User findByUserNameAndPassword(String userName, String password);
}
