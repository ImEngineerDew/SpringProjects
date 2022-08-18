package com.toadsdewin.basicCrud.Repository;

import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    public ArrayList<UserModel> findByRol(String rol);
    public ArrayList<UserModel> findByCareer(@Param("career")String career);
    public Optional<UserModel> findById(Long id);
    public UserModel save(UserModel user);
}
