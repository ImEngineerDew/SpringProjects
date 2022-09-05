package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
public interface UserControllerInterface
{
    @PostMapping(path = "/add")
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user);
    @GetMapping(path = "/all")
    public ResponseEntity<ArrayList<UserModel>> getAllUsers();
    @RequestMapping(value ="/query",params = "career")
    public ArrayList<UserModel> getCareer(@RequestParam String career);
    @RequestMapping(value ="/query",params = "rol")
    public ArrayList<UserModel> getRol(@RequestParam String rol);
    @RequestMapping(value = "/query",params = "country")
    public ResponseEntity<ArrayList<UserModel>>getCountry(@RequestParam String country);
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable ("id")Long id);
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById (@PathVariable("id")Long id);
}