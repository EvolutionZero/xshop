package com.victoria.xshop.project.user.service;


import com.victoria.xshop.project.user.model.UserAddress;

public interface UserAddressService {
	
    boolean save(UserAddress record);

    boolean deleteById(Long id);

    boolean updateById(UserAddress record);

    UserAddress findById(Long id);
    
}
