package com.victoria.xshop.project.product.controller;


import com.victoria.xshop.project.product.bean.po.Goods;
import com.victoria.xshop.project.product.bean.vo.GoodsView;
import com.victoria.xshop.project.product.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value="/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/save.do")
    @ResponseBody
    public Goods save(Goods goods){
    	goodsService.save(goods);
        return goods;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(Goods goods){
        return goodsService.updateById(goods) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public Goods find(@RequestParam(value="id", defaultValue = "0") Long id){
        return goodsService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        return goodsService.deleteById(id) ? "ok" : "fail";
    }

    @RequestMapping(value="/findByProductId.do")
    @ResponseBody
    public GoodsView findByProductId(@RequestParam(value="productId", defaultValue = "0") Long productId){
        return goodsService.findByProductId(productId);
    }

}
