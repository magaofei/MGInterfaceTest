package com.magaofei.tool.entity;

import java.sql.Timestamp;

/**
 *
 * 接口需要支持前置动作和后置动作
 * 还有检查点(断言)和上下文变量功能(参数替换)
 */
public class InterfaceInfo extends InterfaceBase {
    private Timestamp lastUpdateDate;
}
