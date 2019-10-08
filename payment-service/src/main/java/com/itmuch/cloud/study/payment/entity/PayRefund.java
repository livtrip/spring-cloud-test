package com.itmuch.cloud.study.payment.entity;

import java.io.Serializable;
import java.util.Date;

public class PayRefund implements Serializable {
    private Long id;

    private String appId;

    private String appRefundNo;

    private String transactionId;

    private String tradeNo;

    private String refundNo;

    private Integer payMethodId;

    private String payChannel;

    private Integer refundFee;

    private Integer scale;

    private String refundReason;

    private String currencyCode;

    private Integer refundType;

    private String refundMethod;

    private Integer refundStatus;

    private String createIp;

    private String createPerson;

    private Date createTime;

    private String updatePerson;

    private Date updateTime;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppRefundNo() {
        return appRefundNo;
    }

    public void setAppRefundNo(String appRefundNo) {
        this.appRefundNo = appRefundNo == null ? null : appRefundNo.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    public Integer getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(String refundMethod) {
        this.refundMethod = refundMethod == null ? null : refundMethod.trim();
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", appRefundNo=").append(appRefundNo);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", refundNo=").append(refundNo);
        sb.append(", payMethodId=").append(payMethodId);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", scale=").append(scale);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", refundType=").append(refundType);
        sb.append(", refundMethod=").append(refundMethod);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", createIp=").append(createIp);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}