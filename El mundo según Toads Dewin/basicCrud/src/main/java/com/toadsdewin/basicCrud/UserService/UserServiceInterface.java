package com.toadsdewin.basicCrud.UserService;
import com.toadsdewin.basicCrud.UserModel.UserModel;
import java.util.List;

public interface UserServiceInterface
{
    public UserModel saveUser(UserModel user);
    public UserModel upgradeUser(UserModel user, Long id);
    public UserModel getById(Long id);
    public List<UserModel> getAllUsers();
    public List<UserModel> getByCountry(String country);
    public List<UserModel> getByName(String name);
    public List<UserModel> getBySurname(String surname);
    public List<UserModel> getByOccupation(String occupation);
    public List<UserModel> getByProfession(String profession);
    public List<UserModel> getByAge(Integer age);
    public boolean deleteUserById(Long id);
}