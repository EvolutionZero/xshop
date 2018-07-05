/*
 * @ClassName RoleDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RoleDao {
    /**
     * @Title deleteRoleByPrimaryKey
     * @param roleId
     * @return int
     */
    int deleteRoleByPrimaryKey(Integer roleId);

    /**
     * @Title insertRole
     * @param record
     * @return int
     */
    int insertRole(Role record);

    /**
     * @Title insertRoleSelective
     * @param record
     * @return int
     */
    int insertRoleSelective(Role record);

    /**
     * @Title selectRoleByPrimaryKey
     * @param roleId
     * @return Role
     */
    Role selectRoleByPrimaryKey(Integer roleId);

    /**
     * @Title updateRoleByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateRoleByPrimaryKeySelective(Role record);

    /**
     * @Title updateRoleByPrimaryKey
     * @param record
     * @return int
     */
    int updateRoleByPrimaryKey(Role record);
}