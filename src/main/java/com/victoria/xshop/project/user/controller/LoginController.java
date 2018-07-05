package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.framework.aspectj.lang.annotation.SysLog;
import com.victoria.xshop.project.user.bean.po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;


@Controller
public class LoginController {

    @GetMapping(value="/login")
    public String login(){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            return "index";
        }
        return "login";
    }


    @RequestMapping(value="/userLogin.do")
    @SysLog(action = "用户" , title = "登录")
    public String userLogin(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try
        {
            subject.login(token);
            return "index";
        }
        catch (AuthenticationException e)
        {
            return "fail";
        }
    }


    @RequestMapping(value="/userLogout.do")
    @SysLog(action = "用户" , title = "登录")
    public String logout(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.logout();
            return "login";
        }
        catch (AuthenticationException e)
        {
            return "fail";
        }
    }


    @GetMapping(value="/index")
    public String index(){
        return "index";
    }

    @GetMapping(value="/systemRead")
    @RequiresPermissions({"system:admin:perm-block"})
    @ResponseBody
    public String hasPermission(){
        return "ok";
    }

    @GetMapping(value="/systemDelete")
    @RequiresPermissions({"system:delete"})
    public String hasNotPermission(){
        return "ok";
    }

}
