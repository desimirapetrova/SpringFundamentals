package softuni.exam24.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {
    @Email(message = "Enter valid email address")
    private String email;
    @Size(min = 5,max = 20,message = "Full name length must be between 5 and 20 characters.")
    private String full_name;
    @Size(min = 4,message = "Password length must be more than 3 characters.")
    private String password;
    @Size(min = 4,message = "Password length must be more than 3 characters.")
    private String confirmPassword;
    @Size(min = 3,max = 10,message = "Username length must be between 3 and 10 characters.")
    private String username;

    public UserRegisterBindingModel() {
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
