/*
 * @ClassName RoleAuthDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.RoleAuthKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RoleAuthDao {
    /**
     * @Title deleteRoleAuthByPrimaryKey
     * @param key
     * @return int
     */
    int deleteRoleAuthByPrimaryKey(RoleAuthKey key);

    /**
     * @Title insertRoleAuth
     * @param record
     * @return int
     */
    int insertRoleAuth(RoleAuthKey record);

    /**
     * @Title insertRoleAuthSelective
     * @param record
     * @return int
     */
    int insertRoleAuthSelective(RoleAuthKey record);
}