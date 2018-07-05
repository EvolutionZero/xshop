package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.project.user.model.UserAddress;
import com.victoria.xshop.project.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/userAddress")
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    @RequestMapping(value = "/save.do", method = RequestMethod.GET)
    @ResponseBody
    public UserAddress save(UserAddress userAddress){
    	userAddressService.save(userAddress);
        return userAddress;
    }

    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    @ResponseBody
    public UserAddress savePost(@RequestBody  UserAddress userAddress){
        userAddressService.save(userAddress);
        return userAddress;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(UserAddress userAddress){
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
        return userAddressService.deleteById(id) ? "ok" : "fail";
    }

}
