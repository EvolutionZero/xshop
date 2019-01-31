package com.victoria.xshop.project.user.controller;


import com.victoria.xshop.XshopApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.sql.DataSource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = XshopApplication.class)
//@SpringBootApplication(exclude= DispatcherServletAutoConfiguration.class)
//@EnableServiceComb
//@WebAppConfiguration
public class BaseTestController {


    @Autowired
    protected DataSource ds;

    protected JdbcTemplate jdbc;

    protected MockMvc mockMvc; // 模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化。

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    protected WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        System.setProperty("crmmock","1");
        jdbc = new JdbcTemplate(ds);
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    protected String postByJSON(String token, String url, String json) throws Exception {
        MvcResult result1 = mockMvc.perform(post(url)
                .header("Authorization", "Bearer " + token)
                .characterEncoding("UTF-8")
                .content(json)
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))// 预期返回值的媒体类型text/plain;charset=UTF-8
                .andReturn();// 返回执行请求的结果
        String content = result1.getResponse().getContentAsString();
        logger.info("请求输出 : {}", content);
        return content;
    }

}
