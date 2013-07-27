/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : smartnav

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2013-07-27 10:31:21
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
-- Table structure for `sn_comments`
-- ----------------------------
DROP TABLE IF EXISTS `sn_comments`;
CREATE TABLE `sn_comments` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `place_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `star` int(1) NOT NULL,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_comments
-- ----------------------------

-- ----------------------------
-- Table structure for `sn_discount`
-- ----------------------------
DROP TABLE IF EXISTS `sn_discount`;
CREATE TABLE `sn_discount` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `place_id` int(10) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `priority` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_discount
-- ----------------------------
INSERT INTO `sn_discount` VALUES ('1', '12', 'te', 'wqeq', '10');
INSERT INTO `sn_discount` VALUES ('4', '12', 'test', 'wqeq', '90');
INSERT INTO `sn_discount` VALUES ('5', '12', 'tewrtw', 'rewrw', '233');
INSERT INTO `sn_discount` VALUES ('6', '13', 'terte', 'dsadasd', '12');
INSERT INTO `sn_discount` VALUES ('7', '14', 'tetr', 'dada', '22');
INSERT INTO `sn_discount` VALUES ('8', '15', 'ds', 'dsada', '11');

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
INSERT INTO `sn_dist` VALUES ('1', '1', '21', '745.24503');
INSERT INTO `sn_dist` VALUES ('2', '2', '22', '227.13967');
INSERT INTO `sn_dist` VALUES ('3', '3', '23', '363.71034');
INSERT INTO `sn_dist` VALUES ('4', '4', '24', '568.69847');
INSERT INTO `sn_dist` VALUES ('5', '4', '25', '185.30056');
INSERT INTO `sn_dist` VALUES ('6', '6', '28', '147.64623');
INSERT INTO `sn_dist` VALUES ('7', '6', '31', '84.70123');
INSERT INTO `sn_dist` VALUES ('8', '7', '32', '94.55734');
INSERT INTO `sn_dist` VALUES ('9', '8', '29', '113.86793');
INSERT INTO `sn_dist` VALUES ('10', '9', '33', '112.65668');
INSERT INTO `sn_dist` VALUES ('11', '9', '34', '295.12985');
INSERT INTO `sn_dist` VALUES ('12', '10', '30', '97.5076');
INSERT INTO `sn_dist` VALUES ('13', '10', '35', '283.7516');
INSERT INTO `sn_dist` VALUES ('14', '11', '15', '200.59656');
INSERT INTO `sn_dist` VALUES ('15', '12', '16', '201.40806');
INSERT INTO `sn_dist` VALUES ('16', '13', '36', '154.95705');
INSERT INTO `sn_dist` VALUES ('17', '13', '40', '256.29625');
INSERT INTO `sn_dist` VALUES ('18', '14', '37', '165.73849');
INSERT INTO `sn_dist` VALUES ('19', '14', '39', '265.95899');
INSERT INTO `sn_dist` VALUES ('20', '15', '17', '138.722');
INSERT INTO `sn_dist` VALUES ('21', '16', '17', '117.93354');
INSERT INTO `sn_dist` VALUES ('22', '17', '38', '261.32216');
INSERT INTO `sn_dist` VALUES ('23', '18', '41', '240.79383');
INSERT INTO `sn_dist` VALUES ('24', '19', '42', '238.21366');
INSERT INTO `sn_dist` VALUES ('25', '21', '2', '612.68792');
INSERT INTO `sn_dist` VALUES ('26', '22', '3', '543.35264');
INSERT INTO `sn_dist` VALUES ('27', '23', '4', '310.5256');
INSERT INTO `sn_dist` VALUES ('28', '24', '5', '1208.23928');
INSERT INTO `sn_dist` VALUES ('29', '25', '26', '335.22468');
INSERT INTO `sn_dist` VALUES ('30', '26', '27', '433.43002');
INSERT INTO `sn_dist` VALUES ('31', '27', '6', '202.5732');
INSERT INTO `sn_dist` VALUES ('32', '28', '8', '103.36783');
INSERT INTO `sn_dist` VALUES ('33', '31', '7', '137.13754');
INSERT INTO `sn_dist` VALUES ('34', '32', '9', '129.47455');
INSERT INTO `sn_dist` VALUES ('35', '29', '10', '104.5695');
INSERT INTO `sn_dist` VALUES ('36', '33', '11', '111.32459');
INSERT INTO `sn_dist` VALUES ('37', '34', '13', '135.75429');
INSERT INTO `sn_dist` VALUES ('38', '30', '12', '105.41738');
INSERT INTO `sn_dist` VALUES ('39', '35', '14', '150.68062');
INSERT INTO `sn_dist` VALUES ('40', '36', '15', '158.9748');
INSERT INTO `sn_dist` VALUES ('41', '40', '18', '256.56025');
INSERT INTO `sn_dist` VALUES ('42', '37', '16', '145.53609');
INSERT INTO `sn_dist` VALUES ('43', '39', '20', '237.56285');
INSERT INTO `sn_dist` VALUES ('44', '38', '19', '234.25746');
INSERT INTO `sn_dist` VALUES ('45', '41', '19', '203.21069');
INSERT INTO `sn_dist` VALUES ('46', '42', '20', '189.06766');

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
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_entertainment
-- ----------------------------
INSERT INTO `sn_place_entertainment` VALUES ('20', 'dsdas', '32131', '32131', '0', null, '321', '22', '321', '3231', '/up/place/1374580025451-f00a68229c580bb4abf54130a90c0d3c.png');

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
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_hotel
-- ----------------------------
INSERT INTO `sn_place_hotel` VALUES ('12', 'test', '5', '321', '21321231', '1290', '0', null, '23123213', '1231', 'tete', '15', '1231.3232', '1232.134', null);
INSERT INTO `sn_place_hotel` VALUES ('18', 'dasd', '2121', '321', '3213', '32', '0', null, '32', '321', '2121', '121', '2121', '212', '/up/place/1374569511968-j.png');

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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

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
INSERT INTO `sn_place_meta` VALUES ('12', 'test', '15', '10', 'tete', '1231.3232', '1232.134');
INSERT INTO `sn_place_meta` VALUES ('14', '喜洋洋', '121', '11', '121', '222.32', '43252.4324');
INSERT INTO `sn_place_meta` VALUES ('15', 'scenic', '0', '11', '没什么', '0', '0');
INSERT INTO `sn_place_meta` VALUES ('16', 'scenicsdsa', '231', '12', '43234', '32.3221', '3232.12');
INSERT INTO `sn_place_meta` VALUES ('17', 'sdsa', '21', '10', '3123', '3213', '321');
INSERT INTO `sn_place_meta` VALUES ('18', 'dasd', '121', '10', '2121', '2121', '212');
INSERT INTO `sn_place_meta` VALUES ('20', 'dsdas', '22', '11', '321', '321', '3231');

-- ----------------------------
-- Table structure for `sn_place_other`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_other`;
CREATE TABLE `sn_place_other` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `img` varchar(200) DEFAULT NULL,
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
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_restaurant
-- ----------------------------
INSERT INTO `sn_place_restaurant` VALUES ('14', '喜洋洋', '2222', null, '0', null, '3342', '34242', '121', '121', '222.32', '43252.4324', null);

-- ----------------------------
-- Table structure for `sn_place_scenic`
-- ----------------------------
DROP TABLE IF EXISTS `sn_place_scenic`;
CREATE TABLE `sn_place_scenic` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `star` int(1) unsigned DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `description` text,
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `img` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_place_scenic
-- ----------------------------
INSERT INTO `sn_place_scenic` VALUES ('15', 'scenic', '21', 'DASDAS', '0', '没什么', '0', '0', '0', null);
INSERT INTO `sn_place_scenic` VALUES ('16', 'scenicsdsa', '3', '313', '0', '43234', '231', '32.3221', '3232.12', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

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
INSERT INTO `sn_point` VALUES ('21', 'v21', '36.666161', '117.126075');
INSERT INTO `sn_point` VALUES ('22', 'v22', '36.665929', '117.135418');
INSERT INTO `sn_point` VALUES ('23', 'v23', '36.666277', '117.145335');
INSERT INTO `sn_point` VALUES ('24', 'v24', '36.669113', '117.154534');
INSERT INTO `sn_point` VALUES ('25', 'v25', '36.668824', '117.147491');
INSERT INTO `sn_point` VALUES ('26', 'v26', '36.671371', '117.145479');
INSERT INTO `sn_point` VALUES ('27', 'v27', '36.674671', '117.142891');
INSERT INTO `sn_point` VALUES ('28', 'v28', '36.677326', '117.142857');
INSERT INTO `sn_point` VALUES ('29', 'v29', '36.679221', '117.142875');
INSERT INTO `sn_point` VALUES ('30', 'v30', '36.680408', '117.141293');
INSERT INTO `sn_point` VALUES ('31', 'v31', '36.676124', '117.140903');
INSERT INTO `sn_point` VALUES ('32', 'v32', '36.676775', '117.138477');
INSERT INTO `sn_point` VALUES ('33', 'v33', '36.6787', '117.137543');
INSERT INTO `sn_point` VALUES ('34', 'v34', '36.678931', '117.13465');
INSERT INTO `sn_point` VALUES ('35', 'v35', '36.682564', '117.142681');
INSERT INTO `sn_point` VALUES ('36', 'v36', '36.680552', '117.135136');
INSERT INTO `sn_point` VALUES ('37', 'v37', '36.683085', '117.140561');
INSERT INTO `sn_point` VALUES ('38', 'v38', '36.68404', '117.136447');
INSERT INTO `sn_point` VALUES ('39', 'v39', '36.685892', '117.140597');
INSERT INTO `sn_point` VALUES ('40', 'v40', '36.681826', '117.132171');
INSERT INTO `sn_point` VALUES ('41', 'v41', '36.684879', '117.133087');
INSERT INTO `sn_point` VALUES ('42', 'v42', '36.686905', '117.137345');

-- ----------------------------
-- Table structure for `sn_user`
-- ----------------------------
DROP TABLE IF EXISTS `sn_user`;
CREATE TABLE `sn_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(25) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_pw` varchar(100) NOT NULL,
  `user_avatar` varchar(200) NOT NULL,
  `user_sex` char(1) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sn_user
-- ----------------------------
INSERT INTO `sn_user` VALUES ('1', 'test', 'test@test.com', 'test', '', '男');
INSERT INTO `sn_user` VALUES ('2', 'fsdf', 'das@121.com', 'dsad', '/up/place/1374630413438-koala_cube.png', '男');
