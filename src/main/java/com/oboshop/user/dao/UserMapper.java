package com.oboshop.user.dao;

import com.oboshop.user.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/8/3.
 */

public interface UserMapper {

    public int save(User user) throws Exception;

}
