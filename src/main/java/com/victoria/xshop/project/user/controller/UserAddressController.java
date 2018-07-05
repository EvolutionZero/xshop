package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.common.utils.security.ShiroUtils;
import com.victoria.xshop.project.user.bean.po.UserAddress;
import com.victoria.xshop.project.user.service.UserAddressService;
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
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            userAddress.setUserId(userId);
        }
        userAddressService.save(userAddress);
        return userAddress;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(UserAddress userAddress){
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            userAddress.setUserId(userId);
        }
        return userAddressService.updateById(userAddress) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public UserAddress find(@RequestParam(value="id", defaultValue = "0") Long id){
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            return userAddressService.findById(id, userId);
        }
        return new UserAddress();
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            return userAddressService.deleteById(id, userId) ? "ok" : "fail";
        }
        return "fail";
    }

    @RequestMapping(value="/findByUserId.do")
    @ResponseBody
    public List<UserAddress> findUserId(){
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            return userAddressService.findByUserId(userId);
        }
        return new LinkedList<>();
    }

    @RequestMapping(value="/updateDefaultAddress.do")
    @ResponseBody
    public String updateDefaultAddress(@RequestParam(value="id", defaultValue = "0") Long id){
        Long userId = ShiroUtils.getUserId();
        if(userId != null){
            return userAddressService.updateDefaultAddress(userId, id) ? "ok" : "fail";
        }
        return "fail";
    }
}
