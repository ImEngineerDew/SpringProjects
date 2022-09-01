package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

public interface UserControllerInterface
{
    @PostMapping(path = "/add")
    public UserModel saveUser(@RequestBody UserModel user);
    @GetMapping(path = "/all")
    public ArrayList<UserModel> getAllUsers();
    @RequestMapping(value ="/query",params = "career")
    public ArrayList<UserModel> getCareer(@RequestParam String career);
    @RequestMapping(value ="/query",params = "rol")
    public ArrayList<UserModel> getRol(@RequestParam String rol);
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable ("id")Long id);
}
