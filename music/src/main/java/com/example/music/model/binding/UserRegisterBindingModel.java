package com.example.music.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserRegisterBindingModel {
    @Size(min = 3,max = 20,message = "Username length must be between 3 and 20 characters.")
    private String username;
    @Size(min = 3,max = 20,message = "Full Name length must be between 3 and 20 characters")
    private String full_name;
    @NotNull
    @Email(message = "Must be valid email.")
    private String email;
    @Size(min = 5,max = 20,message = "Password length must be between 5 and 20 characters" )
    private String password;
    @Size(min = 5,max = 20,message = "Password length must be between 5 and 20 characters")
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
