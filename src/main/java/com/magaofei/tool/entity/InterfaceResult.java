package com.magaofei.tool.entity;

import java.sql.Timestamp;

/*
* 接口结果表
* */
public class InterfaceResult extends InterfaceBase{

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



}
