package com.toadsdewin.platzispringboot.Service;
import com.toadsdewin.platzispringboot.Entity.User;
import com.toadsdewin.platzispringboot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUsers()
    {
        return (ArrayList<User>) userRepository.findAll();
    }
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
    public Optional<User> findById(Long id)
    {
        return userRepository.findById(id);
    }
    public ArrayList<User> findByName(String name)
    {
        return userRepository.findByName(name);
    }
    public boolean deleteById(Long id)
    {
        try
        {
            userRepository.deleteById(id);
            return true;
        }catch(Exception error)
        {
            return false;
        }
    }
}
