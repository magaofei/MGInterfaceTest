package com.magaofei.tool.dao;


/**
 * 上下文变量(参数替换)
 *
 *
 * 团队
 * 参数名
 * 备注
 * 类型
 *     SQL,       已有测试用例返回结果
 *                 JSON,    正则        全部
 *     数据库名    取值规则  取值规则
 *     SQL语句     来自     来自        来自
 *     # 取到的字段
 *     # 结果获取方式
 *
 */
public class ContextVariable {

    private int id;

    private int interfaceInfoId;

    private int teamId;

    private String contextVariableName;
    private String contextVariableRemark;
    /**
     * 类型 : SQL/ 已有测试用例返回结果
     */

    private InterfaceTestcaseActionEnum interfaceTestcaseActionEnum;

    private ExtractingDataTypeEnum extractingDataTypeEnum;

    private String rule;
    private String comeFrom;

    public void setId(int id) {
        this.id = id;
    }


    // SQL  暂不支持SQL
//    private String databaseName;
//    private String sql;



//    private


}
