package com.example.travelfriends.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userName;
    private String passWord;
    private String nickName;
    private String signature;


    public LoggedInUser(String userId, String displayName) {
        this.userName = userId;
        this.passWord = displayName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
