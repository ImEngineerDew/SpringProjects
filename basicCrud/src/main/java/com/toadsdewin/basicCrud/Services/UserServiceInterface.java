package com.toadsdewin.basicCrud.Services;
import com.toadsdewin.basicCrud.Models.UserModel;

import java.util.ArrayList;
import java.util.Optional;


public interface UserServiceInterface {
    public ArrayList<UserModel>getUsers();
    public UserModel saveUser(UserModel user);
    public UserModel upgradeUser(UserModel user);
    public Optional<UserModel> getById(Long id);
    public ArrayList<UserModel> getByCountry(String country);
    public ArrayList<UserModel>getByRol(String rol);
    public ArrayList<UserModel>getByCareer(String career);
    public boolean deleteUser(Long id);
}