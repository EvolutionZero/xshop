package com.victoria.xshop.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.victoria.xshop.project.user.bean.po.User;
import org.junit.Test;

import java.util.Date;

public class TestUser {

    @Test
    public void userJson(){
        User user = new User();
        user.setUsername("zero");
        user.setPassword("123qwe");
        user.setNickname("zzzzzzero");
        user.setWeixinOpenid("weixin231");
        user.setEmail("12345@qq.com");
//        user.setBirthday(new Date());
//        user.setUserAuthId(1);
//        user.setRegisterTime(new Date());
//        user.setLastLoginTime(new Date());
        user.setRegisterIp("127.0.0.1");
        user.setLastLoginIp("127.0.0.1");

        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(user);
            System.out.println(jsonString);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
