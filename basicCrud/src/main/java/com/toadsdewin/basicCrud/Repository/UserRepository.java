package com.toadsdewin.basicCrud.Repository;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    public ArrayList<UserModel> findByRol(String rol);
    public ArrayList<UserModel> findByCareer(String career);
    public ArrayList<UserModel> findByCountry(String country);
}