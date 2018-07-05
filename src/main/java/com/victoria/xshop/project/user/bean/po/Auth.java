/*
 * @ClassName Auth
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.bean.po;

import java.util.Date;

public class Auth {
    /**
     * @Fields authId 权限ID
     */
    private Integer authId;
    /**
     * @Fields authName 权限名称
     */
    private String authName;
    /**
     * @Fields orderNum 显示顺序
     */
    private Integer orderNum;
    /**
     * @Fields perms 权限标识
     */
    private String perms;
    /**
     * @Fields createBy 创建者
     */
    private String createBy;
    /**
     * @Fields createTime 创建时间
     */
    private Date createTime;
    /**
     * @Fields updateBy 更新者
     */
    private String updateBy;
    /**
     * @Fields updateTime 更新时间
     */
    private Date updateTime;
    /**
     * @Fields remark 备注
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