package com.toadsdewin.basicCrud.Services;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface
{
    @Autowired
    UserRepository userRepository;
    @Override
    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    @Override
    public UserModel saveUser(UserModel user)
    {
        if(user.getId() == null)
        {
            return userRepository.save(user);
        }
        else
        {
            return null;
        }
    }
    @Override
    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public ArrayList<UserModel> getByRol(String rol) {
        return userRepository.findByRol(rol);
    }

    @Override
    public ArrayList<UserModel>getByCountry(String country) {return userRepository.findByCountry(country);}

    @Override
    public ArrayList<UserModel> getByCareer(String career) {
        return userRepository.findByCareer(career);
    }

    @Override
    public boolean deleteUser(Long id) {
        try
        {
            userRepository.deleteById(id);
            return true;
        }catch(Exception error)
        {
            return false;
        }
    }
}