CREATE TABLE `interface_check_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `come_from` smallint(5) unsigned NOT NULL,
  `mode` smallint(5) unsigned NOT NULL,
  `rules` varchar(50) NOT NULL,
  `expected_value` longtext NOT NULL,
  `interface_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_check_poin_interface_info_id_2428a134_fk_interface` (`interface_info_id`),
  CONSTRAINT `interface_check_poin_interface_info_id_2428a134_fk_interface` FOREIGN KEY (`interface_info_id`) REFERENCES `interface_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `interface_context_variable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `come_from` smallint(5) unsigned NOT NULL,
  `mode` smallint(5) unsigned NOT NULL,
  `rules` varchar(100) NOT NULL,
  `interface_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_context_va_interface_info_id_dc61fa19_fk_interface` (`interface_info_id`),
  CONSTRAINT `interface_context_va_interface_info_id_dc61fa19_fk_interface` FOREIGN KEY (`interface_info_id`) REFERENCES `interface_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;


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
  PRIMARY KEY (`id`),
  KEY `interface_info_interface_prefix_id_8ad06c67_fk_interface_info_id` (`interface_prefix_id`),
  CONSTRAINT `interface_info_interface_prefix_id_8ad06c67_fk_interface_info_id` FOREIGN KEY (`interface_prefix_id`) REFERENCES `interface_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_info_interface_tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interfaceinfo_id` int(11) NOT NULL,
  `interfacetags_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `interface_info_interface_interfaceinfo_id_interfa_53aca3b8_uniq` (`interfaceinfo_id`,`interfacetags_id`),
  KEY `interface_info_inter_interfacetags_id_6d6006f8_fk_interface` (`interfacetags_id`),
  CONSTRAINT `interface_info_inter_interfaceinfo_id_d6f29bdb_fk_interface` FOREIGN KEY (`interfaceinfo_id`) REFERENCES `interface_info` (`id`),
  CONSTRAINT `interface_info_inter_interfacetags_id_6d6006f8_fk_interface` FOREIGN KEY (`interfacetags_id`) REFERENCES `interface_tags` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `interface_result` (
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
  `start_time` double NOT NULL,
  `end_time` double NOT NULL,
  `response_time_length` double NOT NULL,
  `result_error` varchar(500) NOT NULL,
  `response_data_text` longtext NOT NULL,
  `batch_index` smallint(5) unsigned NOT NULL,
  `batch_type` smallint(5) unsigned NOT NULL,
  `response_status_code` smallint(5) unsigned NOT NULL,
  `is_success` tinyint(1) NOT NULL,
  `interface_tags` varchar(50) NOT NULL,
  `interface_prefix` smallint(5) unsigned DEFAULT NULL,
  `response_cookies` longtext NOT NULL,
  `response_headers` longtext NOT NULL,
  `response_reason` varchar(20) NOT NULL,
  `response_content_bytes` longtext NOT NULL,
  `time_out` smallint(5) unsigned NOT NULL,
  `interface_info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_result_interface_info_id_6e840337_fk_interface_info_id` (`interface_info_id`),
  CONSTRAINT `interface_result_interface_info_id_6e840337_fk_interface_info_id` FOREIGN KEY (`interface_info_id`) REFERENCES `interface_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=424 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `interface_result_check_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `come_from` smallint(5) unsigned NOT NULL,
  `mode` smallint(5) unsigned NOT NULL,
  `rules` varchar(50) NOT NULL,
  `expected_value` longtext NOT NULL,
  `assert_result` longtext NOT NULL,
  `interface_result_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_result_che_interface_result_id_efd34da7_fk_interface` (`interface_result_id`),
  CONSTRAINT `interface_result_che_interface_result_id_efd34da7_fk_interface` FOREIGN KEY (`interface_result_id`) REFERENCES `interface_result` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=294 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_context_variable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `come_from` smallint(5) unsigned NOT NULL,
  `mode` smallint(5) unsigned NOT NULL,
  `rules` varchar(100) NOT NULL,
  `value` longtext NOT NULL,
  `interface_result_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `interface_result_con_interface_result_id_85508842_fk_interface` (`interface_result_id`),
  CONSTRAINT `interface_result_con_interface_result_id_85508842_fk_interface` FOREIGN KEY (`interface_result_id`) REFERENCES `interface_result` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `interface_result_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_name` varchar(30) NOT NULL,
  `result_error` varchar(1000) NOT NULL,
  `report_time` double NOT NULL,
  `result_time_length` double NOT NULL,
  `batch_index` smallint(5) unsigned NOT NULL,
  `batch_type` smallint(5) unsigned NOT NULL,
  `is_success` tinyint(1) NOT NULL,
  `result_passing_rate` double NOT NULL,
  `response_coverage_time` smallint(5) unsigned NOT NULL,
  `result_count` smallint(5) unsigned NOT NULL,
  `access_case_count` smallint(5) unsigned NOT NULL,
  `error_case_count` smallint(5) unsigned NOT NULL,
  `access_interface_count` smallint(5) unsigned NOT NULL,
  `error_interface_count` smallint(5) unsigned NOT NULL,
  `task_environment` smallint(5) unsigned NOT NULL,
  `create_date` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `interface_tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

