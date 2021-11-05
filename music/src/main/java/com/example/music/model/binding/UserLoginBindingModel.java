package com.example.music.model.binding;

import javax.validation.constraints.Size;

public class UserLoginBindingModel {
    @Size(min = 3,max = 20,message = "Length must between 3 and 20chars")
    private String username;
    @Size(min = 5,max = 20,message = "Length must between 5 and 20chars")
    private String password;

    public UserLoginBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
