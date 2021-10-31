package com.joy.Data.Model;

import com.joy.Data.Exceptions.UserNameAlreadyExistException;
import com.joy.Data.Exceptions.WrongPassWordException;

public class Admin {
    private String userName;
    private String password;
    private ROLE role;

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public Admin(){

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws UserNameAlreadyExistException {
        if (userName != null) {
            throw new UserNameAlreadyExistException("UserName already exist");
        }
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPassWordException {
        validatePassword(password);
        this.password = password;

    }
    public void validatePassword(String password) throws WrongPassWordException {
        if(password.length() > 4 || !this.password.equals(password)){
            throw new WrongPassWordException("Wrong password");

        }

    }

    @Override
    public String toString() {
        return "Admin{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
