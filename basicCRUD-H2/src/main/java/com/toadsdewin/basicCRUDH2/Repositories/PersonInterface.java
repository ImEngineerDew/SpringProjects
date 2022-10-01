package com.toadsdewin.basicCRUDH2.Repositories;
import com.toadsdewin.basicCRUDH2.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonInterface extends JpaRepository<Person,Long>
{
    public List<Person> findByEmail (String email);
    public List<Person> findByPhone(Long phone);
    public List<Person> findByCountry(String country);
}
