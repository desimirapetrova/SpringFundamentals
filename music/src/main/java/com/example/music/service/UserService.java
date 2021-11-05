package com.example.music.service;

import com.example.music.model.entity.User;
import com.example.music.model.service.UserServiceModel;

public interface UserService {
    public UserServiceModel registerUser(UserServiceModel userServiceModel);
    public void loginUser(Long id,String username);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    User findById(Long id);
}
