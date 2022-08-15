package com.toadsdewin.basicCrud.Repository;

import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Long> {
}
