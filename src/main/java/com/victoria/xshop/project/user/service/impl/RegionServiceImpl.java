package com.victoria.xshop.project.user.service.impl;

import com.victoria.xshop.common.tree.RegionTree;
import com.victoria.xshop.project.user.bean.po.Region;
import com.victoria.xshop.project.user.dao.RegionDao;
import com.victoria.xshop.project.user.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionDao regionDao;

    @Override
    public boolean save(Region record){
        return regionDao.insertRegionSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return regionDao.deleteRegionByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(Region record){
        return regionDao.updateRegionByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public Region findById(Long id){
        return regionDao.selectRegionByPrimaryKey(id);
    }


    public List<Map<String, Object>> findAll(){
        List<Region> regions = regionDao.findAll();
        RegionTree regionTree = new RegionTree();
        regions.forEach(region -> regionTree.add(region));
        return regionTree.printfTree();
    }
}
