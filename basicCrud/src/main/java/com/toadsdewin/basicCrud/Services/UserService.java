package com.toadsdewin.basicCrud.Services;

import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public interface UserService {


    public ArrayList<UserModel>getUsers();
    public UserModel saveUser(UserModel user);
    public Optional<UserModel> getById(Long id);
    public ArrayList<UserModel>getByRol(String rol);
    public ArrayList<UserModel>getByCareer(String career);
    public boolean deleteUser(Long id);

}
