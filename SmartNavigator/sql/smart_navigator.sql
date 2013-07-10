-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 07 月 10 日 10:49
-- 服务器版本: 5.5.25
-- PHP 版本: 5.3.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `smart_navigator`
--

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
  `place_id` int(6) unsigned NOT NULL,
  `place_latitude` double NOT NULL,
  `place_longitude` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_other`
--

CREATE TABLE IF NOT EXISTS `sn_place_other` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `place` varchar(100) DEFAULT NULL,
  `description` text,
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `sn_place_scenic`
--

CREATE TABLE IF NOT EXISTS `sn_place_scenic` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `level` int(1) unsigned DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `valuation` int(1) unsigned DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- 表的结构 `sn_user`
--

CREATE TABLE IF NOT EXISTS `sn_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_email` varchar(50) NOT NULL,
  `user_pw` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
