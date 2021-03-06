/*
 * @ClassName User
 * @Description 
 * @version 1.0
 * @Date 2018-07-08 14:55:35
 */
package com.victoria.xshop.project.user.bean.po;

import java.util.Date;

public class User {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields username 
     */
    private String username;
    /**
     * @Fields password 
     */
    private String password;
    /**
     * @Fields gender 
     */
    private Integer gender;
    /**
     * @Fields birthday 
     */
    private Date birthday;
    /**
     * @Fields registerTime 
     */
    private Date registerTime;
    /**
     * @Fields lastLoginTime 
     */
    private Date lastLoginTime;
    /**
     * @Fields lastLoginIp 
     */
    private String lastLoginIp;
    /**
     * @Fields userAuthId 
     */
    private Byte userAuthId;
    /**
     * @Fields nickname 
     */
    private String nickname;
    /**
     * @Fields mobile 
     */
    private String mobile;
    /**
     * @Fields email 
     */
    private String email;
    /**
     * @Fields registerIp 
     */
    private String registerIp;
    /**
     * @Fields weixinOpenid 
     */
    private String weixinOpenid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Byte getUserAuthId() {
        return userAuthId;
    }

    public void setUserAuthId(Byte userAuthId) {
        this.userAuthId = userAuthId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid == null ? null : weixinOpenid.trim();
    }
}