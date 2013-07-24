/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : smartnav

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-07-23 19:43:03
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
-- Table structure for `sn_dist`
-- ----------------------------
DROP TABLE IF EXISTS `sn_dist`;
CREATE TABLE `sn_dist` (
  `id` int(10) NOT NULL,
  `start` int(2) NOT NULL,
  `end` int(2) NOT NULL,
  `weight` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_dist
-- ----------------------------
INSERT INTO `sn_dist` VALUES ('1', '1', '2', '1357.80697');
INSERT INTO `sn_dist` VALUES ('2', '2', '3', '769.75116');
INSERT INTO `sn_dist` VALUES ('3', '3', '4', '673.50285');
INSERT INTO `sn_dist` VALUES ('4', '4', '5', '1776.77474');
INSERT INTO `sn_dist` VALUES ('5', '4', '6', '1156.00433');
INSERT INTO `sn_dist` VALUES ('6', '6', '7', '217.93004');
INSERT INTO `sn_dist` VALUES ('7', '6', '8', '246.13699');
INSERT INTO `sn_dist` VALUES ('8', '7', '9', '220.41912');
INSERT INTO `sn_dist` VALUES ('9', '8', '10', '215.91636');
INSERT INTO `sn_dist` VALUES ('10', '9', '11', '223.74089');
INSERT INTO `sn_dist` VALUES ('11', '9', '13', '424.98441');
INSERT INTO `sn_dist` VALUES ('12', '10', '12', '202.91859');
INSERT INTO `sn_dist` VALUES ('13', '10', '14', '424.84652');
INSERT INTO `sn_dist` VALUES ('14', '11', '15', '200.59656');
INSERT INTO `sn_dist` VALUES ('15', '12', '16', '201.40806');
INSERT INTO `sn_dist` VALUES ('16', '13', '15', '313.88604');
INSERT INTO `sn_dist` VALUES ('17', '13', '18', '512.84859');
INSERT INTO `sn_dist` VALUES ('18', '14', '16', '311.27231');
INSERT INTO `sn_dist` VALUES ('19', '14', '20', '503.52166');
INSERT INTO `sn_dist` VALUES ('20', '15', '17', '138.722');
INSERT INTO `sn_dist` VALUES ('21', '16', '17', '117.93354');
INSERT INTO `sn_dist` VALUES ('22', '17', '19', '495.51263');
INSERT INTO `sn_dist` VALUES ('23', '18', '19', '443.94979');
INSERT INTO `sn_dist` VALUES ('24', '19', '20', '427.22096');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

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
-- Table structure for `sn_point`
-- ----------------------------
DROP TABLE IF EXISTS `sn_point`;
CREATE TABLE `sn_point` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `point_name` varchar(50) NOT NULL,
  `point_latitude` double NOT NULL,
  `point_longitude` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_point
-- ----------------------------
INSERT INTO `sn_point` VALUES ('1', 'v1', '36.665689', '117.117739');
INSERT INTO `sn_point` VALUES ('2', 'v2', '36.666398', '117.132939');
INSERT INTO `sn_point` VALUES ('3', 'v3', '36.665269', '117.141455');
INSERT INTO `sn_point` VALUES ('4', 'v4', '36.667382', '117.148533');
INSERT INTO `sn_point` VALUES ('5', 'v5', '36.673085', '117.167146');
INSERT INTO `sn_point` VALUES ('6', 'v6', '36.676283', '117.141832');
INSERT INTO `sn_point` VALUES ('7', 'v7', '36.676341', '117.139389');
INSERT INTO `sn_point` VALUES ('8', 'v8', '36.678223', '117.143162');
INSERT INTO `sn_point` VALUES ('9', 'v9', '36.677687', '117.137574');
INSERT INTO `sn_point` VALUES ('10', 'v10', '36.680032', '117.142281');
INSERT INTO `sn_point` VALUES ('11', 'v11', '36.679699', '117.137628');
INSERT INTO `sn_point` VALUES ('12', 'v12', '36.680828', '117.140233');
INSERT INTO `sn_point` VALUES ('13', 'v13', '36.679844', '117.133639');
INSERT INTO `sn_point` VALUES ('14', 'v14', '36.683852', '117.142155');
INSERT INTO `sn_point` VALUES ('15', 'v15', '36.68132', '117.13664');
INSERT INTO `sn_point` VALUES ('16', 'v16', '36.68242', '117.139155');
INSERT INTO `sn_point` VALUES ('17', 'v17', '36.682014', '117.137933');
INSERT INTO `sn_point` VALUES ('18', 'v18', '36.683823', '117.130729');
INSERT INTO `sn_point` VALUES ('19', 'v19', '36.68582', '117.135041');
INSERT INTO `sn_point` VALUES ('20', 'v20', '36.687716', '117.139209');

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
