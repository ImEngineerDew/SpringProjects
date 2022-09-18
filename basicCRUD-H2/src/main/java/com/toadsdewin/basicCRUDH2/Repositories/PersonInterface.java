package com.toadsdewin.basicCRUDH2.Repositories;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;

public interface PersonInterface extends JpaRepository<Long, Person>
{
    public ArrayList<Person> findByEmail (String email);
    public ArrayList<Person> findByPhone(Integer phone);
}
