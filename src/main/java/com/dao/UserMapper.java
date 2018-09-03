package com.dao;

import com.model.UserModel;

public interface UserMapper extends BaseDao<UserModel> {
    void login();

}
