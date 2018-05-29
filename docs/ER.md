# 数据库

## table
project   项目管理
  - name    VarChar
  - email   VarChar
  - dingtalk_url    VarChar
  - remark    VarChar
  
test_case    用例管理
  - name     VarChar
  - project_id    int
  - level       TINY_INT
  - config_id    int
  - remark       VarChar

interface_info   接口信息
  - test_case_id  用例 id  一条用例对应多条接口   int
  - url      VarChar
  - method   VarChar
  - param    VarChar
  - headers  VarChar
  - variable   VarChar
  - extract    VarChar
  - validators   VarChar

interface_result    接口结果
  - interface_info_id
  - url 
  - method   VarChar
  - param    VarChar
  - headers  VarChar
  - variable   VarChar
  - extract    VarChar
  - validators   VarChar

  
task   定时任务
  - name    VarChar
  - run_time    VarChar
  - result     Tiny_Int
  - status     Tiny_Int

config   配置管理 
  - url              VarChar
  - headers          VarChar
  - variable_binds   VarChar