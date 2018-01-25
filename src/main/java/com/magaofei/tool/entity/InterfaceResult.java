package com.magaofei.tool.entity;

import java.sql.Timestamp;

/*
* 接口结果表
* */
public class InterfaceResult extends InterfaceBase{

    private int interfaceInfoId;

    private Timestamp startTime;
    private Timestamp endTime;
    private int responseTimeLength;
    private String resultError;
    private String responseData;
    private int batchIndex;
    private int batchType;
    private int responseStatusCode;
    private boolean success;

    private String responseCookies;
    private String responseHeaders;
    private String responseReason;
    private int timeOut;
    private int errorType;

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

    public int getResponseTimeLength() {
        return responseTimeLength;
    }

    public void setResponseTimeLength(int responseTimeLength) {
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

    public int getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(int batchIndex) {
        this.batchIndex = batchIndex;
    }

    public int getBatchType() {
        return batchType;
    }

    public void setBatchType(int batchType) {
        this.batchType = batchType;
    }

    public int getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(int responseStatusCode) {
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

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }





}
