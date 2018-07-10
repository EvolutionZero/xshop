package com.victoria.xshop.project.product.controller;


import com.victoria.xshop.project.product.bean.po.Product;
import com.victoria.xshop.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/save.do")
    @ResponseBody
    public Product save(Product product){
    	productService.save(product);
        return product;
    }

    @RequestMapping(value = "/update.do")
    @ResponseBody
    public String update(Product product){
        return productService.updateById(product) ? "ok" : "fail";
    }

    @RequestMapping(value="/find.do")
    @ResponseBody
    public Product find(@RequestParam(value="id", defaultValue = "0") Long id){
        return productService.findById(id);
    }

    @RequestMapping(value="/delete.do")
    @ResponseBody
    public String delete(@RequestParam(value="id", defaultValue = "0") Long id){
        return productService.deleteById(id) ? "ok" : "fail";
    }

}
