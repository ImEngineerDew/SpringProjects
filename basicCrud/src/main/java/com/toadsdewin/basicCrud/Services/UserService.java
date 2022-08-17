package com.toadsdewin.basicCrud.Services;

import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

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
    public Optional<UserModel> getById(Long id)
    {
        return userRepository.findById(id);
    }
    public ArrayList<UserModel>getByRol(String rol)
    {
        return userRepository.findByRol(rol);
    }
    public ArrayList<UserModel>getByCareer(String career)
    {
        return userRepository.findByCareer(career);
    }
    public boolean deleteUser(Long id)
    {
        try {
            userRepository.deleteById(id);
            return true;

        }catch(Exception error)
        {
            return false;
        }
    }
}