package com.toadsdewin.basicCrud.Services;
import com.toadsdewin.basicCrud.Models.UserModel;
import com.toadsdewin.basicCrud.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface
{
    @Autowired
    UserRepository userRepository;  /**Call the UserRepository class**/
    @Override
    public ArrayList<UserModel> getUsers()
    {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    @Override
    public UserModel saveUser(UserModel user)
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
        try {
            UserModel upgrade = userRepository.findById(id).get();

            if (Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) {
                upgrade.setName(user.getName());
            }
            if (Objects.nonNull(user.getSurname()) && !"".equalsIgnoreCase(user.getSurname())) {
                upgrade.setSurname(user.getSurname());
            }
            if (Objects.nonNull(user.getCountry()) && !"".equalsIgnoreCase(user.getCountry())) {
                upgrade.setCountry(user.getCountry());
            }
            if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
                upgrade.setEmail(user.getEmail());
            }
            if (Objects.nonNull(user.getRol()) && !"".equalsIgnoreCase(user.getRol())) {
                upgrade.setRol(user.getRol());
            }
            if (Objects.nonNull(user.getCareer()) && !"".equalsIgnoreCase(user.getCareer())) {
                upgrade.setCareer(user.getCareer());
            }
            return userRepository.save(upgrade);
        }catch(Exception error)
        {
            error.getMessage();
        }
        return null;
    }
    @Override
    public UserModel getById(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public UserModel getByRol(String rol)
    {
        return userRepository.findByRol(rol);
    }
    @Override
    public UserModel getByCountry(String country)
    {
        return userRepository.findByCountry(country);
    }
    @Override
    public UserModel getByCareer(String career) {
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