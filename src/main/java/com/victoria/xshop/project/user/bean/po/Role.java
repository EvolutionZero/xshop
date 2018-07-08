/*
 * @ClassName Role
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 14:55:35
 */
package com.victoria.xshop.project.user.bean.po;

import java.util.Date;

public class Role {
    /**
     * @Fields roleId 
     */
    private Integer roleId;
    /**
     * @Fields roleName 
     */
    private String roleName;
    /**
     * @Fields roleKey 
     */
    private String roleKey;
    /**
     * @Fields roleSort 
     */
    private Integer roleSort;
    /**
     * @Fields status 
     */
    private Integer status;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey == null ? null : roleKey.trim();
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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