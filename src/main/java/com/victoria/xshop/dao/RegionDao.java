/*
 * @ClassName RegionDao
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 22:58:42
 */
package com.victoria.xshop.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import com.victoria.xshop.model.Region;

import java.util.List;

@Repository
@Mapper
public interface RegionDao {
    /**
     * @Title deleteRegionByPrimaryKey
     * @param id
     * @return int
     */
    int deleteRegionByPrimaryKey(Long id);

    /**
     * @Title insertRegion
     * @param record
     * @return int
     */
    int insertRegion(Region record);

    /**
     * @Title insertRegionSelective
     * @param record
     * @return int
     */
    int insertRegionSelective(Region record);

    /**
     * @Title selectRegionByPrimaryKey
     * @param id
     * @return Region
     */
    Region selectRegionByPrimaryKey(Long id);

    /**
     * @Title updateRegionByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateRegionByPrimaryKeySelective(Region record);

    /**
     * @Title updateRegionByPrimaryKey
     * @param record
     * @return int
     */
    int updateRegionByPrimaryKey(Region record);

    @Select("select * from xshop_region")
    @ResultMap("com.victoria.xshop.dao.RegionDao.RegionBaseResultMap")
    List<Region> findAll();
}