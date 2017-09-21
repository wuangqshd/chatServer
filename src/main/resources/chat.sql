/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : chat

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-08-05 21:19:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chatcontext
-- ----------------------------
DROP TABLE IF EXISTS `chatcontext`;
CREATE TABLE `chatcontext` (
  `ID` varchar(255) NOT NULL,
  `chatContext` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chatcontext
-- ----------------------------
INSERT INTO `chatcontext` VALUES ('1', '1', '1', '12', '1');

-- ----------------------------
-- Table structure for chatrecord
-- ----------------------------
DROP TABLE IF EXISTS `chatrecord`;
CREATE TABLE `chatrecord` (
  `ID` varchar(36) NOT NULL,
  `sendNum` varchar(36) DEFAULT NULL,
  `getNum` varchar(36) DEFAULT NULL,
  `sendTime` varchar(255) DEFAULT NULL,
  `msgId` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chatrecord
-- ----------------------------

-- ----------------------------
-- Table structure for chatuser
-- ----------------------------
DROP TABLE IF EXISTS `chatuser`;
CREATE TABLE `chatuser` (
  `ID` char(36) NOT NULL,
  `chatNum` char(36) DEFAULT NULL,
  `userId` char(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `userPasswd` varchar(255) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userSex` char(10) DEFAULT NULL,
  `userAddress` varchar(255) DEFAULT NULL,
  `userPhone` varchar(255) DEFAULT NULL,
  `userPic` varchar(255) DEFAULT NULL,
  `userHome` varchar(255) DEFAULT NULL,
  `userContext` varchar(255) DEFAULT NULL,
  `isOnline` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chatuser
-- ----------------------------
INSERT INTO `chatuser` VALUES ('fdasdasdffasdf', '00001', '其实很淡', '吴洋洋', 'admin', '21', '男', '河南省郑州市', '18703654569', 'http://www.baidu.com', '江苏省徐州市', '天天向上', '1');

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `ID` varchar(36) NOT NULL,
  `chatNum` varchar(36) DEFAULT NULL,
  `friendNum` varchar(36) DEFAULT NULL,
  `groupId` varchar(36) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `isLink` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `ID` varchar(36) NOT NULL,
  `groupNum` varchar(36) DEFAULT NULL,
  `createNum` varchar(36) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `groupName` varchar(255) DEFAULT NULL,
  `groupPic` varchar(255) DEFAULT NULL,
  `groupContext` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for grouping
-- ----------------------------
DROP TABLE IF EXISTS `grouping`;
CREATE TABLE `grouping` (
  `ID` varchar(36) NOT NULL,
  `chatNum` varchar(36) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `groupName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grouping
-- ----------------------------

-- ----------------------------
-- Table structure for grouprelationship
-- ----------------------------
DROP TABLE IF EXISTS `grouprelationship`;
CREATE TABLE `grouprelationship` (
  `ID` varchar(36) NOT NULL,
  `groupId` varchar(36) DEFAULT NULL,
  `chatNum` varchar(36) DEFAULT NULL,
  `addTime` varchar(255) DEFAULT NULL,
  `groupViewName` varchar(255) DEFAULT NULL,
  `isNoSay` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grouprelationship
-- ----------------------------

-- ----------------------------
-- Table structure for loginrecord
-- ----------------------------
DROP TABLE IF EXISTS `loginrecord`;
CREATE TABLE `loginrecord` (
  `ID` varchar(36) NOT NULL,
  `chatNum` varchar(36) DEFAULT NULL,
  `loginIp` varchar(255) DEFAULT NULL,
  `loginPort` varchar(255) DEFAULT NULL,
  `loginTime` varchar(255) DEFAULT NULL,
  `isOnline` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginrecord
-- ----------------------------
