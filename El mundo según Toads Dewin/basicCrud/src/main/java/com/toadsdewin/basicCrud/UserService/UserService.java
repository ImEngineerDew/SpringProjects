package com.toadsdewin.basicCrud.UserService;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import com.toadsdewin.basicCrud.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService  implements  UserServiceInterface
{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel saveUser(UserModel user) {
        if(user.getId()==null)
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
                userModel.setAge(user.getAge());
                userModel.setProfession(user.getProfession());
                userModel.setOccupation(user.getOccupation());
                return userRepository.save(userModel);
            }
        ).orElse(null);
    }
    @Override
    public UserModel getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public List<UserModel> getByName(String name) {
        return userRepository.findByName(name);
    }
    @Override
    public List<UserModel> getBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }
    @Override
    public List<UserModel> getByOccupation(String occupation) {
        return userRepository.findByOccupation(occupation);
    }
    @Override
    public List<UserModel>getByCountry(String country)
    {
        return userRepository.findByCountry(country);
    }
    @Override
    public List<UserModel> getByProfession(String profession) {
        return userRepository.findByProfession(profession);
    }
    @Override
    public List<UserModel> getByAge(Integer age) {
        return userRepository.findByAge(age);
    }
    @Override
    public boolean deleteUserById(Long id) {
        try
        {
            userRepository.deleteById(id);
            return true;
        }catch(Exception error)
        {
            error.getMessage();
        }
        return false;
    }
}