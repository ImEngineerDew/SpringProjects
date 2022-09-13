package com.toadsdewin.civica.Services;
import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Repository.UserRepository;
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
    public ArrayList<UserModel> getByGender(String gender) {
        return userRepository.findByGender(gender);
    }

    @Override
    public ArrayList<UserModel> getByCity(String city) {
        return userRepository.findByCity(city);
    }

    @Override
    public ArrayList<UserModel> getFullName(String fullName) {
        return null;
    }

    @Override
    public UserModel saveUser(UserModel user) {
        return null;
    }

    @Override
    public Optional<UserModel> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserModel> getByAge(Integer age) {
        return Optional.empty();
    }

    @Override
    public boolean eraseUser(Long id) {
        return false;
    }
}
