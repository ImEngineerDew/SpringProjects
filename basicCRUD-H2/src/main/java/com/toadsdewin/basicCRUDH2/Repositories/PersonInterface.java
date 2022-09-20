package com.toadsdewin.basicCRUDH2.Repositories;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface PersonInterface extends JpaRepository<Person,Long>
{
    public ArrayList<Person> findByEmail (String email);
    public ArrayList<Person> findByPhone(Long phone);
    public ArrayList<Person> findByCountry(String country);
}
