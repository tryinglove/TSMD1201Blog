package com.cn.tsdm.login.service;

import com.cn.tsdm.domain.AuthorUser;

/**
 * Created by xn.L on 2018/9/13.
 */
public interface LoginServiceI {
    String register(AuthorUser user);
    String login(AuthorUser user);
}
