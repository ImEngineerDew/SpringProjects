package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface PersonControllerInterface
{
    @GetMapping(path = "/all")
    public ResponseEntity<ArrayList<Person>> getUsers();
    @PostMapping(path = "/add")
    public ResponseEntity<Person> savePerson(@RequestBody Person person);

}
