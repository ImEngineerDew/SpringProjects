package com.toadsdewin.basicCrud.UserRepository;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>
{
    public List<UserModel> findByName(String name);
    public List<UserModel> findBySurname(String surname);
    public List<UserModel> findByCountry(String country);
    public List<UserModel> findByProfession(String profession);
    public List<UserModel> findByOccupation(String occupation);
    public List<UserModel> findByAge(Integer age);
}
