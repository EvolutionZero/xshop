package com.victoria.xshop.project.user.controller;

import com.victoria.xshop.project.user.model.User;
import com.victoria.xshop.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    @ResponseBody
    public User save(@RequestBody  User user){
    	userService.save(user);
        return user;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(User user){
        return userService.updateById(user) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public User find(@RequestParam(value="id", defaultValue = "0") Long id){
        return userService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        return userService.deleteById(id) ? "ok" : "fail";
    }

}
