package com.victoria.xshop.project.user.service;


import com.victoria.xshop.project.user.bean.po.UserAddress;

public interface UserAddressService {
	
    boolean save(UserAddress record);

    boolean deleteById(Long id);

    boolean updateById(UserAddress record);

    UserAddress findById(Long id);
    
}
