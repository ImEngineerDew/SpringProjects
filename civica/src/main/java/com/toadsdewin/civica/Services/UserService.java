package com.toadsdewin.civica.Services;
import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface
{
    @Autowired
    UserRepository userRepository;
    @Override
    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    @Override
    public ArrayList<UserModel> getByGender(String gender) {
        return userRepository.findByGender(gender);
    }
    @Override
    public ArrayList<UserModel> getByCity(String city) {
        return userRepository.findByCity(city);
    }
    @Override
    public ArrayList<UserModel> getFullName(String fullName) {
        return userRepository.findByFullName(fullName);
    }
    @Override
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }
    @Override
    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }
    @Override
    public ArrayList<UserModel> getByAge(Integer age) {
        return userRepository.findByAge(age);
    }
    @Override
    public boolean eraseUser(Long id) {
        try
        {
            userRepository.deleteById(id);
            return true;
        }
        catch(Exception error)
        {
            return false;
        }
    }
}