package com.toadsdewin.basicCRUDH2.Services;
import com.toadsdewin.basicCRUDH2.Models.Person;
import java.util.ArrayList;
import java.util.List;

public interface PersonServiceInterface
{
    public ArrayList<Person> getAllUsers();
    public Person saveUser(Person user);
    public Person upgradePerson(Person person,Long id);
    public Person getById(Long id);
    public List<Person> findByEmail (String email);
    public List<Person> findByPhone(Long phone);
    public List<Person> findByCountry(String country);
    public boolean deleteUser(Long id);
}
