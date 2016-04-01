/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.202
Source Server Version : 50173
Source Host           : 192.168.0.202:3306
Source Database       : studydata

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2016-03-31 17:38:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `members`
-- ----------------------------
DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `userstatus` int(11) DEFAULT NULL COMMENT '1:代表正常\r\n2:代表不可用',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of members
-- ----------------------------
INSERT INTO `members` VALUES ('1', 'zhangshan123', 'fdafafdafd121313', '1');
INSERT INTO `members` VALUES ('2', 'zhangshan123', 'fdafd@1212.com', '1');
INSERT INTO `members` VALUES ('3', 'zhangshan123\'', '\'\'\'\'fdafd@1212.com', '1');
INSERT INTO `members` VALUES ('4', 'zhangshan123\'', '\'\'\'\'fdafd@1212.com', '1');
