/*
 * @ClassName UserDao
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 22:58:42
 */
package com.victoria.xshop.dao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import com.victoria.xshop.model.User;

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
}