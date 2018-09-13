package com.cn.tsdm.login.dao;

import com.cn.tsdm.domain.AuthorUser;

/**
 * Created by xn.L on 2018/9/13.
 */
public interface LoginDao {
    AuthorUser getUserByName(String userName);

    void addUser(AuthorUser user);
}
