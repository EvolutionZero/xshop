/*
 * @ClassName UserAddressDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.UserAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserAddressDao {
    /**
     * @Title deleteUserAddressByPrimaryKey
     * @param id
     * @return int
     */
    int deleteUserAddressByPrimaryKey(Long id);

    /**
     * @Title insertUserAddress
     * @param record
     * @return int
     */
    int insertUserAddress(UserAddress record);

    /**
     * @Title insertUserAddressSelective
     * @param record
     * @return int
     */
    int insertUserAddressSelective(UserAddress record);

    /**
     * @Title selectUserAddressByPrimaryKey
     * @param id
     * @return UserAddress
     */
    UserAddress selectUserAddressByPrimaryKey(Long id);

    /**
     * @Title updateUserAddressByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateUserAddressByPrimaryKeySelective(UserAddress record);

    /**
     * @Title updateUserAddressByPrimaryKey
     * @param record
     * @return int
     */
    int updateUserAddressByPrimaryKey(UserAddress record);
}