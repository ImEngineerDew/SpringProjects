package com.toadsdewin.basicCrud.Controllers;
import com.toadsdewin.basicCrud.Models.UserModel;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface UserControllerInterface
{
    @PostMapping(path = "/add")
    public ResponseEntity<UserModel> saveUser(@Valid @RequestBody UserModel user);
    @PutMapping(path = "/add/{id}")
    public ResponseEntity<UserModel> upgradeUser(@Valid @RequestBody UserModel user, @Valid @PathVariable("id")Long id );
    @GetMapping(path = "/all")
    public ResponseEntity<?> getAllUsers();
    @RequestMapping(value ="/query",params = "career")
    public ResponseEntity<Object> getCareer(@RequestParam String career);
    @RequestMapping(value ="/query",params = "rol")
    public ResponseEntity<Object> getRol(@RequestParam String rol);
    @RequestMapping(value = "/query",params = "country")
    public ResponseEntity<Object> getCountry(@RequestParam String country);
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getUserById(@PathVariable ("id")Long id);
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteById (@PathVariable("id")Long id);
}