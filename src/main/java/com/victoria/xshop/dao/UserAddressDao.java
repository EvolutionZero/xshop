/*
 * @ClassName UserAddressDao
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 22:58:42
 */
package com.victoria.xshop.dao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import com.victoria.xshop.model.UserAddress;

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