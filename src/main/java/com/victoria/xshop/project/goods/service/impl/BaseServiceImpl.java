package com.victoria.xshop.project.goods.service.impl;

import com.victoria.xshop.project.goods.mapper.BaseMapper;
import com.victoria.xshop.project.goods.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<M extends BaseMapper<E> , E> implements BaseService<E> {

    @Autowired
    private M mapper;

    @Override
    public int save(E record) {
        return mapper.save(record);
    }

    @Override
    public int updateById(E record) {
        return mapper.updateById(record);
    }

    @Override
    public E findById(Integer id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteById(id);
    }

    @Override
    public List<E> list(E record) {
        return mapper.list(record);
    }

    @Override
    public int count(E record) {
        return mapper.count(record);
    }
}
