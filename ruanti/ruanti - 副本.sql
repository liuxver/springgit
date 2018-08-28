drop database tws;
create database tws;
use tws;

create table user(
id varchar(20) primary key,
name varchar(20),
password varchar(20),#0为高级，1，2，3，4对应四个部门  #8对应管理员用户
type int);

create table atool(
name varchar(20) primary key,
type int#1,2,3,4对应四个部门
);

create table atoolorder(
id int auto_increment primary key,
atoolname varchar(20),
userid varchar(20),
foreign key(atoolname) references atool(name),
foreign key(userid) references user(id)
);




create table btool(
id varchar(20) primary key,
name varchar(20),
location int,#0表示哪里  1 表示哪里
type int,#1,2,3,4对应四个部门
status int #0表示正常 1表示借出
);


create table orders(
id int auto_increment primary key,
uid varchar(20),
btoolid varchar(20),
data varchar(200),#日期
status int,#0 提交申请 1 审核通过  2 归还完成
foreign key(uid) references user(id),
foreign key(btoolid) references btool(id)
);

create table robot(
name varchar(20) primary key,
status int #0正常 1 坏了
);

