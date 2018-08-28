drop database twoshou;
create database twoshou;
use twoshou;



create table user(
name varchar(20) primary key,
password varchar(20),
user_type int);


create table goods_type(
id int primary key,
name varchar(20)
);

create table goods(
name varchar(20) primary key,
price int,
type_id int,#商品类型
pic varchar(100),
seller varchar(20),
status int,#是否出售
information varchar(200),
CONSTRAINT b FOREIGN KEY (seller) REFERENCES user(name),
CONSTRAINT a FOREIGN KEY (type_id) REFERENCES goods_type(id)
);


create table talks(
id int primary key,
talker_name varchar(20),
date varchar(50),
words varchar(200),
constraint c foreign key (talker_name) references user(name));


create table orders (
name VARCHAR (20) PRIMARY key,
seller VARCHAR (20),
buyer VARCHAR (20),
constraint d foreign key (name) references goods(name)
);

insert into user values ('liuxv','1234',1);
	insert into user values ('liuman','1234',2);
		insert into user values('mengmeng','1234',2);


insert into goods_type values(1,'高端消费品');
	insert into goods_type values(2,'中低端消费品');
		insert into goods_type values(3,'手游区');
			insert  into goods_type values(4,'网游区');




insert into goods values('iphone',3500,1,'aaaaaaaaaaaa.jpg','liuman',1,'This is a very good phone. l like it very much .');
	insert into goods values('software engining',30,2,'bbbbbb.jpg','mengmeng',1,'This book is very userfull.');

insert into talks(id,talker_name,words) values(1,'liuxv','l love her.');

insert into orders (name, seller, buyer) values ('iphone','liuman','mengmeng');





delimiter //
create trigger addorder
after insert on orders
for each row
begin

update goods set goods.status=2 where new.name=goods.name;


end;//
delimiter ;


delimiter //
create trigger deleteorder
after delete on orders
for each row
begin
update goods set goods.status=1 where old.name=goods.name;
end;//
delimiter ;



