package com.toadsdewin.platzispringboot.Repository;

import com.toadsdewin.platzispringboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    public Optional<User> findById(Long id);
    public ArrayList<User> findByName(String name);
}
