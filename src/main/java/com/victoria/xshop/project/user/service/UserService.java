package com.victoria.xshop.project.user.service;


import com.victoria.xshop.project.user.bean.po.User;

public interface UserService {
	
    boolean save(User record);

    boolean deleteById(Long id);

    boolean updateById(User record);

    User findById(Long id);
    
}
