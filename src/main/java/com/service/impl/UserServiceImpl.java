package com.service.impl;

import com.model.UserModel;
import com.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void login() {

    }

    @Override
    public List<UserModel> find(Map<String, String> map) {
        return null;
    }
}
