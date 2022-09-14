package com.toadsdewin.civica.Controllers;
import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/civica")
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/testing")
    public ResponseEntity<String>messageTest()
    {
        return new ResponseEntity<>("Testing sucesfull", HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<ArrayList<UserModel>>getAllUsers()
    {
        ArrayList<UserModel> allUsers = null;

        try {
            allUsers = this.userService.getUsers();
            return new ResponseEntity<>(allUsers, HttpStatus.OK);
        }
        catch(Exception error)
        {
            return new ResponseEntity<>(allUsers, HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/save")
    public ResponseEntity<UserModel> saveUser(@Valid @RequestBody UserModel user)
    {
        UserModel newUser = null;

        try {
            newUser = this.userService.saveUser(user);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        }
        catch (Exception error)
        {
            return new ResponseEntity<>(newUser,HttpStatus.NO_CONTENT);
        }
    }
}
