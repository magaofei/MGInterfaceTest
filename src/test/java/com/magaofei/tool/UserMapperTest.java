package com.magaofei.tool;

import com.magaofei.tool.mapper.UserMapper;
import com.magaofei.tool.entity.UserEntity;
import com.magaofei.tool.entity.UserSexEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        Timestamp timestamp = new Timestamp(time);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        userMapper.insert(new UserEntity(
                "aa",
                "a123456",
                UserSexEnum.MALE,
                "123456",
                18,
                "mamian@test.com",
                1,
                1,
                timestamp,
                timestamp
                ));
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }
}
