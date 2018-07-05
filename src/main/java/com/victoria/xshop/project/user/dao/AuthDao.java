/*
 * @ClassName AuthDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.Auth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
}