package com.toadsdewin.basicCrud.Controllers;

import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/test")
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping(path = "/add")
    public UserModel saveUser(@RequestBody UserModel user)
    {
        return this.userService.saveUser(user);
    }
    @GetMapping (path = "/all")
    public ArrayList<UserModel>getAllUsers()
    {
        return userService.getUsers();
    }
    /**
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String surname)
    {
        UserModel newUser = new UserModel();
        newUser.setName(name);
        newUser.setSurname(surname);
        newUser.setEmail(email);

        userRepository.save(newUser);

        return "The user has been saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserModel>getAllUsers()
    {
        return userRepository.findAll();
    }
    **/
}
