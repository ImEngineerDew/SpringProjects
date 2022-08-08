
package com.toadsdewin.civica.Services;
import java.util.List;
import java.util.Optional;
import com.toadsdewin.civica.Models.UserModel;
import com.toadsdewin.civica.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices
{
    @Autowired
    UserRepository userRepository;

    //A method for save the user data;
    public void save(UserModel user) {
        this.userRepository.save(user);
    }

    public List<UserModel> getUser() {
        return this.userRepository.findAll();
    }

    public Optional<UserModel> findById(String id) {
        return this.userRepository.findById(id);
    }

    public UserModel findByUserName(String username) {
        return this.userRepository.findByUsername(username).orElse(new UserModel());
    }

    public void deleteUserbyId(String id)
    {
        userRepository.deleteById(id);
    }

}
