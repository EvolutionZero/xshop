package com.victoria.xshop.service;

import com.victoria.xshop.model.UserAddress;

public interface UserAddressService {
	
    boolean save(UserAddress record);

    boolean deleteById(Long id);

    boolean updateById(UserAddress record);

    UserAddress findById(Long id);
    
}
