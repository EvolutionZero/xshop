package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.project.user.model.UserAuth;
import com.victoria.xshop.project.user.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/userAuth")
public class UserAuthController {

    @Autowired
    private UserAuthService userAuthService;

    @RequestMapping(value = "/save.do")
    @ResponseBody
    public UserAuth save(UserAuth userAuth){
    	userAuthService.save(userAuth);
        return userAuth;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(UserAuth userAuth){
        return userAuthService.updateById(userAuth) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public UserAuth find(@RequestParam(value="id", defaultValue = "0") Long id){
        return userAuthService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        return userAuthService.deleteById(id) ? "ok" : "fail";
    }

}
