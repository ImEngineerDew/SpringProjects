package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Services.UserServiceInterface;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/basicCRUD")
public class UserController implements UserControllerInterface
{
    @Autowired
    UserServiceInterface userServiceInterface;

    /**GET METHOD**/
    @GetMapping
    public ResponseEntity<String>messageMethod()
    {
        return ResponseEntity.ok("Test successful");
    }
    /*A Response entity is a polite path for getting an answer*/

    /**POST METHOD**/
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
    /**UPGRADE METHOD OR PUT METHOD**/
    @Override
    public ResponseEntity<UserModel> upgradeUser(UserModel user,Long id)
    {
        UserModel userUpgraded =  this.userServiceInterface.upgradeUser(user,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(userUpgraded);
    }
    /**Checking if the database exists or not**/
    @Override
    public ResponseEntity<?>getAllUsers()
    {
        ArrayList<UserModel> allUsers = this.userServiceInterface.getUsers();
        boolean checkedUsers = allUsers.isEmpty();

        if(checkedUsers==true)
        {
            System.out.println("The list is empty: ?"+checkedUsers);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nothing to found here!");
        }
        else {
            System.out.println(checkedUsers);
            return ResponseEntity.status(HttpStatus.OK).body(allUsers);
        }
    }
    /**This codeline can get a specific country from the database**/
    @Override
    public ResponseEntity<Object> getCountry(String country)
    {
        List<UserModel> userCountry  = this.userServiceInterface.getByCountry(country);
        boolean checkCountry = userCountry.isEmpty();

        if(checkCountry== false) {
            System.out.println(country+": "+checkCountry);
            return ResponseEntity.status(HttpStatus.OK).body(userCountry);
        }
        else {
            System.out.println(country+": "+checkCountry);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country doesn't in the list!");
        }
    }
    /**This codeline might get a specific career from the database**/
    @Override
    public ResponseEntity<Object> getCareer(String career)
    {
        List<UserModel> userCareer = this.userServiceInterface.getByCareer(career);
        boolean checkCareer = userCareer.isEmpty();

        if(checkCareer==false)
        {
            System.out.println(career+": "+checkCareer);
            return ResponseEntity.status(HttpStatus.OK).body(userCareer);
        }
        else
        {
            System.out.println(career+": "+checkCareer);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Career doesn't exist in the list!");
        }
    }
    /**This codeline can get a rol on this db**/
    @Override
    public ResponseEntity<Object> getRol(String rol)
    {
       List<UserModel> userRol = this.userServiceInterface.getByRol(rol);
       boolean checkedRol = userRol.isEmpty();

       if(checkedRol==false)
       {
           return ResponseEntity.status(HttpStatus.OK).body(userRol);
       }
       else
       {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Rol not found!");
       }
    }
    /**This line code can find the user by id**/
    @Override
    public ResponseEntity<?> getUserById(Long id)
    {
        UserModel userExist = null;
        Map<String,Object> response = new HashMap<>();
        try
        {
            userExist = userServiceInterface.getById(id);
        }
        catch(DataAccessException error)
        {
            response.put("Message", "DB doesn't exist yet!");
            response.put("error", error.getMessage().concat(": ").concat(error.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(userExist == null)
        {
            response.put("Message", "The person ID: ".concat(id.toString().concat(" doesn't exist in the database!")));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userExist,HttpStatus.OK);
    }
    /**This line code might delete the user by id**/
    @Override
    public ResponseEntity<String> deleteById(Long id)
    {
        boolean ok = this.userServiceInterface.deleteUser(id);
        if(ok)
        {
            return new ResponseEntity<>("The user has been eliminated with the previous id: "+id,HttpStatus.GONE);
        }
        else{
            return new ResponseEntity<>("The user hasn't been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
    }
}