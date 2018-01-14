package com.magaofei.tool;

import com.magaofei.tool.Dao.UserMapper;
import com.magaofei.tool.Entity.UserEntity;
import com.magaofei.tool.Entity.UserSexEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

//    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {

        userMapper.insert(new UserEntity("aa",
                "a123456",
                UserSexEnum.MALE,
                "123456",
                18));
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
    }
}
