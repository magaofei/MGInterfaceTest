package com.magaofei.tool.dao;



/*
* 存储实体类
*
*  各层命名规约:
A) Service/DAO层方法命名规约
1) 获取单个对象的方法用get做前缀。
2) 获取多个对象的方法用list做前缀，复数形式结尾如:listObjects。 3) 获取统计值的方法用count做前缀。
4) 插入的方法用save/insert做前缀。
5) 删除的方法用remove/delete做前缀。
6) 修改的方法用update做前缀。
B) 领域模型命名规约
1) 数据对象:xxxDO，xxx即为数据表名。
2) 数据传输对象:xxxDTO，xxx为业务领域相关的名称。 3) 展示对象:xxxVO，xxx一般为网页名称。
4) POJO是DO/DTO/BO/VO的统称，禁止命名成xxxPOJO。
*
* */