/*
 * @ClassName Role
 * @Description 
 * @version 1.0
 * @Date 2018-07-05 15:26:03
 */
package com.victoria.xshop.project.user.bean.po;

import java.util.Date;

public class Role {
    /**
     * @Fields roleId ��ɫID
     */
    private Integer roleId;
    /**
     * @Fields roleName ��ɫ����
     */
    private String roleName;
    /**
     * @Fields roleKey ��ɫȨ���ַ���
     */
    private String roleKey;
    /**
     * @Fields roleSort ��ʾ˳��
     */
    private Integer roleSort;
    /**
     * @Fields status ��ɫ״̬:0����,1����
     */
    private Integer status;
    /**
     * @Fields createBy ������
     */
    private String createBy;
    /**
     * @Fields createTime ����ʱ��
     */
    private Date createTime;
    /**
     * @Fields updateBy ������
     */
    private String updateBy;
    /**
     * @Fields updateTime ����ʱ��
     */
    private Date updateTime;
    /**
     * @Fields remark ��ע
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