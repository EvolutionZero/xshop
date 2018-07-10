package com.victoria.xshop.project.product.service.impl;

import com.victoria.xshop.project.product.dao.ProductDao;
import com.victoria.xshop.project.product.bean.po.Product;
import com.victoria.xshop.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public boolean save(Product record){
        return productDao.insertProductSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return productDao.deleteProductByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(Product record){
        return productDao.updateProductByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public Product findById(Long id){
        return productDao.selectProductByPrimaryKey(id);
    }
    
}
