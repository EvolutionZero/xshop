/*
 * @ClassName UserRoleKey
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 14:55:35
 */
package com.victoria.xshop.project.user.bean.po;

public class UserRoleKey {
    /**
     * @Fields userId 
     */
    private Integer userId;
    /**
     * @Fields roleId 
     */
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}