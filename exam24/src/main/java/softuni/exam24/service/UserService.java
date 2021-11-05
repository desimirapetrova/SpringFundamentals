package softuni.exam24.service;

import softuni.exam24.model.entity.User;
import softuni.exam24.model.service.UserServiceModel;

import java.util.List;

public interface UserService {
    UserServiceModel registerUser(UserServiceModel userServiceModel);
    void loginUser(Long id,String username);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    User findById(Long id);

    List<User> findALl();
}
