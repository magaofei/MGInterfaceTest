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
)ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
