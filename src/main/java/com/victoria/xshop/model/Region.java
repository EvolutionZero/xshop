/*
 * @ClassName Region
 * @Description 
 * @version 1.0
 * @Date 2018-06-28 02:04:37
 */
package com.victoria.xshop.model;

public class Region {
    /**
     * @Fields id 
     */
    private Long id;
    /**
     * @Fields parentId 
     */
    private Long parentId;
    /**
     * @Fields name 
     */
    private String name;
    /**
     * @Fields type 
     */
    private Integer type;
    /**
     * @Fields agencyId 
     */
    private Long agencyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }
}