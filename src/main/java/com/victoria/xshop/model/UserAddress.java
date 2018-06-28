/*
 * @ClassName UserAddress
 * @Description 
 * @version 1.0
 * @Date 2018-06-27 23:21:14
 */
package com.victoria.xshop.model;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class UserAddress {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields name 
     */
    private String name;

    /**
     * @Fields userId 
     */
    private Long userId;
    /**
     * @Fields countryId 
     */
    private Integer countryId;
    /**
     * @Fields provinceId 
     */
    private Integer provinceId;
    /**
     * @Fields cityId 
     */
    private Integer cityId;
    /**
     * @Fields districtId 
     */
    private Integer districtId;
    /**
     * @Fields address 
     */
    private String address;
    /**
     * @Fields mobile 
     */
    private String mobile;
    /**
     * @Fields isDefault 
     */
    private Integer isDefault;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", countryId=" + countryId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }

    public static void main(String[] args){
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(1L);
        userAddress.setCountryId(1);
        userAddress.setProvinceId(20);
        userAddress.setCityId(231);
        userAddress.setDistrictId(2389);
        userAddress.setName("home");
        userAddress.setAddress("Nanzhou Garden Zone A");
        userAddress.setMobile("18825000000");
        userAddress.setIsDefault(0);
        System.out.println(userAddress);
    }


}