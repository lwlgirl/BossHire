/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : bosshire

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 17/12/2019 09:04:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for career_inf
-- ----------------------------
DROP TABLE IF EXISTS `career_inf`;
CREATE TABLE `career_inf`  (
  `career_id` int(11) NOT NULL AUTO_INCREMENT,
  `career_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `career_type` int(11) NULL DEFAULT NULL,
  `career_salary_min` int(11) NULL DEFAULT NULL,
  `career_salary_max` int(11) NULL DEFAULT NULL,
  `career_desc` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `career_company_id` int(11) NOT NULL,
  PRIMARY KEY (`career_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for career_tag_inf
-- ----------------------------
DROP TABLE IF EXISTS `career_tag_inf`;
CREATE TABLE `career_tag_inf`  (
  `tag_id` int(11) NOT NULL,
  `career_id` int(11) NOT NULL,
  PRIMARY KEY (`tag_id`, `career_id`) USING BTREE,
  INDEX `career_id`(`career_id`, `tag_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for career_type_inf
-- ----------------------------
DROP TABLE IF EXISTS `career_type_inf`;
CREATE TABLE `career_type_inf`  (
  `type_id` int(11) NOT NULL,
  `type_level` int(255) NOT NULL,
  `type_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `type_parent_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`type_id`) USING BTREE,
  INDEX `type_parent_id`(`type_parent_id`) USING BTREE,
  CONSTRAINT `career_type_inf_ibfk_1` FOREIGN KEY (`type_parent_id`) REFERENCES `career_type_inf` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of career_type_inf
-- ----------------------------
INSERT INTO `career_type_inf` VALUES (1, 1, '技术', NULL);
INSERT INTO `career_type_inf` VALUES (2, 1, '产品', NULL);
INSERT INTO `career_type_inf` VALUES (3, 1, '设计', NULL);
INSERT INTO `career_type_inf` VALUES (4, 1, '运营', NULL);
INSERT INTO `career_type_inf` VALUES (5, 1, '市场', NULL);
INSERT INTO `career_type_inf` VALUES (6, 1, '人事', NULL);
INSERT INTO `career_type_inf` VALUES (7, 1, '高级管理', NULL);
INSERT INTO `career_type_inf` VALUES (8, 1, '销售', NULL);
INSERT INTO `career_type_inf` VALUES (9, 3, 'Java', 20);
INSERT INTO `career_type_inf` VALUES (10, 3, 'PHP', 20);
INSERT INTO `career_type_inf` VALUES (11, 3, 'web前端', 21);
INSERT INTO `career_type_inf` VALUES (12, 3, '测试工程师', 22);
INSERT INTO `career_type_inf` VALUES (13, 3, 'Hadoop', 20);
INSERT INTO `career_type_inf` VALUES (14, 3, 'C', 20);
INSERT INTO `career_type_inf` VALUES (15, 3, '功能测试', 22);
INSERT INTO `career_type_inf` VALUES (16, 3, '产品经理', 23);
INSERT INTO `career_type_inf` VALUES (17, 3, '产品总监', 24);
INSERT INTO `career_type_inf` VALUES (18, 3, '数据产品经理', 23);
INSERT INTO `career_type_inf` VALUES (19, 3, '电商产品经理', 24);
INSERT INTO `career_type_inf` VALUES (20, 2, '后端开发', 1);
INSERT INTO `career_type_inf` VALUES (21, 2, '前端开发', 1);
INSERT INTO `career_type_inf` VALUES (22, 2, '测试', 1);
INSERT INTO `career_type_inf` VALUES (23, 2, '产品经理', 2);
INSERT INTO `career_type_inf` VALUES (24, 2, '高端产品职位', 2);
INSERT INTO `career_type_inf` VALUES (25, 2, '视觉设计', 3);
INSERT INTO `career_type_inf` VALUES (26, 2, '交互设计', 3);
INSERT INTO `career_type_inf` VALUES (27, 2, '运营', 4);

-- ----------------------------
-- Table structure for company_inf
-- ----------------------------
DROP TABLE IF EXISTS `company_inf`;
CREATE TABLE `company_inf`  (
  `company_id` int(11) NOT NULL,
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `company_logo_image` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `company_emp_num` int(11) NULL DEFAULT NULL,
  `company_simple_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `company_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `company_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `company_established_time` date NULL DEFAULT NULL,
  `company_uid` int(11) NOT NULL,
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cv_inf
-- ----------------------------
DROP TABLE IF EXISTS `cv_inf`;
CREATE TABLE `cv_inf`  (
  `cv_id` int(11) NOT NULL AUTO_INCREMENT,
  `cv_uid` int(11) NOT NULL,
  `cv_full_name` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_sex` int(255) NULL DEFAULT NULL,
  `cv_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_birth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_wxid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_head_image` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cv_personal_skill` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `cv_hope_career` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `cv_work_exp` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `cv_project_exp` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `cv_study_exp` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `cv_create_time` datetime(0) NOT NULL,
  `cv_status` int(11) NOT NULL,
  PRIMARY KEY (`cv_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cv_inf
-- ----------------------------
INSERT INTO `cv_inf` VALUES (3, 2, NULL, 0, '18888888888', '1998/12/01', '695199262@qq.com', 'wechatlzf', NULL, '1、熟练而全面掌握通信及计算机网络专业知识；\n2、熟悉SQL Server、MySQL等数据库操作，了解Oracle数据库操作； 3、熟悉Linux系统基本操作，熟悉C++、JAVA、汇编、Perl等编程语言； 4、熟悉计算机软件工程理论；熟悉测试流程和技巧。', 'Java开发工程师', '1、行情数据图表API的标的物趋势图、微趋势图的代码重构：将原先Spring Boot项目迁移到Spring Cloud架构，并对老代码进行调整重构，并完成上线。\n2、微牛社区后台管理：用户奖金审批、内部账单管理', '2019.02 - 2019.02基于Netty开发的Socks5协议代理客户端/服务器独立开发\n\n该项目是仿造Shadowsocks编写的代理服务器，基于Netty框架编写。\n1、客户端使用Socks5代理协议接收本地代理请求\n2、客户端使用自定义协议通过SSL连接与服务器通讯\n3、服务器负责接收客户端消息，向目标服务器发起连接并将响应返回给客户端，再由客户端发送给本地代理请求发送者。\n项目已经发布到Github上', '2017-现在 吉首大学 软件工程专业 本科', '2019-12-17 00:50:15', 0);

-- ----------------------------
-- Table structure for image_inf
-- ----------------------------
DROP TABLE IF EXISTS `image_inf`;
CREATE TABLE `image_inf`  (
  `image_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `content_type` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `path` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`image_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for job_apply_inf
-- ----------------------------
DROP TABLE IF EXISTS `job_apply_inf`;
CREATE TABLE `job_apply_inf`  (
  `ja_id` int(11) NOT NULL,
  `ja_company_id` int(11) NOT NULL,
  `ja_cv_id` int(11) NOT NULL,
  `ja_deliverer_uid` int(11) NOT NULL,
  `ja_submit_time` int(11) NOT NULL,
  `ja_status` int(11) NOT NULL,
  PRIMARY KEY (`ja_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tag_inf
-- ----------------------------
DROP TABLE IF EXISTS `tag_inf`;
CREATE TABLE `tag_inf`  (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tag_inf
-- ----------------------------
INSERT INTO `tag_inf` VALUES (1, '五险一金');
INSERT INTO `tag_inf` VALUES (2, '定期体检');
INSERT INTO `tag_inf` VALUES (3, '加班补助');
INSERT INTO `tag_inf` VALUES (4, '全勤奖');
INSERT INTO `tag_inf` VALUES (5, '年终奖');
INSERT INTO `tag_inf` VALUES (6, '带薪年假');
INSERT INTO `tag_inf` VALUES (7, '员工旅游');
INSERT INTO `tag_inf` VALUES (8, '免费班车');
INSERT INTO `tag_inf` VALUES (9, '股票期权');

-- ----------------------------
-- Table structure for user_inf
-- ----------------------------
DROP TABLE IF EXISTS `user_inf`;
CREATE TABLE `user_inf`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `role` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_inf
-- ----------------------------
INSERT INTO `user_inf` VALUES (1, '15874457816', NULL, '123456', '李老板', 1, 0);
INSERT INTO `user_inf` VALUES (2, '13907315765', NULL, '123456', '张先生', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
