package com.toadsdewin.civica.Services;
import com.toadsdewin.civica.Models.UserModel;
import java.util.ArrayList;
import java.util.Optional;

public interface UserServiceInterface
{
    public ArrayList<UserModel> getUsers();
    public ArrayList<UserModel> getByGender(String gender);
    public ArrayList<UserModel> getByCity(String city);
    public ArrayList<UserModel> getFullName(String fullName);
    public UserModel saveUser(UserModel user);
    public Optional<UserModel> getById(Long id);
    public Optional<UserModel> getByAge(Integer age);
}
