package com.victoria.xshop.project.goods.controller;

import com.victoria.xshop.project.goods.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseControllerImpl<S extends BaseService<E> , E> implements BaseController<E> {

    @Autowired
    private S service;

    @Override
    @PostMapping("/save")
    @ResponseBody
    public int save(E record) {
        return service.save(record);
    }

    @Override
    public int updateById(E record) {
        return service.updateById(record);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseBody
    public E findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return service.deleteById(id);
    }

    @Override
    @PostMapping("/list")
    @ResponseBody
    public List<E> listByPost(@RequestBody E record) {
        return service.list(record);
    }

    @Override
    @GetMapping("/list")
    @ResponseBody
    public List<E> listByGet(E record) {
        return service.list(record);
    }

    @Override
    @PostMapping("/count")
    @ResponseBody
    public int countByPost(@RequestBody E record) {
        return service.count(record);
    }

    @Override
    @GetMapping("/count")
    @ResponseBody
    public int countByGet(E record) {
        return service.count(record);
    }
}
