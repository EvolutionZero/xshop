/*
 * @ClassName ProductDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 15:02:59
 */
package com.victoria.xshop.project.product.dao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import com.victoria.xshop.project.product.bean.po.Product;

@Repository
@Mapper
public interface ProductDao {
    /**
     * @Title deleteProductByPrimaryKey
     * @param id
     * @return int
     */
    int deleteProductByPrimaryKey(Long id);

    /**
     * @Title insertProduct
     * @param record
     * @return int
     */
    int insertProduct(Product record);

    /**
     * @Title insertProductSelective
     * @param record
     * @return int
     */
    int insertProductSelective(Product record);

    /**
     * @Title selectProductByPrimaryKey
     * @param id
     * @return Product
     */
    Product selectProductByPrimaryKey(Long id);

    /**
     * @Title updateProductByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateProductByPrimaryKeySelective(Product record);

    /**
     * @Title updateProductByPrimaryKeyWithBLOBs
     * @param record
     * @return int
     */
    int updateProductByPrimaryKeyWithBLOBs(Product record);

    /**
     * @Title updateProductByPrimaryKey
     * @param record
     * @return int
     */
    int updateProductByPrimaryKey(Product record);
}