-- phpMyAdmin SQL Dump
-- version 3.4.5deb1
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 07 月 23 日 13:32
-- 服务器版本: 5.1.58
-- PHP 版本: 5.3.6-13ubuntu3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `smartnav`
--

-- --------------------------------------------------------

--
-- 表的结构 `sn_admin`
--

CREATE TABLE IF NOT EXISTS `sn_admin` (
  `admin_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(25) NOT NULL,
  `admin_email` varchar(50) NOT NULL,
  `admin_pw` varchar(100) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `sn_admin`
--

INSERT INTO `sn_admin` (`admin_id`, `admin_name`, `admin_email`, `admin_pw`) VALUES
(1, 'admin', 'admin@smartnav.com', 'admin');

-- --------------------------------------------------------

--
-- 表的结构 `sn_discount`
--

CREATE TABLE IF NOT EXISTS `sn_discount` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `place_id` int(10) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `priority` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- 转存表中的数据 `sn_discount`
--

INSERT INTO `sn_discount` (`id`, `place_id`, `title`, `content`, `priority`) VALUES
(1, 12, 'te', 'wqeq', 10),
(4, 12, 'test', 'wqeq', 90),
(5, 12, 'tewrtw', 'rewrw', 233),
(6, 13, 'terte', 'dsadasd', 12),
(7, 14, 'tetr', 'dada', 22),
(8, 15, 'ds', 'dsada', 11);

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_entertainment`
--

CREATE TABLE IF NOT EXISTS `sn_place_entertainment` (
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_hotel`
--

CREATE TABLE IF NOT EXISTS `sn_place_hotel` (
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- 转存表中的数据 `sn_place_hotel`
--

INSERT INTO `sn_place_hotel` (`id`, `name`, `star_level`, `min_price`, `max_price`, `empty_room`, `valuation`, `notice`, `tel`, `place`, `description`, `level`, `latitude`, `longitude`) VALUES
(12, 'test', 5, '321', '21321231', 1290, 0, NULL, '23123213', '1231', 'tete', 15, 1231.3232, 1232.134);

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_meta`
--

CREATE TABLE IF NOT EXISTS `sn_place_meta` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `place_name` varchar(50) NOT NULL,
  `place_level` int(1) unsigned DEFAULT NULL,
  `place_type` int(2) unsigned NOT NULL,
  `place_descript` text,
  `place_latitude` double NOT NULL,
  `place_longitude` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- 转存表中的数据 `sn_place_meta`
--

INSERT INTO `sn_place_meta` (`id`, `place_name`, `place_level`, `place_type`, `place_descript`, `place_latitude`, `place_longitude`) VALUES
(1, '山东大学齐鲁软件学院', 15, 14, '山大软件园校区，景色秀丽，地大物博', 36.673233, 117.146633),
(2, '聚福楼', 18, 10, '聚福楼，美味菜肴', 36.669706, 117.14909),
(3, '三鼎会馆', 18, 13, '会馆休闲养生', 36.670646, 117.148381),
(4, ' 小城故事', 19, 11, '美味佳肴', 36.676168, 117.142623),
(5, '瓦山新寨', 17, 11, '南方口味菜', 36.67772, 117.135872),
(6, '明月乡村人家', 17, 10, '酒店', 36.678328, 117.134475),
(7, '齐鲁软件园创业广场', 17, 12, '青山绿水', 36.678074, 117.140197),
(8, ' 济南奥体中心', 12, 12, '全运会举办地，健身运动首选', 36.66321, 117.129126),
(9, '雨滴广场', 18, 13, '集娱乐美食于一身', 36.678357, 117.136748),
(10, '山东一卡通', 18, 14, '便利全民', 36.678031, 117.143364),
(12, 'test', 15, 10, 'tete', 1231.3232, 1232.134),
(14, '喜洋洋', 121, 11, '121', 222.32, 43252.4324),
(15, 'scenic', 33, 12, '没什么', 213.3342, 453.3213),
(16, 'scenicsdsa', 231, 12, '43234', 32.3221, 3232.12);

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_other`
--

CREATE TABLE IF NOT EXISTS `sn_place_other` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_restaurant`
--

CREATE TABLE IF NOT EXISTS `sn_place_restaurant` (
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

--
-- 转存表中的数据 `sn_place_restaurant`
--

INSERT INTO `sn_place_restaurant` (`id`, `name`, `avg_price`, `flavor`, `valuation`, `notice`, `tel`, `place`, `description`, `level`, `latitude`, `longitude`) VALUES
(14, '喜洋洋', '2222', NULL, 0, NULL, '3342', '34242', '121', 121, 222.32, 43252.4324);

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_scenic`
--

CREATE TABLE IF NOT EXISTS `sn_place_scenic` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `star` int(1) unsigned DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `description` text,
  `level` int(11) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- 转存表中的数据 `sn_place_scenic`
--

INSERT INTO `sn_place_scenic` (`id`, `name`, `star`, `place`, `valuation`, `description`, `level`, `latitude`, `longitude`) VALUES
(15, 'scenic', 21, 'DASDAS', 0, '没什么', 0, 0, 0),
(16, 'scenicsdsa', 3, '313', 0, '43234', 231, 32.3221, 3232.12);

-- --------------------------------------------------------

--
-- 表的结构 `sn_user`
--

CREATE TABLE IF NOT EXISTS `sn_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(25) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_pw` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `sn_user`
--

INSERT INTO `sn_user` (`user_id`, `user_name`, `user_email`, `user_pw`) VALUES
(1, 'test', 'test@test.com', 'test');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
