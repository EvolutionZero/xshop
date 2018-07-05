package com.victoria.xshop.project.user.service.impl;

import com.victoria.xshop.common.constant.CommonConstant;
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
        // 插入第一个地址设置为默认
        int cnt = userAddressDao.countByUserId(record.getUserId());
        if(cnt == 0){
            record.setIsDefault(new Integer(CommonConstant.TRUE));
        }

        // 空或者非默认设置为非默认地址
        if(record.getIsDefault() == null || record.getIsDefault().longValue() != new Long(CommonConstant.TRUE).longValue()){
            record.setIsDefault(new Integer(CommonConstant.FALSE));
        }
        return userAddressDao.insertUserAddressSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id, Long userId){
        return userAddressDao.deleteById(id, userId) == 1 ? true : false;
    }

    @Override
    public boolean updateById(UserAddress record){
        // 插入第一个地址设置为默认
        int cnt = userAddressDao.countByUserId(record.getUserId());
        if(cnt == 0){
            record.setIsDefault(new Integer(CommonConstant.TRUE));
        }

        // 空或者非默认设置为非默认地址
        if(record.getIsDefault() == null || record.getIsDefault().longValue() != new Long(CommonConstant.TRUE).longValue()){
            record.setIsDefault(new Integer(CommonConstant.FALSE));
        }
        return userAddressDao.updateUserAddressByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public UserAddress findById(Long id){
        return userAddressDao.selectUserAddressByPrimaryKey(id);
    }

    @Override
    public List<UserAddress> findByUserId(Long userId){
        return userAddressDao.findByUserId(userId);
    }

    @Override
    public boolean updateDefaultAddress(Long userId, Long id){
        userAddressDao.updateAddressAllNotDefault(userId);
        return userAddressDao.updateDefaultAddress(id) == 1 ? true : false;
    }
}
