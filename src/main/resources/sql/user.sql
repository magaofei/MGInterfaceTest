CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(20) NOT NULL DEFAULT '',
  `age` tinyint(2) NOT NULL DEFAULT 0,
  `user_name` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(30) NOT NULL DEFAULT '',
  `user_sex` varchar(10) NOT NULL DEFAULT '',
  `email` varchar(30) NOT NULL DEFAULT '',
  `is_staff` tinyint(1) NOT NULL DEFAULT 0,
  `is_active` tinyint(1) NOT NULL DEFAULT 0,
  `date_joined` datetime(6) NOT NULL,
  `last_login` datetime(6) NOT NULL,
  UNIQUE KEY `user_name` (`user_name`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;