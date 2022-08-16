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
    @GetMapping (path = "/all")
    public ArrayList<UserModel>getAllUsers()
    {
        return userService.getUsers();
    }
    @GetMapping(path= "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id)
    {
        return this.userService.getById(id);
    }

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
