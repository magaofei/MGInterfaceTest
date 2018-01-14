package com.magaofei.tool.Entity;

public class UserEntity {

    public UserEntity(String nickName, String userName, UserSexEnum userSex, String password, Integer age) {
        this.nickName = nickName;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
        this.age = age;
    }

    public UserEntity(Integer id, String nickName, String userName, UserSexEnum userSex, String password, Integer age) {
        this.id = id;
        this.nickName = nickName;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
        this.age = age;
    }

    public UserEntity() {

    }

    private int id;
    private String nickName;
    private String userName;
    private UserSexEnum userSex;
    private String password;
    private Integer age;

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
