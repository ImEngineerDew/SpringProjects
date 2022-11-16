package com.toadsdewin.basicCrud.Services;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserService implements UserServiceInterface
{
    @Autowired
    UserRepository userRepository;  /*** Call the UserRepository class ***/
    @Override
    public ArrayList<UserModel> getUsers()
    {
        return (ArrayList<UserModel>) this.userRepository.findAll();
    }
    @Override
    public UserModel saveUser(@NotNull UserModel user)
    {
        if(user.getId() == null)
        {
            return userRepository.save(user);
        }
        else
        {
            return null;
        }
    }
    @Override
    public UserModel upgradeUser(UserModel user, Long id)
    {
        return userRepository.findById(id).map(
                userModel -> {
                    userModel.setName(user.getName());
                    userModel.setSurname(user.getSurname());
                    userModel.setCountry(user.getCountry());
                    userModel.setEmail(user.getEmail());
                    userModel.setRol(user.getRol());
                    userModel.setCountry(user.getCareer());

                    return userRepository.save(userModel);
                }
        ).orElse(null);
    }
    @Override
    public UserModel getById(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<UserModel> getByRol(String rol)
    {
        return userRepository.findByRol(rol);
    }
    @Override
    public List<UserModel> getByCountry(String country)
    {
        return userRepository.findByCountry(country);
    }
    @Override
    public List<UserModel> getByCareer(String career)
    {
        return userRepository.findByCareer(career);
    }
    @Override
    public boolean deleteUser(Long id) {
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