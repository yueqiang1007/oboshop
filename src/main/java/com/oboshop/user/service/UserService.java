package com.oboshop.user.service;

import com.oboshop.user.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface UserService {

    List<User> findUser(String  username);

    int userSave(User user) throws Exception;
}
