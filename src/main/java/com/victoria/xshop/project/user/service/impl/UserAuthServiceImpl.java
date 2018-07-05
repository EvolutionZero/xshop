package com.victoria.xshop.project.user.service.impl;

import com.victoria.xshop.project.user.dao.UserAuthDao;
import com.victoria.xshop.project.user.model.UserAuth;
import com.victoria.xshop.project.user.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private UserAuthDao userAuthDao;

    @Override
    public boolean save(UserAuth record){
        return userAuthDao.insertUserAuthSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return userAuthDao.deleteUserAuthByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(UserAuth record){
        return userAuthDao.updateUserAuthByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public UserAuth findById(Long id){
        return userAuthDao.selectUserAuthByPrimaryKey(id);
    }
    
}
