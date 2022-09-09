package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/basicCRUD")
public class UserController implements UserControllerInterface
{
    @Autowired
    UserServiceInterface userServiceInterface;

    /*GET METHOD*/
    @GetMapping
    public ResponseEntity<String>messageMethod()
    {
        return ResponseEntity.ok("Prueba superada");
    }
    /*A Response entity is a polite path for getting an answer*/

    /*POST METHOD*/
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
    @Override
    public UserModel upgradeUser(UserModel user, Long id)
    {
       return this.userServiceInterface.upgradeUser(user);
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
    /*This linecode can find the user by career */
    @Override
    public ArrayList<UserModel> getCareer(String career) {
        return this.userServiceInterface.getByCareer(career);
    }
    public ResponseEntity<ArrayList<UserModel>> getCountry(String country) {
        ArrayList<UserModel> nameCountry = null;
        try {
            nameCountry = this.userServiceInterface.getByCountry(country);
        }
        catch(Exception error)
        {
            error.getMessage();
        }
      return new ResponseEntity<>(nameCountry,HttpStatus.OK);
    }
    @Override
    public ArrayList<UserModel> getRol(String rol)
    {
        return this.userServiceInterface.getByRol(rol);
    }
    /*This linecode can find the user by id*/
    @Override
    public Optional<UserModel> getUserById(Long id) {
        return this.userServiceInterface.getById(id);
    }
    /*This linecode might delete the user by id*/
    @Override
    public ResponseEntity<String> deleteById(Long id)
    {
       boolean ok = this.userServiceInterface.deleteUser(id);
        if(ok)
        {
            return new ResponseEntity<>("The user has been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>("The user hasn't been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
    }
}