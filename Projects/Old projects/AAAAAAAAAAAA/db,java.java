Database Payroll System

Attendance Database
CREATE TABLE attendence (
  id int(10) DEFAULT NULL,
  date_tm varchar(30) DEFAULT NULL,
  f_half varchar(20) DEFAULT NULL,
  s_half varchar(30) DEFAULT NULL
) ;

Employee Database
CREATE TABLE employee (
  id int(10) NOT NULL AUTO_INCREMENT,
  name varchar(30) DEFAULT NULL,
  gender varchar(30) DEFAULT NULL,
  address varchar(30) DEFAULT NULL,
  state varchar(30) DEFAULT NULL,
  city varchar(30) DEFAULT NULL,
  email varchar(30) DEFAULT NULL,
  phone varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;




Login Database
CREATE TABLE login (
  username varchar(30) DEFAULT NULL,
  password varchar(30) DEFAULT NULL
);

Salary Database
CREATE TABLE salary (
  id int(10) DEFAULT NULL,
  hra decimal(12,2) DEFAULT NULL,
  da decimal(12,2) DEFAULT NULL,
  med decimal(12,2) DEFAULT NULL,
  pf decimal(12,2) DEFAULT NULL,
  basic_salary decimal(12,2) DEFAULT NULL
);
