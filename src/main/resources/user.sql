CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(15) DEFAULT NULL,
  `user_name` varchar(15) DEFAULT NULL,
  `user_sex` varchar(10) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  `age` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;