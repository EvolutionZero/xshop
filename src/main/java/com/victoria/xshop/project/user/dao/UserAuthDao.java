/*
 * @ClassName UserAuthDao
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 22:58:42
 */
package com.victoria.xshop.project.user.dao;
import com.victoria.xshop.project.user.model.UserAuth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserAuthDao {
    /**
     * @Title deleteUserAuthByPrimaryKey
     * @param id
     * @return int
     */
    int deleteUserAuthByPrimaryKey(Long id);

    /**
     * @Title insertUserAuth
     * @param record
     * @return int
     */
    int insertUserAuth(UserAuth record);

    /**
     * @Title insertUserAuthSelective
     * @param record
     * @return int
     */
    int insertUserAuthSelective(UserAuth record);

    /**
     * @Title selectUserAuthByPrimaryKey
     * @param id
     * @return UserAuth
     */
    UserAuth selectUserAuthByPrimaryKey(Long id);

    /**
     * @Title updateUserAuthByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateUserAuthByPrimaryKeySelective(UserAuth record);

    /**
     * @Title updateUserAuthByPrimaryKey
     * @param record
     * @return int
     */
    int updateUserAuthByPrimaryKey(UserAuth record);
}