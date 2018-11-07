package com.victoria.xshop.project.goods.service.impl;

import com.victoria.xshop.project.goods.mapper.ActivityInfoDao;
import com.victoria.xshop.project.goods.mapper.BaseMapper;
import com.victoria.xshop.project.goods.model.entity.ActivityInfo;
import com.victoria.xshop.project.goods.service.ActiviyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiviyInfoServiceImpl extends BaseServiceImpl<ActivityInfo> implements ActiviyInfoService {

    @Autowired
    private ActivityInfoDao activityInfoDao;

    @Override
    protected BaseMapper<ActivityInfo> getMapper() {
        return activityInfoDao;
    }
}
