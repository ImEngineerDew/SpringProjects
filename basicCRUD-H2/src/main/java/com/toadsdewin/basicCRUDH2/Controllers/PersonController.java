package com.toadsdewin.basicCRUDH2.Controllers;
import com.toadsdewin.basicCRUDH2.Models.Person;
import com.toadsdewin.basicCRUDH2.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        ArrayList<Person> findPerson = null;

        if(findPerson!=null)
        {
            findPerson = this.personService.getAllUsers();
            return new ResponseEntity<>(findPerson, HttpStatus.FOUND);
        }
        else
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
}
