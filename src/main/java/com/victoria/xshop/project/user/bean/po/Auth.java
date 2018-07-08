/*
 * @ClassName Auth
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 14:55:35
 */
package com.victoria.xshop.project.user.bean.po;

import java.util.Date;

public class Auth {
    /**
     * @Fields authId 
     */
    private Integer authId;
    /**
     * @Fields authName 
     */
    private String authName;
    /**
     * @Fields orderNum 
     */
    private Integer orderNum;
    /**
     * @Fields perms 
     */
    private String perms;
    /**
     * @Fields createBy 
     */
    private String createBy;
    /**
     * @Fields createTime 
     */
    private Date createTime;
    /**
     * @Fields updateBy 
     */
    private String updateBy;
    /**
     * @Fields updateTime 
     */
    private Date updateTime;
    /**
     * @Fields remark 
     */
    private String remark;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}