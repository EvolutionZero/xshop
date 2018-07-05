package com.victoria.xshop.project.user.service.impl;

import com.victoria.xshop.project.user.bean.po.User;
import com.victoria.xshop.project.user.dao.UserDao;
import com.victoria.xshop.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User record){
        return userDao.insertUserSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return userDao.deleteUserByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(User record){
        return userDao.updateUserByPrimaryKeySelective(record) == 1 ? true : false;
    }
    @Override
    public User findById(Long id){
        return userDao.selectUserByPrimaryKey(id);
    }
    
}
