/*
 Navicat MySQL Data Transfer

 Source Server         : mysql
 Source Server Version : 50633
 Source Host           : localhost
 Source Database       : demo

 Target Server Version : 50633
 File Encoding         : utf-8

 Date: 04/17/2017 20:01:03 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` varchar(50) NOT NULL DEFAULT '',
  `name` varchar(50) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

