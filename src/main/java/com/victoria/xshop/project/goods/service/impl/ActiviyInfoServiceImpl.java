package com.victoria.xshop.project.goods.service.impl;

import com.victoria.xshop.project.goods.mapper.ActivityInfoDao;
import com.victoria.xshop.project.goods.model.entity.ActivityInfo;
import com.victoria.xshop.project.goods.service.ActiviyInfoService;
import com.victoria.xshop.project.goods.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiviyInfoServiceImpl implements ActiviyInfoService {

    @Autowired
    private ActivityInfoDao activityInfoDao;

    @Override
    public int save(ActivityInfo record) {
        return 0;
    }

    @Override
    public int updateById(ActivityInfo record) {
        return 0;
    }

    @Override
    public ActivityInfo findById(Integer id) {
        return activityInfoDao.findById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }

    @Override
    public List<ActivityInfo> list(ActivityInfo record) {
        return null;
    }

    @Override
    public int count(ActivityInfo record) {
        return 0;
    }
}
