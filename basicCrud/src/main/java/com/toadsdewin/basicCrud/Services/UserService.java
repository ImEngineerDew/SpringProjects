package com.toadsdewin.basicCrud.Services;

import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers()
    {
        return (ArrayList<UserModel>)userRepository.findAll();
    }
    public UserModel saveUser(UserModel user)
    {
        return userRepository.save(user);
    }
}
