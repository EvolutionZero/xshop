package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.project.user.bean.po.User;
import com.victoria.xshop.project.user.bean.po.UserAddress;
import com.victoria.xshop.project.user.service.UserAddressService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping(value="/userAddress")
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;


    @PostMapping(value="/save.do")
    @ResponseBody
    public UserAddress save(@RequestBody  UserAddress userAddress){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            userAddress.setUserId(user.getId());
        }
        userAddressService.save(userAddress);
        return userAddress;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(UserAddress userAddress){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            userAddress.setUserId(user.getId());
        }
        return userAddressService.updateById(userAddress) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public UserAddress find(@RequestParam(value="id", defaultValue = "0") Long id){
        return userAddressService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            return userAddressService.deleteById(id, user.getId()) ? "ok" : "fail";
        }
        return "fail";
    }

    @RequestMapping(value="/findByUserId.do")
    @ResponseBody
    public List<UserAddress> findUserId(){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            return userAddressService.findByUserId(user.getId());
        }
        return new LinkedList<>();
    }

    @RequestMapping(value="/updateDefaultAddress.do")
    @ResponseBody
    public String updateDefaultAddress(@RequestParam(value="id", defaultValue = "0") Long id){
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            return userAddressService.updateDefaultAddress(user.getId(), id) ? "ok" : "fail";
        }
        return "fail";
    }
}
