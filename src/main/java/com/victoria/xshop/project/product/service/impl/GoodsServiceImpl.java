package com.victoria.xshop.project.product.service.impl;

import com.victoria.xshop.project.product.bean.po.Product;
import com.victoria.xshop.project.product.bean.vo.GoodsView;
import com.victoria.xshop.project.product.dao.GoodsDao;
import com.victoria.xshop.project.product.bean.po.Goods;
import com.victoria.xshop.project.product.dao.ProductDao;
import com.victoria.xshop.project.product.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public boolean save(Goods record){
        return goodsDao.insertGoodsSelective(record) == 1 ? true : false;
    }

    @Override
    public boolean deleteById(Long id){
        return goodsDao.deleteGoodsByPrimaryKey(id) == 1 ? true : false;
    }

    @Override
    public boolean updateById(Goods record){
        return goodsDao.updateGoodsByPrimaryKeySelective(record) == 1 ? true : false;
    }

    @Override
    public Goods findById(Long id){
        return goodsDao.selectGoodsByPrimaryKey(id);
    }

    @Override
    public GoodsView findByProductId(Long productId){
        Product product = productDao.selectProductByPrimaryKey(productId);
        List<Goods> goods = goodsDao.findByProductId(productId);
        GoodsView goodsView = new GoodsView();
        goodsView.setProduct(product);
        goodsView.setGoods(goods);

        return goodsView;
    }
}
