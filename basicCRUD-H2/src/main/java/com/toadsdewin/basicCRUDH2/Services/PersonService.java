package com.toadsdewin.basicCRUDH2.Services;
import com.toadsdewin.basicCRUDH2.Models.Person;
import com.toadsdewin.basicCRUDH2.Repositories.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonService implements PersonServiceInterface
{
    @Autowired
    PersonInterface personInterface;

    @Override
    public ArrayList<Person> getAllUsers() {
        return (ArrayList<Person>) personInterface.findAll();
    }
    @Override
    public Person saveUser(Person user) {
        return personInterface.save(user);
    }

    @Override
    public Person upgradeUser(Person user, Long id) {
        return null;
    }

    @Override
    public Optional<Person> getById(Long id) {
        return personInterface.findById(id);
    }
    @Override
    public ArrayList<Person> findByEmail(String email) {
        return personInterface.findByEmail(email);
    }
    @Override
    public ArrayList<Person> findByPhone(Integer phone) {
        return personInterface.findByPhone(phone);
    }
    @Override
    public boolean deleteUser(Long id) {
        return false;
    }
}
