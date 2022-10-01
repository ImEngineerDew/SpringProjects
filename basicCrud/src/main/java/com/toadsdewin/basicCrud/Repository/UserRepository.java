package com.toadsdewin.basicCrud.Repository;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    public List<UserModel> findByRol(String rol);
    public List<UserModel> findByCareer(String career);
    public List<UserModel> findByCountry(String country);
}