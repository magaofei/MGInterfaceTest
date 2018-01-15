package com.magaofei.tool.Dao;

import com.magaofei.tool.Entity.UserEntity;
import com.magaofei.tool.Entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("Select * FROM users")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "userName", column = "user_name", javaType = String.class),
            @Result(property = "nickName", column = "nick_name", javaType = String.class),
            @Result(property = "id", column = "id", javaType = int.class),
            @Result(property = "password", column = "password", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class)

    })
    List<UserEntity> getAll();

    @Select("Select * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name", javaType = String.class)
    })
    UserEntity getOne(long id);

    @Insert("INSERT INTO users(user_name, password, user_sex) VALUES(#{userName}, #{password}, #{userSex})")
    void insert(UserEntity user);

    @Update("UPDATE users SET userName=#{userName}, nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(long id);
}