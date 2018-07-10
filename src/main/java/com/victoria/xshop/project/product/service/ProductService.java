package com.victoria.xshop.project.product.service;

import com.victoria.xshop.project.product.bean.po.Product;

public interface ProductService {
	
    boolean save(Product record);

    boolean deleteById(Long id);

    boolean updateById(Product record);

    Product findById(Long id);
    
}
