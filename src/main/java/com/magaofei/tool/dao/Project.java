package com.magaofei.tool.dao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 项目
 * @author mark
 */

public class Project {

    private int id;

    @NotNull
    @Size(min = 1, max = 20)
    private String name;

    @NotNull
    @Email
    @Size(min = 1, max = 50)
    private String email;

    @NotNull
    private String dingtalkUrl;

    @NotNull
    private String remark;

    @NotNull
    private String host;

    @NotNull
    private String proxy;

    @NotNull
    private Integer environment;

    private Date gmtCreate;
    private Date gmtModified;

    public Project() {
    }


    Project(String name, String email, String dingtalkUrl, String remark, String host, String proxy, int environment) {

        if (gmtModified == null) {
            this.gmtModified = new Date();
        }
        this.name = name;
        this.email = email;
        this.dingtalkUrl = dingtalkUrl;
        this.remark = remark;
        this.host = host;
        this.proxy = proxy;
        this.environment = environment;
        this.gmtCreate = new Date();
        this.gmtModified = new Date();

    }

    Project(int id, String name, String email, String dingtalkUrl, String remark, String host, String proxy, int environment, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dingtalkUrl = dingtalkUrl;
        this.remark = remark;
        this.host = host;
        this.proxy = proxy;
        this.environment = environment;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }


    @Override
    public String toString() {
        return getName() + getEmail() + getHost() + getGmtModified();
    }

    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDingtalkUrl() {
        return dingtalkUrl;
    }

    public void setDingtalkUrl(String dingtalkUrl) {
        this.dingtalkUrl = dingtalkUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
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
