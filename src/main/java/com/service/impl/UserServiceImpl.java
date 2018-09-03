package com.service.impl;

import com.dao.UserMapper;
import com.model.UserModel;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
   private UserMapper userMapper;
    @Override
    public List<UserModel> login() {

        return null;
    }

    @Override
    public List<UserModel> find(Map<String, String> map) {
        return null;
    }
}
