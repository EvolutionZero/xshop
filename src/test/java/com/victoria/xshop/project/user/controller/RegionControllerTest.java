package com.victoria.xshop.project.user.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Auther: 蛇藨(shebiao)
 * @Date: 2019/1/31 15:29
 * @Description:
 */
public class RegionControllerTest extends  BaseTestController{

    @Test
    public void findAll() {
        try {
            String response = postByJSON("", "/region/findAll.do", "{}");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}