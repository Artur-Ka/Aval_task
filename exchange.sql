/*
Navicat MySQL Data Transfer

Source Server         : MMO_Develop
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : aval_test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-09-02 23:01:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for exchange
-- ----------------------------
DROP TABLE IF EXISTS `exchange`;
CREATE TABLE `exchange` (
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `date` date NOT NULL,
  `rate` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of exchange
-- ----------------------------
INSERT INTO `exchange` VALUES ('USD', '2020-02-01', '25.3');
INSERT INTO `exchange` VALUES ('EUR', '2020-02-01', '27.3');
INSERT INTO `exchange` VALUES ('USD', '2020-02-02', '26.1');
INSERT INTO `exchange` VALUES ('EUR', '2020-02-02', '28.35');
INSERT INTO `exchange` VALUES ('EUR', '2020-02-03', '28.37');
INSERT INTO `exchange` VALUES ('EUR', '2020-02-04', '28.4');
INSERT INTO `exchange` VALUES ('USD', '2020-02-07', '26.3');
SET FOREIGN_KEY_CHECKS=1;
