/*
 * @ClassName ActivityInfo
 * @Description 
 * @version 1.0
 * @Date 2018-11-07 15:05:54
 */
package com.victoria.xshop.project.goods.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="scrm_activity_info")
public class ActivityInfo {
    /**
     * @Fields id 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    /**
     * @Fields sellerId 商家id
     */
    @Column(name="seller_id")
    private String sellerId;
    /**
     * @Fields appId 公众号appid
     */
    @Column(name="app_id")
    private String appId;
    /**
     * @Fields name 活动名称
     */
    @Column(name="name")
    private String name;
    /**
     * @Fields type 活动类型:1-关注有礼活动；2-注册有礼活动，4-调研有礼，5-投票有礼,6-大转盘抽奖，7-签到有礼，8-完善资料，9-评价有礼
     */
    @Column(name="type")
    private Integer type;
    /**
     * @Fields url 活动url--现在不需要
     */
    @Column(name="url")
    private String url;
    /**
     * @Fields qrcodeUrl 活动二维码url
     */
    @Column(name="qrcode_url")
    private String qrcodeUrl;
    /**
     * @Fields costPoints 参与活动需要积分
     */
    @Column(name="cost_points")
    private Integer costPoints;
    /**
     * @Fields startTime 活动开始时间
     */
    @Column(name="start_time")
    private Date startTime;
    /**
     * @Fields endTime 活动结束时间
     */
    @Column(name="end_time")
    private Date endTime;
    /**
     * @Fields levelLimitFlag 0-无限制，1-有限制
     */
    @Column(name="level_limit_flag")
    private Integer levelLimitFlag;
    /**
     * @Fields levelLimitCode 活动限制参与等级代码（json数组）
     */
    @Column(name="level_limit_code")
    private String levelLimitCode;
    /**
     * @Fields levelLimitName 活动限制参与等级名称（json数组）
     */
    @Column(name="level_limit_name")
    private String levelLimitName;
    /**
     * @Fields extras 活动附加属性（特殊属性）
     */
    @Column(name="extras")
    private String extras;
    /**
     * @Fields status 活动状态: 0进行中，1未开始，2已结束，3-活动设置未完成状态，8-活动删除状态
     */
    @Column(name="status")
    private Byte status;
    /**
     * @Fields settingFlag 设置完成标记位（0完成，1未完成）
     */
    @Column(name="setting_flag")
    private Byte settingFlag;
    /**
     * @Fields rule 活动规则
     */
    @Column(name="rule")
    private String rule;
    /**
     * @Fields memo 备注
     */
    @Column(name="memo")
    private String memo;
    /**
     * @Fields createTime 
     */
    @Column(name="create_time")
    private Date createTime;
    /**
     * @Fields updateTime 
     */
    @Column(name="update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public ActivityInfo setId(Integer id) {
        this.id = id; return this;
    }

    public String getSellerId() {
        return sellerId;
    }

    public ActivityInfo setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();  return this;
    }

    public String getAppId() {
        return appId;
    }

    public ActivityInfo setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();  return this;
    }

    public String getName() {
        return name;
    }

    public ActivityInfo setName(String name) {
        this.name = name == null ? null : name.trim();  return this;
    }

    public Integer getType() {
        return type;
    }

    public ActivityInfo setType(Integer type) {
        this.type = type; return this;
    }

    public String getUrl() {
        return url;
    }

    public ActivityInfo setUrl(String url) {
        this.url = url == null ? null : url.trim();  return this;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public ActivityInfo setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl == null ? null : qrcodeUrl.trim();  return this;
    }

    public Integer getCostPoints() {
        return costPoints;
    }

    public ActivityInfo setCostPoints(Integer costPoints) {
        this.costPoints = costPoints; return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public ActivityInfo setStartTime(Date startTime) {
        this.startTime = startTime; return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public ActivityInfo setEndTime(Date endTime) {
        this.endTime = endTime; return this;
    }

    public Integer getLevelLimitFlag() {
        return levelLimitFlag;
    }

    public ActivityInfo setLevelLimitFlag(Integer levelLimitFlag) {
        this.levelLimitFlag = levelLimitFlag; return this;
    }

    public String getLevelLimitCode() {
        return levelLimitCode;
    }

    public ActivityInfo setLevelLimitCode(String levelLimitCode) {
        this.levelLimitCode = levelLimitCode == null ? null : levelLimitCode.trim();  return this;
    }

    public String getLevelLimitName() {
        return levelLimitName;
    }

    public ActivityInfo setLevelLimitName(String levelLimitName) {
        this.levelLimitName = levelLimitName == null ? null : levelLimitName.trim();  return this;
    }

    public String getExtras() {
        return extras;
    }

    public ActivityInfo setExtras(String extras) {
        this.extras = extras == null ? null : extras.trim();  return this;
    }

    public Byte getStatus() {
        return status;
    }

    public ActivityInfo setStatus(Byte status) {
        this.status = status; return this;
    }

    public Byte getSettingFlag() {
        return settingFlag;
    }

    public ActivityInfo setSettingFlag(Byte settingFlag) {
        this.settingFlag = settingFlag; return this;
    }

    public String getRule() {
        return rule;
    }

    public ActivityInfo setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();  return this;
    }

    public String getMemo() {
        return memo;
    }

    public ActivityInfo setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();  return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ActivityInfo setCreateTime(Date createTime) {
        this.createTime = createTime; return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public ActivityInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime; return this;
    }
}