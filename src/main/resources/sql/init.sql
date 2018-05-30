CREATE TABLE `interface_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interface_url` varchar(150) NOT NULL,
  `interface_name` varchar(20) NOT NULL,
  `interface_secret` varchar(50) NOT NULL,
  `request_method` varchar(10) NOT NULL,
  `request_data_type` varchar(20) NOT NULL,
  `request_data_text` varchar(1000) NOT NULL,
  `request_headers` varchar(1000) NOT NULL,
  `interface_environment` smallint(5) unsigned NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `create_date` datetime(6) NOT NULL,
  `remarks` varchar(1000) NOT NULL,
  `last_update_date` datetime(6) NOT NULL,
  `interface_prefix_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


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
  `status` TINYINT(1) unsigned NOT NULL DEFAULT 0 COMMENT "是否启用",
  `current_result` TINYINT(2) unsigned NOT NULL DEFAULT 0 COMMENT "0 未定, 1成功 2 失败"
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `test_case_id` int (11) unsigned NOT NULL DEFAULT 0 COMMENT "用例表 id",
  `url` varchar(100) NOT NULL DEFAULT "" COMMENT "接口 URL ",
  `name` varchar(10) NOT NULL DEFAULT "" COMMENT "接口名",
  `method` varchar(10) NOT NULL ,
  `request_data_type` varchar(20) NOT NULL,
  `request_data_text` varchar(1000) NOT NULL,
  `request_headers` varchar(1000) NOT NULL,
  `interface_environment` smallint(5) unsigned NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `create_date` datetime(6) NOT NULL,
  `remarks` varchar(1000) NOT NULL,
  `last_update_date` datetime(6) NOT NULL,
  `interface_prefix_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
