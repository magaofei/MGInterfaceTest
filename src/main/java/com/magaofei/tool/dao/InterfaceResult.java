package com.magaofei.tool.entity;

import java.util.Date;

/**
 * 接口结果
 */
public class InterfaceResult  {


    private int id;

    private int interfaceCaseId;
    private int interfaceInfoId;
    private int taskId;
    private int categoryId;
    private String url;
    private String name;
    private String method;
    private String params;
    private String headers;
    private int level;
    private int responseTimeLength;
    private int status;
    private String responseCookie;
    private int statusCode;
    private String responseTxt;
    private String responseHeaders;
    private String contextVariable;
    private String validators;
    private int sort;
    private int deleted;

    private Date gmtCreate;
    private Date gmtModified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getInterfaceCaseId() {
        return interfaceCaseId;
    }

    public void setInterfaceCaseId(int interfaceCaseId) {
        this.interfaceCaseId = interfaceCaseId;
    }

    public int getInterfaceInfoId() {
        return interfaceInfoId;
    }

    public void setInterfaceInfoId(int interfaceInfoId) {
        this.interfaceInfoId = interfaceInfoId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getResponseTimeLength() {
        return responseTimeLength;
    }

    public void setResponseTimeLength(int responseTimeLength) {
        this.responseTimeLength = responseTimeLength;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResponseCookie() {
        return responseCookie;
    }

    public void setResponseCookie(String responseCookie) {
        this.responseCookie = responseCookie;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseTxt() {
        return responseTxt;
    }

    public void setResponseTxt(String responseTxt) {
        this.responseTxt = responseTxt;
    }

    public String getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(String responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public String getContextVariable() {
        return contextVariable;
    }

    public void setContextVariable(String contextVariable) {
        this.contextVariable = contextVariable;
    }

    public String getValidators() {
        return validators;
    }

    public void setValidators(String validators) {
        this.validators = validators;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }




}
