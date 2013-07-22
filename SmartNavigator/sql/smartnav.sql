/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : smartnav

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-07-22 10:13:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sn_admin`
-- ----------------------------
DROP TABLE IF EXISTS `sn_admin`;
CREATE TABLE `sn_admin` (
  `admin_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(25) NOT NULL,
  `admin_email` varchar(50) NOT NULL,
  `admin_pw` varchar(100) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_admin
-- ----------------------------
INSERT INTO `sn_admin` VALUES ('1', 'admin', 'admin@smartnav.com', 'admin');

-- ----------------------------
-- Table structure for `sn_place_entertainment`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_entertainment`;
CREATE TABLE `sn_place_entertainment` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `notice` text,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_entertainment
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_place_hotel`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_hotel`;
CREATE TABLE `sn_place_hotel` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `star_level` int(1) unsigned DEFAULT NULL,
  `min_price` varchar(10) DEFAULT NULL,
  `max_price` varchar(10) DEFAULT NULL,
  `empty_room` int(5) unsigned DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `notice` text,
  `tel` varchar(15) DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_hotel
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_place_meta`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_meta`;
CREATE TABLE `sn_place_meta` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `place_name` varchar(50) NOT NULL,
  `place_level` int(1) unsigned DEFAULT NULL,
  `place_type` int(2) unsigned NOT NULL,
  `place_descript` text,
  `place_latitude` double NOT NULL,
  `place_longitude` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_meta
-- ----------------------------
INSERT INTO `sn_place_meta` VALUES ('1', '山东大学齐鲁软件学院', '15', '14', '山大软件园校区，景色秀丽，地大物博', '36.673233', '117.146633');
INSERT INTO `sn_place_meta` VALUES ('2', '聚福楼', '18', '10', '聚福楼，美味菜肴', '36.669706', '117.14909');
INSERT INTO `sn_place_meta` VALUES ('3', '三鼎会馆', '18', '13', '会馆休闲养生', '36.670646', '117.148381');
INSERT INTO `sn_place_meta` VALUES ('4', ' 小城故事', '19', '11', '美味佳肴', '36.676168', '117.142623');
INSERT INTO `sn_place_meta` VALUES ('5', '瓦山新寨', '17', '11', '南方口味菜', '36.67772', '117.135872');
INSERT INTO `sn_place_meta` VALUES ('6', '明月乡村人家', '17', '10', '酒店', '36.678328', '117.134475');
INSERT INTO `sn_place_meta` VALUES ('7', '齐鲁软件园创业广场', '17', '12', '青山绿水', '36.678074', '117.140197');
INSERT INTO `sn_place_meta` VALUES ('8', ' 济南奥体中心', '12', '12', '全运会举办地，健身运动首选', '36.66321', '117.129126');
INSERT INTO `sn_place_meta` VALUES ('9', '雨滴广场', '18', '13', '集娱乐美食于一身', '36.678357', '117.136748');
INSERT INTO `sn_place_meta` VALUES ('10', '山东一卡通', '18', '14', '便利全民', '36.678031', '117.143364');

-- ----------------------------
-- Table structure for `sn_place_other`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_other`;
CREATE TABLE `sn_place_other` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_other
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_place_restaurant`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_restaurant`;
CREATE TABLE `sn_place_restaurant` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `avg_price` varchar(10) DEFAULT NULL,
  `flavor` varchar(20) DEFAULT NULL,
  `valuation` int(10) unsigned DEFAULT NULL,
  `notice` text,
  `tel` varchar(15) DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_restaurant
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_place_scenic`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_scenic`;
CREATE TABLE `sn_place_scenic` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `level` int(1) unsigned DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_scenic
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_user`
-- ----------------------------
DROP TABLE IF EXISTS `sn_user`;
CREATE TABLE `sn_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(25) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_pw` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_user
-- ----------------------------
INSERT INTO `sn_user` VALUES ('1', 'test', 'test@test.com', 'test');
