package com.toadsdewin.basicCrud.UserController;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import com.toadsdewin.basicCrud.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/basicCrud")
public class UserController implements UserControllerInterface{

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getTest()
    {
        return "home";
    }

    @Override
    public ResponseEntity<String> messageTest() {
        return ResponseEntity.status(HttpStatus.OK).body("Test successful");
    }
    @Override
    public ResponseEntity<?> getAllUsers() {
        List<UserModel> allUsers = this.userService.getAllUsers();
        boolean isAvailable = allUsers.isEmpty();

        if(isAvailable==true)
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
        UserModel userId = this.userService.getById(id);
        boolean isAvailable = false;
        if(isAvailable)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ths id doesn't exist!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(userId);
        }
    }
    @Override
    public ResponseEntity<Object>getCountry(String country)
    {
        List<UserModel> countryAvailable = this.userService.getByCountry(country);
        boolean isExist = countryAvailable.isEmpty();

        if(isExist==true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country doesn't exist!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(countryAvailable);
        }
    }
    @Override
    public ResponseEntity<Object>getName(String name)
    {
        List<UserModel> nameAvailable = this.userService.getByName(name);
        boolean isExist = nameAvailable.isEmpty();

        if(isExist == true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(nameAvailable);
        }
    }
    @Override
    public ResponseEntity<Object>getSurname(String surname)
    {
        List<UserModel> surnameAvailable = this.userService.getBySurname(surname);
        boolean isExist = surnameAvailable.isEmpty();

        if(isExist == true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Surname doesn't exist in the list");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(surnameAvailable);
        }
    }
    @Override
    public ResponseEntity<Object> getOccupation(String occupation)
    {
        List<UserModel> occupationAvailable = this.userService.getByOccupation(occupation);
        boolean isExist = occupationAvailable.isEmpty();

        if(isExist==true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Occupation not found!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(occupationAvailable);
        }
    }
    @Override
    public ResponseEntity<Object>getAge(Integer age)
    {
        List<UserModel> ageAvailable = this.userService.getByAge(age);
        boolean isExist = ageAvailable.isEmpty();

        if(isExist == true)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Age not found!");
        }
        else
        {
            return ResponseEntity.status(HttpStatus.OK).body(ageAvailable);
        }
    }
    @Override
    public ResponseEntity<UserModel> saveUser(UserModel user) {
        UserModel userSaved = this.userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
    }

    @Override
    public ResponseEntity<UserModel> upgradeUser(UserModel user, Long id) {
        UserModel userUpgraded = this.userService.upgradeUser(user,id);
        return ResponseEntity.status(HttpStatus.OK).body(userUpgraded);
    }

    @Override
    public ResponseEntity<String> deleteUserById(Long id) {
        boolean isErased = this.userService.deleteUserById(id);

        if(isErased)
        {
            return ResponseEntity.status(HttpStatus.GONE).body("The element has been removed by id: "+id);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The element hasn't been removed by id: "+id);
        }
    }
}