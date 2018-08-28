/*
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL

Date: 2018年5月10日
Time：20点20分
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  `text` mediumtext,
  `tagId` smallint(6) DEFAULT NULL,
  `locked` tinyint(1) unsigned zerofill DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('00000000001', '这是我的第一篇文章', '2018-05-19 21:32:11', '2018-05-19 21:32:29', '第一篇文章只是测试一下系统能不能正常运行\r\n\r\n![enter image description here](https://imgsa.baidu.com/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=fcf279a7dc0735fa85fd46ebff3864d6/8644ebf81a4c510f8e1339a66859252dd52aa5b3.jpg \"take a picture\")\r\n\r\n', null, null);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'user:update');

-- ----------------------------
-- Table structure for permission_role
-- ----------------------------
DROP TABLE IF EXISTS `permission_role`;
CREATE TABLE `permission_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionId` int(11) NOT NULL,
  `roleId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `permission_id` (`permissionId`),
  KEY `role_id` (`roleId`),
  CONSTRAINT `permission_role_ibfk_1` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `permission_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission_role
-- ----------------------------
INSERT INTO `permission_role` VALUES ('1', '1', '1');
INSERT INTO `permission_role` VALUES ('2', '1', '2');
INSERT INTO `permission_role` VALUES ('3', '1', '3');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'blogger', null);
INSERT INTO `role` VALUES ('2', 'administrator', null);
INSERT INTO `role` VALUES ('3', 'normal_user', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `createTime` date DEFAULT NULL,
  `lastTime` datetime DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `sex` enum('male','female') DEFAULT 'male',
  `salt` varchar(50) DEFAULT NULL,
  `picture` varchar(64) DEFAULT NULL,
  `locked` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1','liuxv','349a38bf79ab58b8230bffa9123df82a','2018-05-19',null,'liuxver444@gmail.com','male','a639e90c546bc4ab25e50aa191d41dfb',null,'0');
-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`roleId`),
  KEY `user_role_ibfk_1` (`userId`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');

