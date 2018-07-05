package com.victoria.xshop.project.user.controller;

import com.victoria.xshop.project.user.bean.po.Region;
import com.victoria.xshop.project.user.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @RequestMapping(value = "/save.do")
    @ResponseBody
    public Region save(Region region){
    	regionService.save(region);
        return region;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(Region region){
        return regionService.updateById(region) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public Region find(@RequestParam(value="id", defaultValue = "0") Long id){
        return regionService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        return regionService.deleteById(id) ? "ok" : "fail";
    }


    @RequestMapping(value="/findAll.do")
    @ResponseBody
    public List<Map<String, Object>> findAll(){
        return regionService.findAll();
    }
}
