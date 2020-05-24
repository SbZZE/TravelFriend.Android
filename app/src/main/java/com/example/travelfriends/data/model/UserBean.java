package com.example.travelfriends.data.model;

/**
 * @ClassName: UserBean
 * @Description: java类作用描述
 * @Author: zly
 * @CreateDate: 2020/5/24 16:09
 */
public class UserBean {

    private String userName;

    private String passWord;

    private String nickName;

    private String signature;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                ", user_name='" + userName + '\'' +
                ", user_password='" + passWord + '\'' +
                ", user_nickName='" + nickName + '\'' +
                ", user_signature='" + signature + '\'' +
                '}';
    }
}
