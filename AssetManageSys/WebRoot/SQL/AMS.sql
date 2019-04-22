# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     assetmanagesystem
# Server version:               5.1.40-community
# Server OS:                    Win32
# HeidiSQL version:             5.0.0.3272
# Date/time:                    2011-03-13 16:44:53
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
# Dumping database structure for assetmanagesystem
CREATE DATABASE IF NOT EXISTS `assetmanagesystem` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `assetmanagesystem`;


# Dumping structure for table assetmanagesystem.asset_small_type
CREATE TABLE IF NOT EXISTS `asset_small_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `smalltypename` varchar(50) NOT NULL,
  `bigtypeid` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_assetsmalltype_assettype` (`bigtypeid`),
  CONSTRAINT `FK_assetsmalltype_assettype` FOREIGN KEY (`bigtypeid`) REFERENCES `asset_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.asset_small_type: 8 rows
/*!40000 ALTER TABLE `asset_small_type` DISABLE KEYS */;
INSERT INTO `asset_small_type` (`id`, `smalltypename`, `bigtypeid`) VALUES (1, '硬盘', 1), (2, 'vista操作系统', 2), (3, '键盘', 1), (4, 'Linux操作系统', 2), (5, '笔记本电脑', 1), (6, '台式机', 1), (7, 'xp操作系统', 2), (8, 'win7操作系统', 2);
/*!40000 ALTER TABLE `asset_small_type` ENABLE KEYS */;


# Dumping structure for table assetmanagesystem.asset_type
CREATE TABLE IF NOT EXISTS `asset_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.asset_type: 2 rows
/*!40000 ALTER TABLE `asset_type` DISABLE KEYS */;
INSERT INTO `asset_type` (`id`, `typeName`) VALUES (1, '硬件'), (2, '软件');
/*!40000 ALTER TABLE `asset_type` ENABLE KEYS */;


# Dumping structure for table assetmanagesystem.data_basic
CREATE TABLE IF NOT EXISTS `data_basic` (
  `dev_code` int(20) NOT NULL,
  `dev_name` varchar(50) DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `fac` varchar(50) DEFAULT NULL,
  `acc` varchar(50) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `smalltypeid` int(50) NOT NULL,
  PRIMARY KEY (`dev_code`),
  KEY `FK_data_basic_assetsmalltype` (`smalltypeid`),
  CONSTRAINT `FK_data_basic_assetsmalltype` FOREIGN KEY (`smalltypeid`) REFERENCES `asset_small_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.data_basic: 10 rows
/*!40000 ALTER TABLE `data_basic` DISABLE KEYS */;
INSERT INTO `data_basic` (`dev_code`, `dev_name`, `brand`, `model`, `fac`, `acc`, `price`, `date`, `quantity`, `department`, `smalltypeid`) VALUES (1, '惠普笔记本', '惠普', '惠普C-4800', '惠普公司', '惠普公司', '12000', '2011-03-09 00:00:00', 10, 'ITSE', 5), (43, 'MyEclipse', '未知', '未知', '未知', '未知', '7000', '2011-03-01 00:00:00', 1, 'ITSE', 7), (49, '冠捷硬盘', '冠捷', '冠捷A-6900', '冠捷公司', '冠捷公司', '$100', '2011-03-05 00:00:00', 8, 'SIT', 1), (55, '1', '', '', '', '', '', NULL, NULL, '', 3), (56, '1', '1', '1', '1', '1', '111', '2011-03-04 00:00:00', 1, '1', 4), (57, 'DELL笔记本', 'DELL', 'DELL C-8400', 'DELL公司', 'DELL公司', '￥8000', '2011-03-03 00:00:00', 1, 'DIT', 5), (69, 'Shell Script', 'Linux', '未知型号', 'Linux公司', 'Linux公司', '$90000000', '2011-03-07 00:00:00', 3, 'HITT', 4), (77, '1', '', '1', '', '', '', '2011-03-02 00:00:00', NULL, '', 3), (221, '1', '1', '1', '1', '1', '1', NULL, 1, '1', 3), (232, '232', '', '', '', '', '', NULL, NULL, '', 3);
/*!40000 ALTER TABLE `data_basic` ENABLE KEYS */;


# Dumping structure for table assetmanagesystem.role
CREATE TABLE IF NOT EXISTS `role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.role: 5 rows
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`, `rolename`) VALUES (1, '普通用户'), (2, '管理员'), (3, '超级管理员'), (4, '系统用户'), (5, 'role2');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


# Dumping structure for table assetmanagesystem.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `age` int(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `roleid` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_user_role` (`roleid`),
  CONSTRAINT `FK_user_role` FOREIGN KEY (`roleid`) REFERENCES `role` (`id`) ON DELETE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.user: 8 rows
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `age`, `email`, `phone`, `roleid`) VALUES (3, 'kenny', '456', 21, '', '151551515', 2), (4, 'lily', '111', NULL, NULL, NULL, 1), (5, '1', '1', NULL, NULL, NULL, 1), (14, 'admin', '123', 1, '1', '1', 3), (21, '10', '1', 1, '1', '1', 4), (23, 'candy', '123', NULL, '', '', 5), (24, 'ykp', '123', NULL, '', '', 1), (26, 'CandyYang', '123456', 22, '472054516@qq.com', '15871826945', 3);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


# Dumping structure for table assetmanagesystem.vinasset
CREATE TABLE IF NOT EXISTS `vinasset` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `assetId` int(10) NOT NULL,
  `vinDate` datetime DEFAULT NULL,
  `vinCost` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__data_basic` (`assetId`),
  CONSTRAINT `FK__data_basic` FOREIGN KEY (`assetId`) REFERENCES `data_basic` (`dev_code`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

# Dumping data for table assetmanagesystem.vinasset: 7 rows
/*!40000 ALTER TABLE `vinasset` DISABLE KEYS */;
INSERT INTO `vinasset` (`id`, `assetId`, `vinDate`, `vinCost`) VALUES (1, 1, '2011-03-03 00:00:00', 400), (3, 1, '2011-03-22 00:00:00', 22), (4, 49, '2011-03-16 00:00:00', 11), (5, 1, NULL, 9), (6, 1, '2011-03-09 00:00:00', 9), (7, 1, '2011-03-09 00:00:00', 88), (8, 49, '2011-03-16 00:00:00', 66);
/*!40000 ALTER TABLE `vinasset` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
