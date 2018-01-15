package com.magaofei.tool.Controller;


import com.magaofei.tool.Dao.UserMapper;
import com.magaofei.tool.Entity.ResponseError;
import com.magaofei.tool.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UsersController {


    @Autowired
    private UserMapper userMapper;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseError users () {
        List<UserEntity> users = userMapper.getAll();

        ResponseError responseError = new ResponseError();
        responseError.setData(users);
        return responseError;
    }
}
