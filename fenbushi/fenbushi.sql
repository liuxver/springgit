drop database fenbushi;
create database fenbushi;

use fenbushi;

create table user(
name varchar(50) primary key,
password varchar(50));

create table account(
account varchar(50) primary key,
user varchar(50),
money  int,
foreign key(user) references user(name));

insert into user values('liuxv','1234');
	insert into user values('liuman','1234');

insert into account values('0001','liuxv',1000);
	insert into account values('0002','liuman',2000);
		insert into account values('0003','liuxv',3000);

