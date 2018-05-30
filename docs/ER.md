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
  - status     TINY_INT
  - current_result TINYINT     
  - environment   TINYINT  环境id 测试 预发布 线上


interface_info   接口信息
  - test_case_id  用例 id  一条用例对应多条接口   int
  - category_id   int
  - name     VarChar
  - url      VarChar
  - method   VarChar
  - params    VarChar
  - headers  VarChar
  - context_variable_id   int
  - validators_id   int


interface_result    接口结果
  - interface_info_id   int
  - task_id   int
  - category_id   int
  - url      VarChar
  - method   VarChar
  - params    VarChar 
  - level     TINY_INT
  - headers  VarChar
  - response_time   SMALL_INT
  - status    TINY_INT    (打开, 确认, 解决, 误判, 标记为不会修复)
  - time    DATETIME
  - response_txt
  - response_headers
  - response_cookie
  - status_code
  - request_headers
  - context_variable   VarChar   保存上下文变量信息  KeyValue
  - validators   VarChar         保存断言信息       提取到的值和 预期 KeyValue
  

context_variable   上下文变量
  - interface_info_id  int
  - name      unique  VarChar
  - source    TINY_INT   (ResponseBody, ResponseHeader, ResponseCookie, ResponseCode)
  - method    TINY_INT   (JSON, RE, ALL)
  - rules     VarChar

validators   断言
  - interface_info_id  int
  - source    TINY_INT   (ResponseBody, ResponseHeader, ResponseCookie, ResponseCode)
  - method    TINY_INT   (JSON, RE, ALL)
  - way       TINY_INT   (==, <=, <, >=, >, IN)
  - expect_value  VarChar

  
task   定时任务
  - name    VarChar
  - project_id  int
  - run_time    VarChar    任务时间
  - current_result     Tiny_Int    最近一次结果成功或失败
  - status     Tiny_Int    (待运行, 停止)
  - remark    VarChar      备注
  - time      DATETIME     执行时间


category  接口标签
  - name

config   配置管理 
  - host              VarChar
  - headers          VarChar
  - variable_binds   VarChar
  
  

### 结果查找

### 检查点 与 上下文变量