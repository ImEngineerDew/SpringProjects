package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public interface PersonControllerInterface
{
    @GetMapping(path = "/all")
    public ResponseEntity<ArrayList<Person>> getUsers();
    @GetMapping(path="/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Long id);
    @PostMapping(path = "/add")
    public ResponseEntity<Person> savePerson(@RequestBody Person person);
    @DeleteMapping(path="/{id}")
    public ResponseEntity<String>deleteById(@PathVariable("id") Long id);
    @RequestMapping(value = "/query", params = "phone")
    public ResponseEntity<ArrayList<Person>> findByPhone(@RequestParam Long phone);
    @RequestMapping(value = "/query", params = "email")
    public ResponseEntity<ArrayList<Person>> findByEmail(@RequestParam String email);
    @RequestMapping(value = "/query", params= "country")
    public ResponseEntity<ArrayList<Person>> findByCountry(@RequestParam String country);

}
