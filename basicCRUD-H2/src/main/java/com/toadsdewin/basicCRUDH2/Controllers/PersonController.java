package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import com.toadsdewin.basicCRUDH2.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/personCRUD")
public class PersonController implements PersonControllerInterface
{
    @Autowired
    PersonService personService;

    @GetMapping("/message")
    public ResponseEntity<String>messageTesting()
    {
        return new ResponseEntity<>("Prueba superada",HttpStatus.OK);
    }
    @Override
    public ResponseEntity<ArrayList<Person>> getUsers()
    {
        ArrayList<Person> userFindAll;
        try
        {
            userFindAll = this.personService.getAllUsers();

            if (userFindAll.isEmpty())
            {
                System.out.println("Doesn't exist users yet!");
                return new ResponseEntity<>(userFindAll,HttpStatus.NOT_FOUND);
            }
            else
            {
                return new ResponseEntity<>(userFindAll,HttpStatus.FOUND);
            }
        }
        catch(Exception error)
        {
            error.getMessage();
            return null;
        }
    }
    @Override
    public ResponseEntity<?> getUserById(@PathVariable("id")Long id) {

        Person personIsExist = null;
        Map<String, Object> response = new HashMap<>();

        try
        {
            personIsExist = personService.getById(id);
        }
        catch(DataAccessException error)
        {
            response.put("Message", "DB doesn't exist yet!");
            response.put("error", error.getMessage().concat(": ").concat(error.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(personIsExist==null)
        {
            response.put("Message", "The person ID: ".concat(id.toString().concat(" doesn't exist in the database!")));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personIsExist,HttpStatus.OK);
    }
    @Override
    public ResponseEntity<Person>savePerson(@RequestBody Person person)
    {
        Person userSaved = null;
        try {
            userSaved = this.personService.saveUser(person);
        }
        catch(Exception error)
        {
            error.getMessage();
        }
        return new ResponseEntity<>(userSaved,HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<String> deleteById(Long id) {
        boolean ok = this.personService.deleteUser(id);
        if(ok)
        {
            return new ResponseEntity<>("The user has been eliminated with the previous id: "+id,HttpStatus.GONE);
        }
        else{
            return new ResponseEntity<>("The user hasn't been eliminated with the previous id: "+id,HttpStatus.BAD_REQUEST);
        }
    }
    @Override
    public ResponseEntity<ArrayList<Person>> findByPhone(Long phone)
    {
        this.personService.findByPhone(phone);
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
    @Override
    public ResponseEntity<ArrayList<Person>> findByEmail(String email)
    {
        this.personService.findByEmail(email);
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}