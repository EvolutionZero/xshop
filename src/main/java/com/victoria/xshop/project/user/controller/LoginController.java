package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.framework.aspectj.lang.annotation.SysLog;
import com.victoria.xshop.project.user.model.Region;
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
        return "login";
    }


    @RequestMapping(value="/userLogin.do")
    @SysLog(action = "用户" , title = "登录")
    public String userLogin(String username, String password){
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
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


    @GetMapping(value="/index")
    public String index(){
        return "index";
    }

    @GetMapping(value="/systemRead")
    @RequiresPermissions({"system:read"})
    @ResponseBody
    public String hasPermission(){
        return "ok";
    }

    @GetMapping(value="/systemDelete")
    @RequiresPermissions({"system:delete"})
    public String hasNotPermission(){
        return "ok";
    }

    public static class RegionNode {

        private RegionNode parent;
        private Region self;
        private List<RegionNode> childs = new LinkedList<>();

        public RegionNode(Region self) {
            this.self = self;
        }

        public Region getSelf() {
            return self;
        }

        public void setSelf(Region self) {
            this.self = self;
        }

        public RegionNode getParent() {
            return parent;
        }

        public void setParent(RegionNode parent) {
            this.parent = parent;
        }

        public List<RegionNode> getChilds() {
            return childs;
        }

        public void setChilds(List<RegionNode> childs) {
            this.childs = childs;
        }
    }
}
