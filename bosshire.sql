/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : bosshire

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 13/12/2019 09:32:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for career
-- ----------------------------
DROP TABLE IF EXISTS `career`;
CREATE TABLE `career`  (
  `career_id` int(11) NOT NULL AUTO_INCREMENT,
  `career_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `career_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位描述',
  `career_requirement` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位要求',
  `career_salary_min` int(11) NULL DEFAULT NULL COMMENT '职位薪资',
  `career_salary_max` int(11) NULL DEFAULT NULL,
  `career_company` int(255) NOT NULL COMMENT '所属公司，外键',
  `career_advantage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位优势',
  PRIMARY KEY (`career_id`) USING BTREE,
  INDEX `career-company`(`career_company`) USING BTREE,
  CONSTRAINT `career-company` FOREIGN KEY (`career_company`) REFERENCES `company` (`company_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `company_id` int(11) NOT NULL,
  `company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_leader` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_career` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for company_delivery_record
-- ----------------------------
DROP TABLE IF EXISTS `company_delivery_record`;
CREATE TABLE `company_delivery_record`  (
  `company_delivery_record_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_delivery_record_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_delivery_record_userId` int(11) NULL DEFAULT NULL,
  `company_delivery_record_companyId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`company_delivery_record_id`) USING BTREE,
  INDEX `company_delivery_record-company`(`company_delivery_record_companyId`) USING BTREE,
  CONSTRAINT `company_delivery_record-company` FOREIGN KEY (`company_delivery_record_companyId`) REFERENCES `company` (`company_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume`  (
  `resume_id` int(11) NOT NULL AUTO_INCREMENT,
  `resume_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `resume_user` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`resume_id`) USING BTREE,
  INDEX `resume-user`(`resume_user`) USING BTREE,
  CONSTRAINT `resume-user` FOREIGN KEY (`resume_user`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_graduate_time` datetime(0) NULL DEFAULT NULL COMMENT '毕业时间',
  `education_background` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `enrollment_year` date NULL DEFAULT NULL COMMENT '入学年份',
  `association_activity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '在校经历',
  `expected_career` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '期望职业',
  `expected_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '期望城市',
  `personal_advantage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人优势',
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_delivery_record
-- ----------------------------
DROP TABLE IF EXISTS `user_delivery_record`;
CREATE TABLE `user_delivery_record`  (
  `user_delivery_record_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_delivery_record_user` int(255) NULL DEFAULT NULL COMMENT '所属用户',
  `user_delivery_record_careerId` int(255) NULL DEFAULT NULL COMMENT '职位id',
  `user_delivery_record_date` datetime(0) NULL DEFAULT NULL COMMENT '投递时间',
  `user_delivery_record_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投递状态',
  `user_delivery_record_companyName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_delivery_record_careerName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_delivery_record_companyId` int(11) NULL DEFAULT NULL COMMENT '公司id',
  `user_delivery_record_userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_delivery_record_id`) USING BTREE,
  INDEX `user_deliery_record-user`(`user_delivery_record_user`) USING BTREE,
  INDEX `user_deliery_record-career`(`user_delivery_record_careerId`) USING BTREE,
  INDEX `user_deliery_record-company`(`user_delivery_record_companyId`) USING BTREE,
  CONSTRAINT `user_deliery_record-career` FOREIGN KEY (`user_delivery_record_careerId`) REFERENCES `career` (`career_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_deliery_record-company` FOREIGN KEY (`user_delivery_record_companyId`) REFERENCES `company` (`company_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_deliery_record-user` FOREIGN KEY (`user_delivery_record_user`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
