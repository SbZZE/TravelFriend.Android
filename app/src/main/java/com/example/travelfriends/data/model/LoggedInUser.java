package com.example.travelfriends.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String username;
    private String password;


    public LoggedInUser(String userId, String displayName) {
        this.username = userId;
        this.password = displayName;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
