package com.toadsdewin.basicCrud.UserController;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

public interface UserControllerInterface
{
    @GetMapping(path="/all")
    public ResponseEntity<?> getAllUsers();
    @GetMapping(path="/{id}")
    public ResponseEntity<?>getUserById(@Valid @RequestBody Long id);
    @RequestMapping(value = "query", params = "country")
    public ResponseEntity<Object> getCountry(@RequestParam String country);
    @RequestMapping(value = "query", params = "name")
    public ResponseEntity<Object> getName(@RequestParam String name);
    @RequestMapping(value = "query" , params = "surname")
    public ResponseEntity<Object> getSurname(@RequestParam String surname);
    @RequestMapping (value = "query", params = "occupation")
    public ResponseEntity<Object> getOccupation(@RequestParam String occupation);
    @RequestMapping(value= "query", params = "age")
    public ResponseEntity<Object> getAge(@RequestParam Integer age);
    @RequestMapping(value = "query", params = "profession")
    public ResponseEntity<Object> getProfession(@RequestParam String profession);
    @PostMapping(path="/add")
    public ResponseEntity<UserModel>saveUser(@Valid @RequestBody UserModel user);
    @PutMapping(path="/add/{id}")
    public ResponseEntity<UserModel> upgradeUser(@Valid @RequestBody UserModel user, @Valid @RequestBody Long id);
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String>deleteUserById(@Valid @RequestParam("id")Long id);
}