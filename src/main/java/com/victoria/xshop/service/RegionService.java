package com.victoria.xshop.service;

import com.victoria.xshop.model.Region;

import java.util.List;
import java.util.Map;

public interface RegionService {
	
    boolean save(Region record);

    boolean deleteById(Long id);

    boolean updateById(Region record);

    Region findById(Long id);

    List<Map<String, Object>> findAll();
    
}
