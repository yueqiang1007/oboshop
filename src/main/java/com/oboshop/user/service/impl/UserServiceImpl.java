package com.oboshop.user.service.impl;

import com.oboshop.user.dao.UserMapper;
import com.oboshop.user.entity.User;
import com.oboshop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> findUser(String username) {
        return null;
    }
    public int userSave(User user) throws Exception {

        System.out.println("user--->"+user);

        return userMapper.save( user );
    }
}
