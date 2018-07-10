package com.victoria.xshop.project.product.service;

import com.victoria.xshop.project.product.bean.po.Goods;
import com.victoria.xshop.project.product.bean.vo.GoodsView;

public interface GoodsService {
	
    boolean save(Goods record);

    boolean deleteById(Long id);

    boolean updateById(Goods record);

    Goods findById(Long id);

    public GoodsView findByProductId(Long productId);
}
