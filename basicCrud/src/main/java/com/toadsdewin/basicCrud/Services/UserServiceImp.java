package com.toadsdewin.basicCrud.Services;

import com.toadsdewin.basicCrud.Models.UserModel;

import java.util.ArrayList;
import java.util.Optional;

public class UserServiceImp implements UserService{
    @Override
    public ArrayList<UserModel> getUsers() {
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
    public ArrayList<UserModel> getByRol(String rol) {
        return null;
    }

    @Override
    public ArrayList<UserModel> getByCareer(String career) {
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }
}
