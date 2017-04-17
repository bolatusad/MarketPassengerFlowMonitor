package com.xupt.internetplus.service.impl;

import com.xupt.internetplus.bean.User;
import com.xupt.internetplus.dao.UserDao;
import com.xupt.internetplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张涛 on 2017/4/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {
        List<User> users =  userDao.listAllUser();
        return users;
    }
}
