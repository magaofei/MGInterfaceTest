package com.magaofei.tool.dao;

import java.util.Date;

public class InterfaceTask {




    private int id;

    private int projectId;
    private String runTime;



    private int status;
    private String remark;
    private int deleted;
    private Date gmtCreate;
    private Date gmtModified;

    public InterfaceTask() {
    }

    public InterfaceTask(int id, int projectId, String runTime, int status, String remark, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.projectId = projectId;
        this.runTime = runTime;
        this.status = status;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
