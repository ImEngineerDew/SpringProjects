package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import com.toadsdewin.basicCRUDH2.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/personCRUD")
public class PersonController implements PersonControllerInterface
{
    @Autowired
    PersonService personService;

    @Override
    public ResponseEntity<ArrayList<Person>> getUsers()
    {
        ArrayList<Person> userFindAll = null;
        try
        {
            userFindAll = this.personService.getAllUsers();
            return new ResponseEntity<>(userFindAll,HttpStatus.FOUND);
        }
        catch(Exception error)
        {
            error.getMessage();
            return new ResponseEntity<>(userFindAll,HttpStatus.NOT_FOUND);
        }
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
}
