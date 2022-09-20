package com.toadsdewin.basicCRUDH2.Services;
import com.toadsdewin.basicCRUDH2.Models.Person;
import java.util.ArrayList;
import java.util.Optional;

public interface PersonServiceInterface
{
    public ArrayList<Person> getAllUsers();
    public Person saveUser(Person user);
    public Person upgradeUser(Person user,Long id);
    public Person getById(Long id);
    public ArrayList<Person> findByEmail (String email);
    public ArrayList<Person> findByPhone(Long phone);
    public ArrayList<Person> findByCountry(String country);
    public boolean deleteUser(Long id);
}
