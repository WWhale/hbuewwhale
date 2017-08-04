/*
Navicat MySQL Data Transfer

Source Server         : demo
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ssi_spring_security

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-29 09:11:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `module` varchar(30) DEFAULT NULL,
  `action` varchar(30) DEFAULT NULL,
  `actionTime` varchar(30) DEFAULT NULL,
  `userIP` varchar(30) DEFAULT NULL,
  `operTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('1', 'admin', '资源管理', 'update角色的权限', '117', '10.108.1.58', '2013-12-06 11:15:38');
INSERT INTO `log` VALUES ('2', 'admin', '资源管理', 'update角色的权限', '54', '10.108.1.58', '2013-12-06 11:17:40');
INSERT INTO `log` VALUES ('3', 'admin', '用户管理', 'save操作', '78', '192.168.0.101', '2017-04-05 21:09:52');
INSERT INTO `log` VALUES ('4', 'admin', '角色管理', 'save操作', '79', '192.168.0.101', '2017-04-05 21:11:37');
INSERT INTO `log` VALUES ('5', 'admin', '资源管理', 'update角色的权限', '63', '192.168.0.101', '2017-04-05 21:27:24');
INSERT INTO `log` VALUES ('6', 'admin', '角色管理', 'update用户的角色', '48', '192.168.0.101', '2017-04-05 21:28:45');
INSERT INTO `log` VALUES ('7', 'admin', '资源管理', 'update角色的权限', '63', '192.168.0.101', '2017-04-05 21:31:28');
INSERT INTO `log` VALUES ('8', 'admin', '资源管理', 'update角色的权限', '63', '192.168.0.101', '2017-04-05 21:35:22');
INSERT INTO `log` VALUES ('9', 'admin', '角色管理', 'delete操作', '15', '192.168.0.101', '2017-04-05 21:35:51');
INSERT INTO `log` VALUES ('10', 'admin', '角色管理', 'update用户的角色', '32', '192.168.0.101', '2017-04-05 21:36:33');

-- ----------------------------
-- Table structure for `resources`
-- ----------------------------
DROP TABLE IF EXISTS `resources`;
CREATE TABLE `resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `resKey` varchar(50) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `resUrl` varchar(200) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resources
-- ----------------------------
INSERT INTO `resources` VALUES ('1', '用户管理', '1010', 'sys_user', '0', 'user', '1', '用户管理');
INSERT INTO `resources` VALUES ('2', '查询用户', '1', 'sys_user_find', '1', '/background/user/query.html', '2', '查询用户');
INSERT INTO `resources` VALUES ('3', '新增用户', '1', 'sys_user_addUI', '1', '/background/user/addUI.html', '3', '新增用户');
INSERT INTO `resources` VALUES ('4', '角色管理', '1010', 'sys_role', '0', 'role', '4', '角色管理');
INSERT INTO `resources` VALUES ('5', '角色列表', '4', 'sys_role_find', '1', '/background/role/query.html', '5', '角色列表');
INSERT INTO `resources` VALUES ('6', '资源管理', '1010', 'sys_resc', '0', 'resc', '6', '资源管理');
INSERT INTO `resources` VALUES ('7', '资源列表', '6', 'sys_resc_find', '1', '/background/resources/query.html', '7', '资源列表');
INSERT INTO `resources` VALUES ('8', '添加资源', '6', 'sys_resc_addUI', '1', '/background/resources/addUI.html', '8', '添加资源');
INSERT INTO `resources` VALUES ('11', '新增角色', '4', 'sys_role_add', '1', '/background/role/addUI.html', '5', '新增角色');
INSERT INTO `resources` VALUES ('18', '服务器配置管理', '1010', 'server', '0', 'server', '16', '服务器配置管理');
INSERT INTO `resources` VALUES ('19', '预警设置', '18', 'ser_warn', '1', '/background/serverInfo/forecast.html', '17', '预警设置');
INSERT INTO `resources` VALUES ('20', '状态列表', '18', 'ser_list', '1', '/background/serverInfo/query.html', '18', '状态列表');
INSERT INTO `resources` VALUES ('21', '服务器状态', '18', 'ser_statu', '1', '/background/serverInfo/show.html', '19', '服务器状态');
INSERT INTO `resources` VALUES ('22', '登陆信息管理', '1010', 'login', '0', 'login', '20', '登陆信息管理');
INSERT INTO `resources` VALUES ('23', '用户登录记录', '22', 'log_list', '1', '/background/userLoginList/query.html', '21', '用户登录记录');
INSERT INTO `resources` VALUES ('39', '操作日志管理', '1010', 'log', '0', 'log', '30', '操作日志管理');
INSERT INTO `resources` VALUES ('40', '日志查询', '39', 'log_find', '1', '/background/log/query.html', '31', '日志查询');
INSERT INTO `resources` VALUES ('41', '分配角色', '2', 'sys_user_fenpeirole', '2', 'sys_user_fenpeirole', '32', '分配角色');
INSERT INTO `resources` VALUES ('42', '分配权限', '2', 'sys_user_permissions', '2', 'sys_user_permissions', '33', '分配权限');
INSERT INTO `resources` VALUES ('43', '编辑用户', '2', 'sys_user_edit', '2', '/background/user/getById.html', '34', '编辑');
INSERT INTO `resources` VALUES ('44', '删除用户', '2', 'sys_user_delete', '2', '/background/user/deleteById.html', '36', '删除用户');
INSERT INTO `resources` VALUES ('45', '分配权限', '5', 'sys_role_permissions', '2', 'sys_role_permissions', '37', '分配权限');
INSERT INTO `resources` VALUES ('46', '显示详细信息', '5', 'sys_role_show', '2', 'sys_role_show', '39', '显示详细信息');
INSERT INTO `resources` VALUES ('47', '编辑角色', '5', 'sys_role_edit', '2', '/background/role/getById.html', '40', '编辑角色');
INSERT INTO `resources` VALUES ('48', '删除角色', '5', 'sys_role_delete', '2', '/background/role/deleteById.html', '41', '删除角色');
INSERT INTO `resources` VALUES ('49', '显示详细信息', '7', 'sys_res_show', '2', 'sys_res_show', '43', '显示详细信息');
INSERT INTO `resources` VALUES ('50', '编辑权限资源', '7', 'sys_res_edit', '2', '/background/resources/getById.html', '44', '编辑权限资源');
INSERT INTO `resources` VALUES ('51', '删除权限资源', '7', 'sys_res_delete', '2', '/background/resources/deleteById.html', '45', '删除权限资源');

-- ----------------------------
-- Table structure for `resources_role`
-- ----------------------------
DROP TABLE IF EXISTS `resources_role`;
CREATE TABLE `resources_role` (
  `resc_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`resc_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resources_role
-- ----------------------------
INSERT INTO `resources_role` VALUES ('1', '1');
INSERT INTO `resources_role` VALUES ('1', '3');
INSERT INTO `resources_role` VALUES ('2', '1');
INSERT INTO `resources_role` VALUES ('2', '3');
INSERT INTO `resources_role` VALUES ('2', '6');
INSERT INTO `resources_role` VALUES ('3', '1');
INSERT INTO `resources_role` VALUES ('3', '3');
INSERT INTO `resources_role` VALUES ('4', '1');
INSERT INTO `resources_role` VALUES ('4', '3');
INSERT INTO `resources_role` VALUES ('5', '1');
INSERT INTO `resources_role` VALUES ('5', '3');
INSERT INTO `resources_role` VALUES ('6', '1');
INSERT INTO `resources_role` VALUES ('6', '3');
INSERT INTO `resources_role` VALUES ('7', '1');
INSERT INTO `resources_role` VALUES ('7', '3');
INSERT INTO `resources_role` VALUES ('8', '1');
INSERT INTO `resources_role` VALUES ('8', '3');
INSERT INTO `resources_role` VALUES ('11', '1');
INSERT INTO `resources_role` VALUES ('11', '3');
INSERT INTO `resources_role` VALUES ('18', '1');
INSERT INTO `resources_role` VALUES ('18', '3');
INSERT INTO `resources_role` VALUES ('19', '1');
INSERT INTO `resources_role` VALUES ('19', '3');
INSERT INTO `resources_role` VALUES ('20', '1');
INSERT INTO `resources_role` VALUES ('20', '3');
INSERT INTO `resources_role` VALUES ('21', '1');
INSERT INTO `resources_role` VALUES ('21', '3');
INSERT INTO `resources_role` VALUES ('22', '1');
INSERT INTO `resources_role` VALUES ('22', '3');
INSERT INTO `resources_role` VALUES ('22', '6');
INSERT INTO `resources_role` VALUES ('23', '1');
INSERT INTO `resources_role` VALUES ('23', '3');
INSERT INTO `resources_role` VALUES ('23', '6');
INSERT INTO `resources_role` VALUES ('39', '1');
INSERT INTO `resources_role` VALUES ('39', '6');
INSERT INTO `resources_role` VALUES ('40', '1');
INSERT INTO `resources_role` VALUES ('40', '6');
INSERT INTO `resources_role` VALUES ('41', '1');
INSERT INTO `resources_role` VALUES ('41', '6');
INSERT INTO `resources_role` VALUES ('42', '1');
INSERT INTO `resources_role` VALUES ('42', '6');
INSERT INTO `resources_role` VALUES ('43', '1');
INSERT INTO `resources_role` VALUES ('44', '1');
INSERT INTO `resources_role` VALUES ('45', '1');
INSERT INTO `resources_role` VALUES ('46', '1');
INSERT INTO `resources_role` VALUES ('47', '1');
INSERT INTO `resources_role` VALUES ('48', '1');
INSERT INTO `resources_role` VALUES ('49', '1');
INSERT INTO `resources_role` VALUES ('50', '1');
INSERT INTO `resources_role` VALUES ('51', '1');
INSERT INTO `resources_role` VALUES ('1010', '1');
INSERT INTO `resources_role` VALUES ('1010', '3');
INSERT INTO `resources_role` VALUES ('1010', '6');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `roleKey` varchar(50) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `enable` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '用户角色', 'ROLE_USER', '用户角色', '1');
INSERT INTO `role` VALUES ('3', '删除', 'ROLE_DELETE', '删除', '0');
INSERT INTO `role` VALUES ('6', '查看操作日志', 'LOOK_LOG', '查看操作日志', '1');

-- ----------------------------
-- Table structure for `serverinfo`
-- ----------------------------
DROP TABLE IF EXISTS `serverinfo`;
CREATE TABLE `serverinfo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cpuUsage` varchar(255) DEFAULT NULL,
  `setCpuUsage` varchar(255) DEFAULT NULL,
  `jvmUsage` varchar(255) DEFAULT NULL,
  `setJvmUsage` varchar(255) DEFAULT NULL,
  `ramUsage` varchar(255) DEFAULT NULL,
  `setRamUsage` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `operTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `mark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of serverinfo
-- ----------------------------
INSERT INTO `serverinfo` VALUES ('1', '9.3', '20', '64.0', '80', '75.0', '80', '1212614949@qq.com', '2013-11-19 11:31:04', '<font color=\'red\'>内存当前：75.0%,超出预设值  60%</font>');
INSERT INTO `serverinfo` VALUES ('2', '0.8', '20', '60.0', '80', '75.0', '80', '1212614949@qq.com', '2013-11-19 11:32:02', '<font color=\'red\'>内存当前：75.0%,超出预设值  60%</font>');
INSERT INTO `serverinfo` VALUES ('3', '1.5', '20', '59.0', '80', '75.0', '80', '1212614949@qq.com', '2013-11-19 11:33:03', '<font color=\'red\'>内存当前：75.0%,超出预设值  60%</font>');
INSERT INTO `serverinfo` VALUES ('4', '0.7', '20', '57.0', '80', '75.0', '80', '1212614949@qq.com', '2013-11-19 11:34:02', '<font color=\'red\'>内存当前：75.0%,超出预设值  60%</font>');
INSERT INTO `serverinfo` VALUES ('5', '2.3', '20', '57.0', '80', '75.0', '80', '1212614949@qq.com', '2013-11-19 11:35:02', '<font color=\'red\'>内存当前：75.0%,超出预设值  60%</font>');
INSERT INTO `serverinfo` VALUES ('6', '17.9', '20', '57.0', '80', '77.0', '80', '1212614949@qq.com', '2013-11-19 11:36:02', '<font color=\'red\'>内存当前：77.0%,超出预设值  60%</font>');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `userPassword` varchar(40) DEFAULT NULL,
  `userNickname` varchar(20) DEFAULT NULL,
  `userRealname` varchar(20) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userSex` varchar(10) DEFAULT NULL,
  `userAddress` varchar(100) DEFAULT NULL,
  `userPhone` varchar(30) DEFAULT NULL,
  `userMail` varchar(45) DEFAULT NULL,
  `userQQ` varchar(30) DEFAULT NULL,
  `regTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastLogintime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `level` int(11) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `bankName` varchar(100) DEFAULT NULL,
  `branchBank` varchar(100) DEFAULT NULL,
  `subbranchBank` varchar(100) DEFAULT NULL,
  `openBankName` varchar(100) DEFAULT NULL,
  `bankAccountName` varchar(100) DEFAULT NULL,
  `bankAccount` varchar(100) DEFAULT NULL,
  `accountType` varchar(20) DEFAULT NULL,
  `pay` varchar(20) DEFAULT NULL,
  `mark` varchar(200) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `parentNumber` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', 'admin', 'admin', '10', '男', '枯霜下要孤', '0253526', 'jnfjfjj@163.com', '32432', '2013-06-18 10:37:11', '0000-00-00 00:00:00', '1', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('3', '6', '6', '7', '7', '7', '男', '7', '7', '7', '7', '2013-11-18 14:35:43', '0000-00-00 00:00:00', '1', '7', '7', '7', null, '7', null, '7', '7', '企业账号', '是', '7', '待审核', '');
INSERT INTO `user` VALUES ('4', 'wwww', '888888', '', '', null, '', '', '', '', '', '2017-04-05 21:09:52', '0000-00-00 00:00:00', '1', 'master', '', '', null, '', null, '', '', '个人账号', '是', '', '待审核', '1');

-- ----------------------------
-- Table structure for `userloginlist`
-- ----------------------------
DROP TABLE IF EXISTS `userloginlist`;
CREATE TABLE `userloginlist` (
  `loginId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `loginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `loginIP` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`loginId`),
  KEY `FK_userloginlist` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=312 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userloginlist
-- ----------------------------
INSERT INTO `userloginlist` VALUES ('277', '1', '2013-11-28 14:44:18', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('278', '1', '2013-11-28 14:50:37', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('279', '1', '2013-11-28 14:52:00', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('280', '1', '2013-12-03 18:13:07', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('281', '1', '2013-12-05 19:40:30', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('282', '1', '2013-12-05 19:43:47', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('283', '1', '2013-12-05 19:44:44', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('284', '1', '2013-12-05 20:36:55', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('285', '1', '2013-12-05 20:46:17', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('286', '1', '2013-12-06 15:33:44', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('287', '1', '2013-12-06 16:58:55', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('288', '1', '2013-12-06 17:01:13', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('289', '1', '2013-12-06 17:04:18', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('290', '1', '2013-12-06 17:05:34', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('291', '1', '2013-12-07 22:45:45', '0:0:0:0:0:0:0:1');
INSERT INTO `userloginlist` VALUES ('292', '1', '2017-04-04 22:38:14', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('293', '1', '2017-04-05 14:24:45', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('294', '1', '2017-04-05 21:08:32', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('295', '1', '2017-04-05 21:13:43', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('296', '1', '2017-04-05 21:19:14', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('297', '1', '2017-04-05 21:26:13', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('298', '4', '2017-04-05 21:28:58', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('299', '1', '2017-04-05 21:31:03', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('300', '1', '2017-04-05 21:35:32', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('301', '4', '2017-04-05 21:35:59', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('302', '1', '2017-04-05 21:36:14', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('303', '4', '2017-04-05 21:36:40', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('304', '1', '2017-04-05 21:36:49', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('305', '1', '2017-04-05 21:54:27', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('306', '1', '2017-04-05 22:02:37', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('307', '4', '2017-04-05 22:03:41', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('308', '1', '2017-07-27 08:59:42', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('309', '1', '2017-07-27 09:00:52', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('310', '1', '2017-07-28 15:06:11', '127.0.0.1');
INSERT INTO `userloginlist` VALUES ('311', '1', '2017-07-28 15:29:37', '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL DEFAULT '0',
  `role_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('3', '3');
INSERT INTO `user_role` VALUES ('4', '6');
