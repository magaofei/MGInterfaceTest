package com.magaofei.tool.entity;

import java.sql.Timestamp;

public class User {

    public User() {

    }

    private int id;
    private String nickName;

    public User(String nickName, String userName, UserSexEnum userSex, String password, Integer age, String email, Integer isStaff, Integer isActive, Timestamp dateJoined, Timestamp lastLogin) {
        this.nickName = nickName;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
        this.age = age;
        this.email = email;
        this.isStaff = isStaff;
        this.isActive = isActive;
        this.dateJoined = dateJoined;
        this.lastLogin = lastLogin;
    }

    private String userName;
    private UserSexEnum userSex;
    private String password;
    private Integer age;

    private String email;
    private Integer isStaff;
    private Integer isActive;
    private Timestamp dateJoined;
    private Timestamp lastLogin;


//    private Date date_joined;
//    private Date last_login;


    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(Integer isStaff) {
        this.isStaff = isStaff;
    }

    public Timestamp getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Timestamp dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserName() {
        return userName;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
