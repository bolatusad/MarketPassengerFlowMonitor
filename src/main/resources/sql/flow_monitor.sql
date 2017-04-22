/*
Navicat MySQL Data Transfer

Source Server         : wangzelan1
Source Server Version : 50140
Source Host           : 127.0.0.1:3306
Source Database       : flow_monitor

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2017-04-22 23:39:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `path` varchar(255) NOT NULL COMMENT '图片路径',
  `camera` tinyint(4) NOT NULL COMMENT '摄像头',
  `createtime` datetime NOT NULL COMMENT '时间',
  `localpath` varchar(255) DEFAULT NULL COMMENT '本地地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------
INSERT INTO `picture` VALUES ('1', '/img/profile.jpg', '1', '2017-04-17 19:51:05', 'C:\\Users\\WangZelan\\git\\picture\\profile.jpg');
INSERT INTO `picture` VALUES ('2', '/img/profile_small.jpg', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\profile_small.jpg');
INSERT INTO `picture` VALUES ('3', '/img/p1.jpg', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\p1.jpg');
INSERT INTO `picture` VALUES ('4', '/img/a5.jpg', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');
INSERT INTO `picture` VALUES ('5', '1', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');
INSERT INTO `picture` VALUES ('6', '6', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');
INSERT INTO `picture` VALUES ('7', '1', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');
INSERT INTO `picture` VALUES ('8', '1', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');
INSERT INTO `picture` VALUES ('9', '1', '1', '2017-04-17 19:51:48', 'C:\\Users\\WangZelan\\git\\picture\\a5.jpg');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `detection_time` datetime NOT NULL COMMENT '检测时间',
  `camera_location` varchar(255) NOT NULL COMMENT '摄像头位置',
  `detection_x` double NOT NULL COMMENT '检测位置(中心点坐标x)',
  `detection_y` double NOT NULL COMMENT '检测位置(中心点坐标y)',
  `detection_w` double NOT NULL COMMENT '检测位置(范围框长宽w)',
  `detection_h` double NOT NULL COMMENT '检测位置(范围框长宽h)',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别 1男 2女',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频检测日志表';

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '2017-04-15 22:14:55', 'main', '100', '96', '20', '20.3', '1', '20');
INSERT INTO `record` VALUES ('2', '2017-04-15 22:14:55', 'main', '102', '25', '20', '20', '1', '30');
INSERT INTO `record` VALUES ('3', '2017-04-15 22:14:55', 'main', '50', '60', '20', '20', '2', '25');
INSERT INTO `record` VALUES ('4', '2017-04-15 23:54:37', 'ddd', '60', '150', '20', '20', '2', '26');
INSERT INTO `record` VALUES ('5', '2017-04-22 23:54:37', 'ddd', '60', '150', '20', '20', '2', '26');
INSERT INTO `record` VALUES ('6', '2017-04-23 23:54:37', 'ddd', '60', '150', '20', '20', '2', '26');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('mike', '123456');
