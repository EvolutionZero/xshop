/*
 * @ClassName UserAddressDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.common.constant.CommonConstant;
import com.victoria.xshop.project.user.bean.po.UserAddress;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserAddressDao {


    /**
     * @param record
     * @return int
     * @Title insertUserAddressSelective
     */
    int insertUserAddressSelective(UserAddress record);

    /**
     * @param record
     * @return int
     * @Title updateUserAddressByPrimaryKeySelective
     */
    int updateUserAddressByPrimaryKeySelective(UserAddress record);

    @Select("select * from xshop_user_address where user_id = #{userId}")
    @ResultMap("com.victoria.xshop.project.user.dao.UserAddressDao.UserAddressBaseResultMap")
    List<UserAddress> findByUserId(@Param(value = "userId") Long userId);

    @Update({"update xshop_user_address set is_default = ", CommonConstant.FALSE, " where user_id = #{userId}"})
    void updateAddressAllNotDefault(@Param(value = "userId") Long userId);

    @Update({"update xshop_user_address set is_default = ", CommonConstant.TRUE, " where id = #{id}"})
    int updateDefaultAddress(@Param(value = "id") Long id);

    @Select("select count(0) from xshop_user_address where user_id = #{userId}")
    int countByUserId(@Param(value = "userId") Long userId);

    @Delete("delete from xshop_user_address where id = #{id} and user_id = #{userId}")
    int deleteById(@Param(value = "id") Long id, @Param(value = "userId") Long userId);

    @Select("select * from xshop_user_address where id = #{id} and user_id = #{userId}")
    @ResultMap("com.victoria.xshop.project.user.dao.UserAddressDao.UserAddressBaseResultMap")
    UserAddress findById(@Param(value = "id") Long id,@Param(value = "userId") Long userId);
}