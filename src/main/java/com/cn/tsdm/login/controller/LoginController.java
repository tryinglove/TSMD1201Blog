package com.cn.tsdm.login.controller;

import com.cn.tsdm.domain.AuthorUser;
import com.cn.tsdm.login.service.LoginServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xn.L on 2018/9/13.
 */
@Controller
public class LoginController {
    @Autowired
    LoginServiceI loginService;
    @RequestMapping("/toRegister")
    public String register(){
        return "register";
    }
    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request, AuthorUser user){
        String result = loginService.register(user);
        if(result.equals("error"))
            return new ModelAndView("index","result","register fail,user is exist!");
        return new ModelAndView("index","result","register success!");
    }
    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("/toLogin")
    public String login(HttpServletRequest request, AuthorUser user){

        return null;
    }
}
