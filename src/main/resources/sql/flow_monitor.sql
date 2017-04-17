/*
Navicat MySQL Data Transfer

Source Server         : myConnection
Source Server Version : 50548
Source Host           : 127.0.0.1:3306
Source Database       : flow_monitor

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2017-04-17 17:01:46
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `gender` varchar(32) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='视频检测日志表';

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', '2017-04-15 22:14:55', 'main', '100', '96', '20', '20.3', '男', '20');
INSERT INTO `record` VALUES ('2', '2017-04-15 22:14:55', 'main', '102', '25', '20', '20', '男', '30');
INSERT INTO `record` VALUES ('3', '2017-04-15 22:14:55', 'main', '50', '60', '20', '20', '男', '25');
INSERT INTO `record` VALUES ('4', '2017-04-15 23:54:37', 'ddd', '60', '150', '20', '20', '女', '26');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('mike', '123456');
