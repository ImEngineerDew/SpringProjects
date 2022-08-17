package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
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
    /**This linecode extract all the users recorder on this DB**/
    @GetMapping (path = "/all")
    public ArrayList<UserModel>getAllUsers()
    {
        return userService.getUsers();
    }
    /**This linecode can find the user by id**/
    @GetMapping(path= "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id)
    {
        return this.userService.getById(id);
    }
    /**This linecode can find the user by rol**/
    @GetMapping(path= "/rol/{rol}")
    public ArrayList<UserModel>getRol(@PathVariable("rol") String rol)
    {
        return this.userService.getByRol(rol);
    }
    /**This linecode can find the user by career **/
    @GetMapping(path = "/career/{career}")
    public ArrayList<UserModel>getCareer(@PathVariable("career")String career)
    {
        return this.userService.getByCareer(career);
    }
    /**This linecode might delete the user by id**/
    @DeleteMapping(path="/{id}")
    public String deleteById(@PathVariable("id")Long id)
    {
        boolean ok = this.userService.deleteUser(id);

        if(ok)
        {
            return "The user has been eliminated with the previous id: "+id;
        }
        else{
            return "The user hasn't been eliminated with the previous id: "+id;
        }
    }
}
