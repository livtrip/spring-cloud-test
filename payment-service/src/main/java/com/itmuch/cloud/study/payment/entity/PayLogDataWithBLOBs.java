package com.itmuch.cloud.study.payment.entity;

import java.io.Serializable;

public class PayLogDataWithBLOBs extends PayLogData implements Serializable {
    private String requestHeader;

    private String requestParams;

    private static final long serialVersionUID = 1L;

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader == null ? null : requestHeader.trim();
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams == null ? null : requestParams.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", requestHeader=").append(requestHeader);
        sb.append(", requestParams=").append(requestParams);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}