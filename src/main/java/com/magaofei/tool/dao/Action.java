package com.magaofei.tool.entity;

public class Action {
    /**
     * 前置动作或后置动作
     * 动作表
     * 动作名
     * 团队
     * 备注
     * 存储动作类型:
     *     执行SQL, 已有测试用例, 执行自定义方法, 等待时间
     *     数据库名
     *               用例ID         方法名   时间
     *     SQL语句
     *
     *
     */

    private int id;

    private int teamId;
    private int actionName;

    private int actionRemark;

    private InterfaceTestcaseActionEnum actionType;
    private String actionSql;

    private String actionRule;

    private int interfaceId;



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getActionName() {
        return actionName;
    }

    public void setActionName(int actionName) {
        this.actionName = actionName;
    }

    public int getActionRemark() {
        return actionRemark;
    }

    public void setActionRemark(int actionRemark) {
        this.actionRemark = actionRemark;
    }

    public InterfaceTestcaseActionEnum getActionType() {
        return actionType;
    }

    public void setActionType(InterfaceTestcaseActionEnum actionType) {
        this.actionType = actionType;
    }

    public String getActionSql() {
        return actionSql;
    }

    public void setActionSql(String sql) {
        this.actionSql = actionSql;
    }

    public String getActionRule() {
        return actionRule;
    }

    public void setActionRule(String actionRule) {
        this.actionRule = actionRule;
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(int interfaceId) {
        this.interfaceId = interfaceId;
    }


}
