


CREATE TABLE `project` (
  `id` SMALLINT (6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar (10) NOT NULL DEFAULT "",
  `email` varchar (100) NOT NULL DEFAULT "",
  `dingtalk_url` varchar (100) NOT NULL DEFAULT "",
  `remark` VARCHAR (200) NOT NULL DEFAULT "",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `test_case` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "项目表 id",
  `config_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "配置表 id",
  `level` TINYINT (2) unsigned NOT NULL DEFAULT 4 COMMENT "issue 等级, 0-4",
  `remark` VARCHAR (200) NOT NULL DEFAULT "" COMMENT "备注",
  `status` TINYINT(2) unsigned NOT NULL DEFAULT 0 COMMENT "0 启用  1 禁用  2 删除",
  `current_result` TINYINT(2) unsigned NOT NULL DEFAULT 0 COMMENT "0 未定, 1成功 2 失败",
  `environment` TINYINT(2) unsigned NOT NULL DEFAULT 0 COMMENT "0 测试  1 线上  2预发布",
  `create_date` datetime(6) NOT NULL DEFAULT "1070-01-01 00:00:00" COMMENT "创建时间",
  `last_update_date` datetime(6) NOT NULL DEFAULT "1070-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `test_case_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "用例表 id",
  `task_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "任务表id",
  `category_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "分类表 id ",
  `url` varchar(100) NOT NULL DEFAULT "" COMMENT "接口 URL ",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "接口名",
  `method` varchar(10) NOT NULL DEFAULT "GET" COMMENT "请求方法",
  `params` VARCHAR (300) NOT NULL DEFAULT "" COMMENT "请求参数",
  `headers` varchar(700) NOT NULL DEFAULT  "" COMMENT "请求头",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id`  int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息表 id",
  `test_case_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "用例表 id",
  `task_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "任务表id",
  `category_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "分类表 id ",
  `url` varchar(100) NOT NULL DEFAULT "" COMMENT "接口 URL ",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "接口名",
  `method` varchar(10) NOT NULL DEFAULT "GET" COMMENT "请求方法",
  `params` VARCHAR (300) NOT NULL DEFAULT "" COMMENT "请求参数",
  `headers` varchar(700) NOT NULL DEFAULT  "" COMMENT "请求头",
  `level` TINYINT (2) unsigned NOT NULL DEFAULT 4 COMMENT "issue 等级, 0-4",
  `response_time` SMALLINT (4) unsigned NOT NULL DEFAULT 0 COMMENT "响应时间",
  `status` TINYINT(2) unsigned NOT NULL DEFAULT 0 COMMENT "0 打开, 1 确认, 2 解决, 3 误判, 4 标记为不会修复",
  `create_date` datetime(6) NOT NULL DEFAULT "1070-01-01 00:00:00" COMMENT "创建时间",
  `response_txt` TEXT  NOT NULL COMMENT "响应数据, 文本",
  `response_headers` TEXT NOT NULL COMMENT "响应头",
  `response_cookie` varchar(1000) NOT NULL DEFAULT "" COMMENT "响应cookie",
  `status_code` SMALLINT (4) NOT NULL DEFAULT 0 COMMENT "响应码",
  `context_variable` varchar(2000) NOT NULL DEFAULT "" COMMENT "上下文变量数据",
  `validators` varchar(2000) NOT NULL DEFAULT "" COMMENT "上下文变量数据",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `context_variable` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息id",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "上下文变量名, 需英文",
  `source` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 ResponseBody 1 ResponseHeader 2 ResponseCookie 3 StatusCode",
  `method` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 JSON 1 RE 2 ALL",
  `rules` VARCHAR (50) NOT NULL DEFAULT "" COMMENT "规则",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `validators` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息id",
  `source` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 ResponseBody 1 ResponseHeader 2 ResponseCookie 3 StatusCode",
  `method` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 JSON 1 RE 2 ALL",
  `way` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 == 10 IN 20 < 21 <= 30 > 31 >= ",
  `expect_value` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "预期值",
  `actual_value` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "实际值",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `task` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "项目表 id",
  `run_time` VARCHAR (20) NOT NULL DEFAULT "" COMMENT "任务时间",
  `current_result` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 未执行  1成功  2失败",
  `status` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 待运行 1停止 2 删除",
  `remark` VARCHAR (200) NOT NULL DEFAULT "" COMMENT "备注",
  `current_run_time` datetime(6) NOT NULL DEFAULT "1070-01-01 00:00:00" COMMENT "最近一次执行时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `category` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "分类名称",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `config` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `url` VARCHAR (150) NOT NULL DEFAULT "" COMMENT "url",
  `headers` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "headers",
  `variable_binds` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "变量绑定",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

