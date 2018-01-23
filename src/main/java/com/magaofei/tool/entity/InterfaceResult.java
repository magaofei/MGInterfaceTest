package com.magaofei.tool.entity;

import java.sql.Timestamp;

/*
* 接口结果表
* */
public class InterfaceResult extends InterfaceBase{

    private Integer interfaceInfoId;

    private Timestamp startTime;
    private Timestamp endTime;
    private Integer responseTimeLength;
    private String resultError;
    private String responseData;
    private Integer batchIndex;
    private Integer batchType;
    private Integer responseStatusCode;
    private boolean success;

    private String responseCookies;
    private String responseHeaders;
    private String responseReason;
    private Integer timeOut;
    private Integer errorType;

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getResponseTimeLength() {
        return responseTimeLength;
    }

    public void setResponseTimeLength(Integer responseTimeLength) {
        this.responseTimeLength = responseTimeLength;
    }

    public String getResultError() {
        return resultError;
    }

    public void setResultError(String resultError) {
        this.resultError = resultError;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public Integer getBatchType() {
        return batchType;
    }

    public void setBatchType(Integer batchType) {
        this.batchType = batchType;
    }

    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResponseCookies() {
        return responseCookies;
    }

    public void setResponseCookies(String responseCookies) {
        this.responseCookies = responseCookies;
    }

    public String getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(String responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public String getResponseReason() {
        return responseReason;
    }

    public void setResponseReason(String responseReason) {
        this.responseReason = responseReason;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    public Integer getErrorType() {
        return errorType;
    }

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }





}
