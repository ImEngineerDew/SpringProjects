package com.toadsdewin.civica.Controllers;
import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/civica")
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("")
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
            return new ResponseEntity<>(allUsers, HttpStatus.NOT_FOUND);
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
    @GetMapping("/{id}")
    public Optional<UserModel>getById(@PathVariable("id")Long id)
    {
        return this.userService.getById(id);
    }
    @RequestMapping(value = "query",params = "gender")
    public ResponseEntity<ArrayList<UserModel>>getByGender(@RequestParam String gender)
    {
        try
        {
            ArrayList<UserModel>genderQuery = this.userService.getByGender(gender);
            return new ResponseEntity<>(genderQuery,HttpStatus.FOUND);
        }
        catch(Exception error)
        {
            ArrayList<UserModel>genderQuery = null;
            return new ResponseEntity<>(genderQuery,HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "query", params = "fullName")
    public ResponseEntity<ArrayList<UserModel>>getFullName(@RequestParam String fullName)
    {
        ArrayList<UserModel> queryFullName = null;

        try
        {
            queryFullName = this.userService.getFullName(fullName);
            return new ResponseEntity<>(queryFullName,HttpStatus.OK);
        }
        catch(Exception error)
        {
            queryFullName = null;
            return new ResponseEntity<>(queryFullName,HttpStatus.NO_CONTENT);
        }

    }
    @RequestMapping(value = "query", params="city")
    public ResponseEntity<ArrayList<UserModel>>getByCity(@RequestParam String city)
    {
        ArrayList<UserModel> findCity = null;

        try
        {
            findCity = this.userService.getByCity(city);
            return new ResponseEntity<>(findCity, HttpStatus.OK);
        }
        catch(Exception error)
        {
            findCity = null;
            return new ResponseEntity<>(findCity, HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id")Long id)
    {
        boolean isDeleted = this.userService.eraseUser(id);

        if(isDeleted)
        {
            return new ResponseEntity<>("The user has been eliminated with the previous id: "+id,HttpStatus.GONE);
        }
        else{
            return new ResponseEntity<>("The user hasn't been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
    }
}
