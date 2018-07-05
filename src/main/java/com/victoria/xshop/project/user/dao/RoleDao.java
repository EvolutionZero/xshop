/*
 * @ClassName RoleDao
 * @Description
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface RoleDao {
    /**
     * @param roleId
     * @return int
     * @Title deleteRoleByPrimaryKey
     */
    int deleteRoleByPrimaryKey(Integer roleId);

    /**
     * @param record
     * @return int
     * @Title insertRole
     */
    int insertRole(Role record);

    /**
     * @param record
     * @return int
     * @Title insertRoleSelective
     */
    int insertRoleSelective(Role record);

    /**
     * @param roleId
     * @return Role
     * @Title selectRoleByPrimaryKey
     */
    Role selectRoleByPrimaryKey(Integer roleId);

    /**
     * @param record
     * @return int
     * @Title updateRoleByPrimaryKeySelective
     */
    int updateRoleByPrimaryKeySelective(Role record);

    /**
     * @param record
     * @return int
     * @Title updateRoleByPrimaryKey
     */
    int updateRoleByPrimaryKey(Role record);

    @Select(
            "select role_key from common_role r"
                    + " join common_user_role ur on r.role_id = ur.role_id"
                    + " join common_user u on ur.user_id = u.id"
                    + " where u.id = #{id}"
    )
    Set<String> findRoleByUserId(@Param("id")Long id);
}