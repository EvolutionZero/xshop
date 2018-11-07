package com.victoria.xshop.project.goods.service.impl;

import com.victoria.xshop.project.goods.mapper.BaseMapper;
import com.victoria.xshop.project.goods.service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<E> implements BaseService<E> {

    protected abstract BaseMapper<E> getMapper();

    @Override
    public int save(E record) {
        return getMapper().save(record);
    }

    @Override
    public int updateById(E record) {
        return getMapper().updateById(record);
    }

    @Override
    public E findById(Integer id) {
        return getMapper().findById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return getMapper().deleteById(id);
    }

    @Override
    public List<E> list(E record) {
        return getMapper().list(record);
    }

    @Override
    public int count(E record) {
        return getMapper().count(record);
    }
}
