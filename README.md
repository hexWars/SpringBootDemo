# 功能点
 - 登录
 - 验证码
 - 退出登录
 - 员工信息curd

# 技术
 - ssm
 - html + css + js + juery
 - springboot
 - layUI
 - layUIMiNi

# 数据库表
 - 用户表
 - 员工表
 - 部门表


表,有些是我自己建的
```sql
create table user
(
    id       int(10) auto_increment primary key,
    username char(100),
    password char(100),
    ch_name  char(100)
);

create table emp
(
    emp_id   int(10) auto_increment primary key,
    name     char(100),
    sex      char(10),
    age      int(10),
    sal      double,
    birthday date,
    address  char(100),
    dept_id  int(10)
);

create table dept
(
    dept_id   int(10) primary key,
    dept_name char(100)
);

INSERT INTO dept(id, first_name, last_name, birth) VALUES (10001, 'Georgi', 'Facello', 'M');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10002, 'Bezalel', 'Simmel', 'F');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10003, 'Parto', 'Bamford', 'M');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10004, 'Chirstian', 'Koblick', 'M');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10005, 'Kyoichi', 'Maliniak', 'M');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10006, 'Anneke', 'Preusig', 'F');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10007, 'Tzvetan', 'Zielinski', 'F');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10008, 'Saniya', 'Kalloufi', 'M');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10009, 'Sumant', 'Peac', 'F');
INSERT INTO dept(id, first_name, last_name, birth) VALUES (10010, 'Duangkaew', 'Piveteau', 'F');

INSERT INTO emp(id, first_name, last_name, birth) VALUES (10001, 'Georgi', 'Facello', 'M');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10002, 'Bezalel', 'Simmel', 'F');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10003, 'Parto', 'Bamford', 'M');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10004, 'Chirstian', 'Koblick', 'M');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10005, 'Kyoichi', 'Maliniak', 'M');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10006, 'Anneke', 'Preusig', 'F');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10007, 'Tzvetan', 'Zielinski', 'F');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10008, 'Saniya', 'Kalloufi', 'M');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10009, 'Sumant', 'Peac', 'F');
INSERT INTO emp(id, first_name, last_name, birth) VALUES (10010, 'Duangkaew', 'Piveteau', 'F');

INSERT INTO user(id, first_name, last_name, birth) VALUES (10001, 'Georgi', 'Facello', 'M');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10002, 'Bezalel', 'Simmel', 'F');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10003, 'Parto', 'Bamford', 'M');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10004, 'Chirstian', 'Koblick', 'M');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10005, 'Kyoichi', 'Maliniak', 'M');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10006, 'Anneke', 'Preusig', 'F');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10007, 'Tzvetan', 'Zielinski', 'F');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10008, 'Saniya', 'Kalloufi', 'M');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10009, 'Sumant', 'Peac', 'F');
INSERT INTO user(id, first_name, last_name, birth) VALUES (10010, 'Duangkaew', 'Piveteau', 'F');
```

# 描述
和视频比起来不完全一样,加入了swagger3来练手




