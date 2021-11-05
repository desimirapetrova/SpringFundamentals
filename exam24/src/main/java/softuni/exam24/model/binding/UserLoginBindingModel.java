package softuni.exam24.model.binding;

import javax.validation.constraints.Size;

public class UserLoginBindingModel {
    @Size(min = 3,max = 10,message = "Username length must be between 3 and 10 characters.")
    private String username;
    @Size(min=4,message = "Password length must be more than 3 characters.")
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
