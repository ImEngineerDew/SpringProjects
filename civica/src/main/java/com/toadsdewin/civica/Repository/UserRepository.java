package com.toadsdewin.civica.Repository;

import com.toadsdewin.civica.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,String>
{
    public Optional<UserModel> findByUsername(String userName);
}
