/*
 * @ClassName UserRoleDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.UserRoleKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRoleDao {
    /**
     * @Title deleteUserRoleByPrimaryKey
     * @param key
     * @return int
     */
    int deleteUserRoleByPrimaryKey(UserRoleKey key);

    /**
     * @Title insertUserRole
     * @param record
     * @return int
     */
    int insertUserRole(UserRoleKey record);

    /**
     * @Title insertUserRoleSelective
     * @param record
     * @return int
     */
    int insertUserRoleSelective(UserRoleKey record);
}