package com.toadsdewin.basicCrud.UserController;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import com.toadsdewin.basicCrud.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/basicCrud")
public class UserController implements UserControllerInterface
{
    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> answerTest() {
        return ResponseEntity.status(HttpStatus.OK).body("Test successful!");
    }

    @Override
    public ResponseEntity<?> getAllUsers() {
        List<UserModel> allUsers = this.userService.getAllUsers();
        boolean isEmpty = allUsers.isEmpty();

        if(isEmpty==true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing to found here!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(allUsers);
        }
    }

    @Override
    public ResponseEntity<?> getUserById(Long id) {
       UserModel userExistById = this.userService.getById(id);
       boolean isExist = true;

       if(isExist == false)
       {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found by id");
       }
       else
       {
           return ResponseEntity.status(HttpStatus.OK).body(userExistById);
       }
    }

    @Override
    public ResponseEntity<UserModel> saveUser(UserModel user) {
        return null;
    }

    @Override
    public ResponseEntity<UserModel> upgradeUser(UserModel user, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> eraseUser(Long id) {
        return null;
    }
}
