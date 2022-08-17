package com.toadsdewin.basicCrud.Repository;

import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    @Query(value = "SELECT * FROM test rl WHERE rl.rol LIKE %:rol%",nativeQuery = true)
    public ArrayList<UserModel> findByRol(String rol);
    @Query(value = "SELECT * FROM test cr WHERE cr.career LIKE %:career%",nativeQuery = true)
    public ArrayList<UserModel> findByCareer(@Param("career")String career);
}
