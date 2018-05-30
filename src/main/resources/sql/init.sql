
CREATE TABLE `project` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar (10) NOT NULL DEFAULT "",
  `email` varchar (100) NOT NULL DEFAULT "",
  `dingtalk_url` varchar (100) NOT NULL DEFAULT "",
  `remark` VARCHAR (200) NOT NULL DEFAULT "",
  `host` varchar(100) NOT NULL DEFAULT "" COMMENT "接口 Host ",
  `proxy` VARCHAR (100) NOT NULL DEFAULT "" COMMENT "接口 代理",
  `environment` TINYINT(1) unsigned NOT NULL DEFAULT 0 COMMENT "0 测试  1 线上  2预发布",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_case` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "项目表 id",
  `config_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "配置表 id",
  `level` TINYINT (1) unsigned NOT NULL DEFAULT 4 COMMENT "issue 等级, 0-4",
  `remark` VARCHAR (200) NOT NULL DEFAULT "" COMMENT "备注",
  `status` TINYINT(1) unsigned NOT NULL DEFAULT 0 COMMENT "0 启用  1 禁用",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_case_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "用例表 id",
  `category_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "分类表 id ",
  `url` varchar(150) NOT NULL DEFAULT "" COMMENT "接口 URL ",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "接口名",
  `method` varchar(10) NOT NULL DEFAULT "GET" COMMENT "请求方法",
  `params` VARCHAR (700) NOT NULL DEFAULT "" COMMENT "请求参数",
  `headers` varchar(1000) NOT NULL DEFAULT  "" COMMENT "请求头",
  `sort` TINYINT(4) NOT NULL DEFAULT 0 COMMENT "排序 从0开始",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id`  int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息表 id",
  `interface_case_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "用例表 id",
  `task_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "任务表id",
  `category_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "分类表 id ",
  `url` varchar(100) NOT NULL DEFAULT "" COMMENT "接口 URL ",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "接口名",
  `method` varchar(10) NOT NULL DEFAULT "GET" COMMENT "请求方法",
  `params` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "请求参数",
  `headers` varchar(700) NOT NULL DEFAULT  "" COMMENT "请求头",
  `level` TINYINT (1) unsigned NOT NULL DEFAULT 4 COMMENT "issue 等级, 0-4",
  `response_time_length` SMALLINT (4) unsigned NOT NULL DEFAULT 0 COMMENT "响应时间",
  `status` TINYINT(1) unsigned NOT NULL DEFAULT 0 COMMENT "0 打开, 1 确认, 2 解决, 3 误判, 4 标记为不会修复",
  `response_cookie` varchar(1000) NOT NULL DEFAULT "" COMMENT "响应cookie",
  `status_code` SMALLINT (4) NOT NULL DEFAULT 0 COMMENT "响应码",
  `interface_result_response_txt_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "接口结果响应体id ",
  `interface_result_response_headers_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "接口结果响应头 id",
  `interface_result_context_variable_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "接口结果上下文变量 id ",
  `interface_result_validators_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "接口结果验证表 id ",
  `sort` TINYINT(4) NOT NULL DEFAULT 0 COMMENT "排序 从0开始",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_response_txt` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `response_txt` TEXT  NOT NULL COMMENT "响应数据, 文本",
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_response_headers` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `response_headers` TEXT NOT NULL COMMENT "响应头",
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_context_variable` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `context_variable` TEXT NOT NULL  COMMENT "上下文变量数据",
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_validators` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `validators` TEXT NOT NULL COMMENT "上下文变量数据",
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_context_variable` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息id",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "上下文变量名, 需英文",
  `source` TINYINT(1) NOT NULL DEFAULT 0 COMMENT "0 ResponseBody 1 ResponseHeader 2 ResponseCookie 3 StatusCode",
  `method` TINYINT(1) NOT NULL DEFAULT 0 COMMENT "0 JSON 1 RE 2 ALL",
  `rules` VARCHAR (50) NOT NULL DEFAULT "" COMMENT "规则",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_validators` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `interface_info_id` int(11) unsigned NOT NULL DEFAULT 0 COMMENT "接口信息id",
  `source` TINYINT(1) NOT NULL DEFAULT 0 COMMENT "0 ResponseBody 1 ResponseHeader 2 ResponseCookie 3 StatusCode",
  `method` TINYINT(1) NOT NULL DEFAULT 0 COMMENT "0 JSON 1 RE 2 ALL",
  `way` TINYINT(2) NOT NULL DEFAULT 0 COMMENT "0 == 10 IN 20 < 21 <= 30 > 31 >= ",
  `expect_value` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "预期值",
  `actual_value` VARCHAR (500) NOT NULL DEFAULT "" COMMENT "实际值",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `task` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `project_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "项目表 id",
  `run_time` VARCHAR (20) NOT NULL DEFAULT "" COMMENT "任务时间",
  `status` TINYINT(1) NOT NULL DEFAULT 0 COMMENT "0 待运行 1停止 2 删除",
  `remark` VARCHAR (200) NOT NULL DEFAULT "" COMMENT "备注",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `category` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "分类名称",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `config` (
  `id` int (11) unsigned NOT NULL AUTO_INCREMENT,
  `url` VARCHAR (150) NOT NULL DEFAULT "" COMMENT "url",
  `headers` VARCHAR (1000) NOT NULL DEFAULT "" COMMENT "headers",
  `variable_binds` VARCHAR (1000) NOT NULL DEFAULT "" COMMENT "预设变量绑定",
  `proxy` VARCHAR (200) NOT NULL DEFAULT "" COMMENT "代理设置",
  `is_deleted` TINYINT (1) unsigned NOT NULL DEFAULT 0 COMMENT "0 未删除  1已删除",
  `gmt_create` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "创建时间",
  `gmt_modified` datetime(6) NOT NULL DEFAULT "1970-01-01 00:00:00" COMMENT "最后更新时间",
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

