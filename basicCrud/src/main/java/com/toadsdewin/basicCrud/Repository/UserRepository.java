package com.toadsdewin.basicCrud.Repository;
import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    public ArrayList<UserModel> findByRol(String rol);
    public ArrayList<UserModel> findByCareer(String career);

}
