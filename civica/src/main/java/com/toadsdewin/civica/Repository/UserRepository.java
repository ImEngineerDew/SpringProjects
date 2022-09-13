package com.toadsdewin.civica.Repository;
import com.toadsdewin.civica.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,String>
{
    public Optional<UserModel> findByFullName(String fullName);
    public ArrayList<UserModel> findByGender(String gender);
    public ArrayList<UserModel> findByCity(String city);
}
