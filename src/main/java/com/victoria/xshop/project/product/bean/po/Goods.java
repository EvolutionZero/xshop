/*
 * @ClassName Goods
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 15:02:59
 */
package com.victoria.xshop.project.product.bean.po;

import java.math.BigDecimal;

public class Goods {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields productId 
     */
    private Long productId;
    /**
     * @Fields name 
     */
    private String name;
    /**
     * @Fields brief 
     */
    private String brief;
    /**
     * @Fields number 
     */
    private Long number;
    /**
     * @Fields unit 
     */
    private String unit;
    /**
     * @Fields saleStatus 
     */
    private Integer saleStatus;
    /**
     * @Fields goodsStatus 
     */
    private Integer goodsStatus;
    /**
     * @Fields price 
     */
    private BigDecimal price;
    /**
     * @Fields detail 
     */
    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}