package com.magaofei.tool.mapper;

import com.magaofei.tool.entity.UserEntity;
import com.magaofei.tool.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

public interface UserMapper {

    String userTableName = "users";

    @Select("Select * FROM " + userTableName)
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "userName", column = "user_name", javaType = String.class),
            @Result(property = "nickName", column = "nick_name", javaType = String.class),
            @Result(property = "id", column = "id", javaType = int.class),
            @Result(property = "password", column = "password", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
            @Result(property = "email", column = "email", javaType = String.class),
            @Result(property = "isStaff", column = "is_staff", javaType = Integer.class),
            @Result(property = "isActive", column = "is_active", javaType = Integer.class),
            @Result(property = "dateJoined", column = "date_joined", javaType = Timestamp.class),
            @Result(property = "lastLogin", column = "last_login", javaType = Timestamp.class)
    })
    List<UserEntity> getAll();

    @Select("Select * FROM "+ userTableName + "WHERE id = #{id}")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name", javaType = String.class)
    })
    UserEntity getOne(long id);

    @Insert("INSERT INTO " + userTableName + "(user_name, nick_name, password, user_sex, age, email, is_staff, is_active, date_joined, last_login) " +
            "VALUES(#{userName}, #{nickName}, #{password}, #{userSex}, #{age}, #{email}, #{isStaff}, #{isActive}, #{dateJoined}, #{lastLogin})")
    void insert(UserEntity user);

    @Update("UPDATE" + userTableName + "SET userName=#{userName}, nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM " + userTableName + "WHERE id = #{id}")
    void delete(long id);
}