/*
 * @ClassName AuthDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.Auth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface AuthDao {
    /**
     * @Title deleteAuthByPrimaryKey
     * @param authId
     * @return int
     */
    int deleteAuthByPrimaryKey(Integer authId);

    /**
     * @Title insertAuth
     * @param record
     * @return int
     */
    int insertAuth(Auth record);

    /**
     * @Title insertAuthSelective
     * @param record
     * @return int
     */
    int insertAuthSelective(Auth record);

    /**
     * @Title selectAuthByPrimaryKey
     * @param authId
     * @return Auth
     */
    Auth selectAuthByPrimaryKey(Integer authId);

    /**
     * @Title updateAuthByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateAuthByPrimaryKeySelective(Auth record);

    /**
     * @Title updateAuthByPrimaryKey
     * @param record
     * @return int
     */
    int updateAuthByPrimaryKey(Auth record);

    @Select(
            "select perms from common_auth a"
                    + " join common_role_auth ra on a.auth_id =  ra.auth_id"
                    + " join common_user_role ur on ur.role_id = ra.role_id"
                    + " where ur.user_id = #{id}"
    )
    Set<String> findAuthByUserId(@Param("id")Long id);
}