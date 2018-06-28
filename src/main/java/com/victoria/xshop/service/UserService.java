package com.victoria.xshop.service;

import com.victoria.xshop.model.User;

public interface UserService {
	
    boolean save(User record);

    boolean deleteById(Long id);

    boolean updateById(User record);

    User findById(Long id);
    
}
