package com.wangbowen.entity;

public class LoginUsers {
    private String userID;
    private String password;
    public LoginUsers(String userID, String password){
        this.userID = userID;
        this.password = password;
    }
    public String getUserID() {
        return userID;
    }
    public String getPassword() {
        return password;
    }
}
