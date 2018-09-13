package com.cn.tsdm.login.service.impl;

import com.cn.tsdm.domain.AuthorUser;
import com.cn.tsdm.login.dao.LoginDao;
import com.cn.tsdm.login.service.LoginServiceI;
import com.cn.tsdm.util.IDUtil;
import com.cn.tsdm.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xn.L on 2018/9/13.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginServiceI{
    @Autowired
    LoginDao loginDao;
    @Override
    public String register(AuthorUser user) {
        AuthorUser registerUser = loginDao.getUserByName(user.getUserName());
        if(registerUser!=null){
            return "error";
        }
        user.setUserID(IDUtil.getId());
        user.setPassword(MD5Util.stringMD5(user.getPassword(),null));
        loginDao.addUser(user);
        return "success";
    }

    @Override
    public String login(AuthorUser user) {
        AuthorUser loginUser = loginDao.getUserByName(user.getUserName());
        if(loginUser!=null){
           if(MD5Util.stringMD5(user.getPassword(),null).equals(loginUser.getPassword()))
               return "success";
        }
        return "error";
    }
}
