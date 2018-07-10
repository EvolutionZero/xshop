package com.victoria.xshop.project.product.bean.vo;

import com.victoria.xshop.project.product.bean.po.Goods;
import com.victoria.xshop.project.product.bean.po.Product;
import lombok.Data;

import java.util.List;

@Data
public class GoodsView {

    private Product product;
    private List<Goods> goods;
}

