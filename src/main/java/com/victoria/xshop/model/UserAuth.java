/*
 * @ClassName UserAuth
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 23:21:14
 */
package com.victoria.xshop.model;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Mapper
public class UserAuth {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields name 
     */
    private String name;
    /**
     * @Fields description 
     */
    private String description;
    /**
     * @Fields startTime 
     */
    private Date startTime;
    /**
     * @Fields expireTime 
     */
    private Date expireTime;
    /**
     * @Fields isPerm 
     */
    private Integer isPerm;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getIsPerm() {
        return isPerm;
    }

    public void setIsPerm(Integer isPerm) {
        this.isPerm = isPerm;
    }
}