package com.toadsdewin.civica.Controllers;

import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Map<String,String>> saveUsers(@Valid @RequestBody UserModel user)
    {
        Map<String,String> answer  = new HashMap<>();

        UserModel us = this.userService.findByUserName(user.getFullName());
        if(us.getID()== null)
        {
            this.userService.save(user);
            answer.put("Message","The user has been introduced properly");
        }
        else
        {
            answer.put("Message","The user already exist");
        }
        return ResponseEntity.ok(answer);
    }
}
