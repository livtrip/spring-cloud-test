package com.itmuch.cloud.study.payment.entity;

import java.io.Serializable;
import java.util.Date;

public class PayTransaction implements Serializable {
    private Long id;

    private String appId;

    private Integer payMethodId;

    private String appOrderId;

    private String transactionId;

    private Integer totalFee;

    private Byte scale;

    private String currencyCode;

    private String payChannel;

    private Date expireTime;

    private String returnUrl;

    private String notifyUrl;

    private String email;

    private String singType;

    private String intputCharset;

    private Date paymentTime;

    private Date notifyTime;

    private Date finishTime;

    private String tradeNo;

    private String transactionCode;

    private Byte orderStatus;

    private String createIp;

    private String updateIp;

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

    public Integer getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    public String getAppOrderId() {
        return appOrderId;
    }

    public void setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId == null ? null : appOrderId.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Byte getScale() {
        return scale;
    }

    public void setScale(Byte scale) {
        this.scale = scale;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSingType() {
        return singType;
    }

    public void setSingType(String singType) {
        this.singType = singType == null ? null : singType.trim();
    }

    public String getIntputCharset() {
        return intputCharset;
    }

    public void setIntputCharset(String intputCharset) {
        this.intputCharset = intputCharset == null ? null : intputCharset.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode == null ? null : transactionCode.trim();
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public String getUpdateIp() {
        return updateIp;
    }

    public void setUpdateIp(String updateIp) {
        this.updateIp = updateIp == null ? null : updateIp.trim();
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
        sb.append(", payMethodId=").append(payMethodId);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", scale=").append(scale);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", returnUrl=").append(returnUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", email=").append(email);
        sb.append(", singType=").append(singType);
        sb.append(", intputCharset=").append(intputCharset);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", notifyTime=").append(notifyTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", transactionCode=").append(transactionCode);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", createIp=").append(createIp);
        sb.append(", updateIp=").append(updateIp);
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