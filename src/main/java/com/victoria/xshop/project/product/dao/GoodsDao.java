/*
 * @ClassName GoodsDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 15:02:59
 */
package com.victoria.xshop.project.product.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import com.victoria.xshop.project.product.bean.po.Goods;

import java.util.List;

@Repository
@Mapper
public interface GoodsDao {
    /**
     * @Title deleteGoodsByPrimaryKey
     * @param id
     * @return int
     */
    int deleteGoodsByPrimaryKey(Long id);

    /**
     * @Title insertGoods
     * @param record
     * @return int
     */
    int insertGoods(Goods record);

    /**
     * @Title insertGoodsSelective
     * @param record
     * @return int
     */
    int insertGoodsSelective(Goods record);

    /**
     * @Title selectGoodsByPrimaryKey
     * @param id
     * @return Goods
     */
    Goods selectGoodsByPrimaryKey(Long id);

    /**
     * @Title updateGoodsByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateGoodsByPrimaryKeySelective(Goods record);

    /**
     * @Title updateGoodsByPrimaryKeyWithBLOBs
     * @param record
     * @return int
     */
    int updateGoodsByPrimaryKeyWithBLOBs(Goods record);

    /**
     * @Title updateGoodsByPrimaryKey
     * @param record
     * @return int
     */
    int updateGoodsByPrimaryKey(Goods record);

    @Select("select * from xshop_goods where product_id = #{productId}")
    @ResultMap("com.victoria.xshop.project.product.dao.GoodsDao.GoodsResultMapWithBLOBs")
    List<Goods> findByProductId(@Param("productId")Long productId);
}