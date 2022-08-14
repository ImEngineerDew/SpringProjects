package com.toadsdewin.basicCRUD.Controllers;
import com.toadsdewin.basicCRUD.Models.UserModel;
import com.toadsdewin.basicCRUD.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        UserModel user = new UserModel();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);

        return "User saved";
    }

    public Iterable<UserModel> getAllUsers()
    {
        return userRepository.findAll();
    }
}
