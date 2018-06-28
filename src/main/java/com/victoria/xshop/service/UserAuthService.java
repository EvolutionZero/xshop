package com.victoria.xshop.service;

import com.victoria.xshop.model.UserAuth;

public interface UserAuthService {
	
    boolean save(UserAuth record);

    boolean deleteById(Long id);

    boolean updateById(UserAuth record);

    UserAuth findById(Long id);
    
}
