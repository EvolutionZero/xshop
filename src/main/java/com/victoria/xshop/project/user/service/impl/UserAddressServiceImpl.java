package com.victoria.xshop.project.user.service.impl;

import com.victoria.xshop.project.user.bean.po.UserAddress;
import com.victoria.xshop.project.user.dao.UserAddressDao;
import com.victoria.xshop.project.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressDao userAddressDao;

    @Override
    public boolean save(UserAddress record){
        return userAddressDao.insertUserAddressSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return userAddressDao.deleteUserAddressByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(UserAddress record){
        return userAddressDao.updateUserAddressByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public UserAddress findById(Long id){
        return userAddressDao.selectUserAddressByPrimaryKey(id);
    }
    
}
