package com.victoria.xshop.project.user.service;


import com.victoria.xshop.project.user.model.UserAuth;

public interface UserAuthService {
	
    boolean save(UserAuth record);

    boolean deleteById(Long id);

    boolean updateById(UserAuth record);

    UserAuth findById(Long id);
    
}
