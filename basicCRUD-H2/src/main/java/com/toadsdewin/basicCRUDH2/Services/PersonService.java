package com.toadsdewin.basicCRUDH2.Services;
import com.toadsdewin.basicCRUDH2.Models.Person;
import com.toadsdewin.basicCRUDH2.Repositories.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public Person saveUser(Person person) {
        if(person.getId() == null)
        {
            return personInterface.save(person);
        }
        else
        {
            return null;
        }
    }
    @Override
    public Person upgradePerson(Person person, Long id) {
        try
        {
            Person upgrade = personInterface.findById(id).get();

            if (Objects.nonNull(person.getName()) && !"".equalsIgnoreCase(person.getName())) {
                upgrade.setName(person.getName());
            }
            if (Objects.nonNull(person.getSurname()) && !"".equalsIgnoreCase(person.getSurname())) {
                upgrade.setSurname(person.getSurname());
            }
            if (Objects.nonNull(person.getCountry()) && !"".equalsIgnoreCase(person.getCountry())) {
                upgrade.setCountry(person.getCountry());
            }
            if (Objects.nonNull(person.getEmail()) && !"".equalsIgnoreCase(person.getEmail())) {
                upgrade.setEmail(person.getEmail());
            }
            if (Objects.nonNull(person.getPhone())) {
                upgrade.setPhone(person.getPhone());
            }
                return personInterface.save(person);
        }
        catch(Exception error)
        {
            error.getMessage();
        }
        return null;
    }
    @Override
    public Person getById(Long id) {
        return personInterface.findById(id).orElse(null);
    }
    @Override
    public List<Person> findByEmail(String email) {
        return personInterface.findByEmail(email);
    }
    @Override
    public List<Person> findByPhone(Long phone) {
        return personInterface.findByPhone(phone);
    }
    @Override
    public List<Person> findByCountry(String country)
    {
        return personInterface.findByCountry(country);
    }

    @Override
    public boolean deleteUser(Long id) {
        try
        {
            personInterface.deleteById(id);
            return true;
        }
        catch(Exception error)
        {
            return false;
        }
    }
}
