package com.victoria.xshop.project.user.service;



import com.victoria.xshop.project.user.bean.po.Region;

import java.util.List;
import java.util.Map;

public interface RegionService {
	
    boolean save(Region record);

    boolean deleteById(Long id);

    boolean updateById(Region record);

    Region findById(Long id);

    List<Map<String, Object>> findAll();
    
}
