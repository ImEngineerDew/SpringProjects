package com.toadsdewin.basicCrud.UserController;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface UserControllerInterface
{
    @GetMapping(path="/test/")
    public ResponseEntity<String> answerTest();

    @GetMapping(path="/all")
    public ResponseEntity<?>getAllUsers();

    @GetMapping(path= "/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id")Long id);

    @PostMapping(path="/add")
    public ResponseEntity<UserModel> saveUser(@Valid @RequestBody UserModel user);

    @PutMapping(path="/add/{id}")
    public ResponseEntity<UserModel> upgradeUser(@Valid @RequestBody UserModel user, @Valid @RequestBody Long id);

    @DeleteMapping(path="/{id}")
    public ResponseEntity<String> eraseUser(@PathVariable("id")Long id);


}
