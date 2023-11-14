CREATE DATABASE studentdb;
CREATE TABLE `course` (
  `name` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL,
  PRIMARY KEY (`code`)
);
CREATE TABLE `student` (
  `name` varchar(255) NOT NULL,
  `id` int NOT NULL,
  `isFeePaid` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `student_course` (
  `student_id` int NOT NULL,
  `course_code` varchar(255) NOT NULL,
  KEY `course_code` (`course_code`)
);
CREATE TABLE `teacher` (
  `name` varchar(255) NOT NULL
);
CREATE TABLE `teacher_course` (
  `course_code` varchar(255) NOT NULL,
  `teacher_name` varchar(255) NOT NULL,
  PRIMARY KEY (`course_code`,`teacher_name`)
);