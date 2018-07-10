/*
 * @ClassName Product
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 15:02:59
 */
package com.victoria.xshop.project.product.bean.po;

import java.math.BigDecimal;

public class Product {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields name 
     */
    private String name;
    /**
     * @Fields brief 
     */
    private String brief;
    /**
     * @Fields order 
     */
    private Integer order;
    /**
     * @Fields status 
     */
    private Integer status;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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