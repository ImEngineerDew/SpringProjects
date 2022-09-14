package com.toadsdewin.civica.Controllers;

import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/testing")
    public ResponseEntity<String>messageTest()
    {
        return new ResponseEntity<>("Testing sucesfull", HttpStatus.OK);
    }
}
