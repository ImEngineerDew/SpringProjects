package com.toadsdewin.basicCRUD.Repository;
import com.toadsdewin.basicCRUD.Models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Integer> {
}
