package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

public interface UserControllerInterface
{
    public UserModel saveUser(@RequestBody UserModel user);
    public ArrayList<UserModel> getAllUsers();
    public ArrayList<UserModel> getCareer(@RequestParam String career);
    public ArrayList<UserModel> getRol(@RequestParam String rol);
    public Optional<UserModel> getUserById(@PathVariable ("id")Long id);
}
