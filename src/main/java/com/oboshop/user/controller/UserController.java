package com.oboshop.user.controller;

import com.oboshop.user.entity.User;

import com.oboshop.user.service.UserService;
import com.oboshop.user.service.impl.UserServiceImpl;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Controller
@RequestMapping("user")
public class UserController {


    private UserService userServiceImpl;
    @Resource(name = "userServiceImpl")
    public void setUserService(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @RequestMapping("/fail")
    public String fail(){
        return "fail";
    }

    @RequestMapping(value = "/fain.do",method = RequestMethod.POST)
    public String test(User user) throws Exception {
        System.out.println("user--->"+user);
        userServiceImpl.userSave( user );
        return "main";
    }

}
