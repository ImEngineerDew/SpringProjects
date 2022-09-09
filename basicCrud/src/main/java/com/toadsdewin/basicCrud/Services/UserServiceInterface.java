package com.toadsdewin.basicCrud.Services;
import com.toadsdewin.basicCrud.Models.UserModel;
import java.util.ArrayList;
import java.util.Optional;


public interface UserServiceInterface {
    /**This method can get all the users from the DB**/
    public ArrayList<UserModel>getUsers();
    /**This method can save each user for the DB**/
    public UserModel saveUser(UserModel user);
    /**This method can upgrade an existent user**/
    public UserModel upgradeUser(UserModel user);
    /**This method can get a specific user from the DB**/
    public Optional<UserModel> getById(Long id);
    /**This method from the interface can get an user from a country**/
    public ArrayList<UserModel> getByCountry(String country);
    /**This method from that interface can get a specific rol or charge from the company**/
    public ArrayList<UserModel>getByRol(String rol);
    /**This can get an user following the attribute career**/
    public ArrayList<UserModel>getByCareer(String career);
    /**This method can delete an user following the specific id**/
    public boolean deleteUser(Long id);
}