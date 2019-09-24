package com.itmuch.cloud.study.coupon.entity;

import java.io.Serializable;
import java.util.Date;

public class CouponDO implements Serializable {
    private Long id;

    private String code;

    private String name;

    private String description;

    private Integer type;

    private Integer status;

    private String offDefine;

    private Integer discount;

    private String randomDefine;

    private Integer cycle;

    private Integer cycleUnit;

    private String applyArea;

    private String applyStore;

    private String applyBrand;

    private String applyFirstCategory;

    private String applySecondCategory;

    private Date startTime;

    private Date endTime;

    private String obtainRule;

    private Integer numberLimit;

    private Integer refundPolicy;

    private Integer pointCost;

    private Integer exchangeCodeNumber;

    private String createPerson;

    private Date createTime;

    private String updatePerson;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOffDefine() {
        return offDefine;
    }

    public void setOffDefine(String offDefine) {
        this.offDefine = offDefine == null ? null : offDefine.trim();
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getRandomDefine() {
        return randomDefine;
    }

    public void setRandomDefine(String randomDefine) {
        this.randomDefine = randomDefine == null ? null : randomDefine.trim();
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Integer getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(Integer cycleUnit) {
        this.cycleUnit = cycleUnit;
    }

    public String getApplyArea() {
        return applyArea;
    }

    public void setApplyArea(String applyArea) {
        this.applyArea = applyArea == null ? null : applyArea.trim();
    }

    public String getApplyStore() {
        return applyStore;
    }

    public void setApplyStore(String applyStore) {
        this.applyStore = applyStore == null ? null : applyStore.trim();
    }

    public String getApplyBrand() {
        return applyBrand;
    }

    public void setApplyBrand(String applyBrand) {
        this.applyBrand = applyBrand == null ? null : applyBrand.trim();
    }

    public String getApplyFirstCategory() {
        return applyFirstCategory;
    }

    public void setApplyFirstCategory(String applyFirstCategory) {
        this.applyFirstCategory = applyFirstCategory == null ? null : applyFirstCategory.trim();
    }

    public String getApplySecondCategory() {
        return applySecondCategory;
    }

    public void setApplySecondCategory(String applySecondCategory) {
        this.applySecondCategory = applySecondCategory == null ? null : applySecondCategory.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getObtainRule() {
        return obtainRule;
    }

    public void setObtainRule(String obtainRule) {
        this.obtainRule = obtainRule == null ? null : obtainRule.trim();
    }

    public Integer getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
    }

    public Integer getRefundPolicy() {
        return refundPolicy;
    }

    public void setRefundPolicy(Integer refundPolicy) {
        this.refundPolicy = refundPolicy;
    }

    public Integer getPointCost() {
        return pointCost;
    }

    public void setPointCost(Integer pointCost) {
        this.pointCost = pointCost;
    }

    public Integer getExchangeCodeNumber() {
        return exchangeCodeNumber;
    }

    public void setExchangeCodeNumber(Integer exchangeCodeNumber) {
        this.exchangeCodeNumber = exchangeCodeNumber;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", offDefine=").append(offDefine);
        sb.append(", discount=").append(discount);
        sb.append(", randomDefine=").append(randomDefine);
        sb.append(", cycle=").append(cycle);
        sb.append(", cycleUnit=").append(cycleUnit);
        sb.append(", applyArea=").append(applyArea);
        sb.append(", applyStore=").append(applyStore);
        sb.append(", applyBrand=").append(applyBrand);
        sb.append(", applyFirstCategory=").append(applyFirstCategory);
        sb.append(", applySecondCategory=").append(applySecondCategory);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", obtainRule=").append(obtainRule);
        sb.append(", numberLimit=").append(numberLimit);
        sb.append(", refundPolicy=").append(refundPolicy);
        sb.append(", pointCost=").append(pointCost);
        sb.append(", exchangeCodeNumber=").append(exchangeCodeNumber);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}