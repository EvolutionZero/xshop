package com.victoria.xshop.project.goods.controller;

import com.victoria.xshop.project.goods.model.entity.ActivityInfo;
import com.victoria.xshop.project.goods.service.ActiviyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/activity_info")
public class ActivityInfoController {

    @Autowired
    private ActiviyInfoService activiyInfoService;

    @RequestMapping("/{id}")
    @ResponseBody
    public ActivityInfo findById(@PathVariable int id){
        return activiyInfoService.findById(id);
    }

}
