package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

public interface PersonControllerInterface
{
    @GetMapping(path = "/all")
    public ResponseEntity<ArrayList<Person>> getUsers();
    @GetMapping(path="/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Long id);
    @PostMapping(path = "/add")
    public ResponseEntity<Person> savePerson(@Valid @RequestBody Person person);
    @PutMapping(path ="/add/{id}")
    public Person upgradePerson(@Valid @RequestBody Person person,  @Valid @RequestBody @PathVariable("id") Long id);
    @DeleteMapping(path="/{id}")
    public ResponseEntity<String>deleteById(@PathVariable("id") Long id);
    @RequestMapping(value = "/query", params = "phone")
    public ArrayList<Person> findByPhone(@RequestParam Long phone);
    @RequestMapping(value = "/query", params = "email")
    public ArrayList<Person> findByEmail(@RequestParam String email);
    @RequestMapping(value = "/query", params= "country")
    public ResponseEntity<ArrayList<Person>> findByCountry(@RequestParam String country);

}
