/*
 * @ClassName UserDao
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.dao;

import com.victoria.xshop.project.user.bean.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    /**
     * @Title deleteUserByPrimaryKey
     * @param id
     * @return int
     */
    int deleteUserByPrimaryKey(Long id);

    /**
     * @Title insertUser
     * @param record
     * @return int
     */
    int insertUser(User record);

    /**
     * @Title insertUserSelective
     * @param record
     * @return int
     */
    int insertUserSelective(User record);

    /**
     * @Title selectUserByPrimaryKey
     * @param id
     * @return User
     */
    User selectUserByPrimaryKey(Long id);

    /**
     * @Title updateUserByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateUserByPrimaryKeySelective(User record);

    /**
     * @Title updateUserByPrimaryKey
     * @param record
     * @return int
     */
    int updateUserByPrimaryKey(User record);

    @Select("select * from common_user where username = #{username} and password = #{password}")
    @ResultMap("com.victoria.xshop.project.user.dao.UserDao.UserBaseResultMap")
    User login(@Param("username") String username, @Param("password") String password);

    @Update("update common_user set last_login_time = now(), last_login_ip = #{ip} where id = #{id}")
    void updateLoginInfo(@Param("ip") String ip, @Param("id") Long id);
}