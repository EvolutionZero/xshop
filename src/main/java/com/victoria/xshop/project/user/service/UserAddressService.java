package com.victoria.xshop.project.user.service;


import com.victoria.xshop.project.user.bean.po.UserAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressService {
	
    boolean save(UserAddress record);

    boolean deleteById(Long id, Long userId);

    boolean updateById(UserAddress record);

    UserAddress findById(Long id);

    List<UserAddress> findByUserId(Long userId);

    boolean updateDefaultAddress(Long userId, Long id);

}
