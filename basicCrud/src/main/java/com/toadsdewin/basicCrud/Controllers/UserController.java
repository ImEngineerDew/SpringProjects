package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "/test")
public class UserController implements UserControllerInterface
{
    @Autowired
    UserServiceInterface userServiceInterface;

    @Override
    public UserModel saveUser(UserModel user) {
        return this.userServiceInterface.saveUser(user);
    }
    @Override
    public ArrayList<UserModel> getAllUsers() {
        return this.userServiceInterface.getUsers();
    }
    @Override
    public ArrayList<UserModel> getCareer(String career) {
        return this.userServiceInterface.getByCareer(career);
    }
    @Override
    public ArrayList<UserModel> getRol(String rol) {
        return this.userServiceInterface.getByRol(rol);
    }
    @Override
    public Optional<UserModel> getUserById(Long id) {
        return this.userServiceInterface.getById(id);
    }

    @Override
    public String deleteById(Long id)
    {
       boolean ok = this.userServiceInterface.deleteUser(id);
        if(ok)
        {
            return "The user has been eliminated with the previous id: "+id;
        }
        else{
            return "The user hasn't been eliminated with the previous id: "+id;
        }
    }
}
