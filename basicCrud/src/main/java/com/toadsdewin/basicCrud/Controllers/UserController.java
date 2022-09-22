package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/basicCRUD")
public class UserController implements UserControllerInterface
{
    @Autowired
    UserServiceInterface userServiceInterface;

    /**GET METHOD**/
    @GetMapping
    public ResponseEntity<String>messageMethod()
    {
        return ResponseEntity.ok("Test successful");
    }
    /*A Response entity is a polite path for getting an answer*/

    /**POST METHOD**/
    @Override
    public ResponseEntity<UserModel> saveUser(UserModel user)
    {
        UserModel userSaved = null;
        try {
            userSaved = this.userServiceInterface.saveUser(user);
        }
        catch(Exception error)
        {
            error.getMessage();
        }
        return new ResponseEntity<>(userSaved,HttpStatus.CREATED);
    }
    /**UPGRADE METHOD OR PUT METHOD**/
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public UserModel upgradeUser(UserModel user,Long id)
    {
        return userServiceInterface.upgradeUser(user,id);
    }
    @Override
    public ResponseEntity<ArrayList<UserModel>>getAllUsers()
    {
        ArrayList<UserModel> allUsers = null;
        try {
            allUsers = this.userServiceInterface.getUsers();
        }
        catch (Exception error)
        {
            error.getMessage();
        }
        return new ResponseEntity<>(allUsers,HttpStatus.FOUND);
    }
    /*This line code can find the user by career */
    @Override
    public ArrayList<UserModel> getCareer(String career) {
        return this.userServiceInterface.getByCareer(career);
    }
    @RequestMapping(value = "/query",params = "country")
    public ResponseEntity<?> getCountry(@RequestParam String country)
    {
        UserModel userCountry = null;

        Map<String,Object> answer = new HashMap<>();
        try {
            userCountry = this.userServiceInterface.getByCountry(country);
        }
        catch(DataAccessException error)
        {
            answer.put("Message", "DB doesn't exist yet!");
            answer.put("error", error.getMessage().concat(": ").concat(error.getMostSpecificCause().getMessage()));
        }
        if(userCountry==null)
        {
            answer.put("Message: ",country+", doesn't exist in the user list!");
            return new ResponseEntity<>(answer,HttpStatus.NOT_FOUND);
        }
        answer.put("List of users from: ",country);
        return new ResponseEntity<>(userCountry,HttpStatus.FOUND);
    }
    @Override
    public ResponseEntity<?> getRol(String rol) {
        UserModel userRol = null;
        Map<String, Object> answer = new HashMap<>();

        try {
            userRol = this.userServiceInterface.getByRol(rol);
        } catch (DataAccessException error) {
            answer.put("Message", "DB doesn't exist yet!");
            answer.put("error", error.getMessage().concat(": ").concat(error.getMostSpecificCause().getMessage()));
        }
        if (userRol == null) {
            answer.put("Message: ", "The rol: "+rol+", doesn't exist yet!");
            return new ResponseEntity<>(answer, HttpStatus.NOT_FOUND);
        }
        answer.put("List of users that contains the rol: ",rol);
        return new ResponseEntity<>(userRol,HttpStatus.FOUND);
    }
    /*This line code can find the user by id*/
    @Override
    public ResponseEntity<?> getUserById(@PathVariable("id") Long id)
    {
        UserModel userExist = null;
        Map<String,Object> response = new HashMap<>();

        try
        {
            userExist = userServiceInterface.getById(id);
        }
        catch(DataAccessException error)
        {
            response.put("Message", "DB doesn't exist yet!");
            response.put("error", error.getMessage().concat(": ").concat(error.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if(userExist == null)
        {
            response.put("Message", "The person ID: ".concat(id.toString().concat(" doesn't exist in the database!")));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userExist,HttpStatus.OK);
    }
    /*This line code might delete the user by id*/
    @Override
    public ResponseEntity<String> deleteById(Long id)
    {
        boolean ok = this.userServiceInterface.deleteUser(id);
        if(ok)
        {
            return new ResponseEntity<>("The user has been eliminated with the previous id: "+id,HttpStatus.GONE);
        }
        else{
            return new ResponseEntity<>("The user hasn't been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
    }
}