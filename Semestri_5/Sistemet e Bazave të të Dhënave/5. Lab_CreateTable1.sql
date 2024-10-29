create database Laboratori;
drop database Laboratori;

create table emri_tabeles (
kolona1 int,
kolona2 varchar(50),
kolona3 date
)

drop table emri_tabeles;
truncate table emri_tabeles;

alter table emri_tabeles 
alter column kolona1 type varchar(5);

alter table emri_tabeles
add Ditelindja date

create table persons(
ID int PRIMARY KEY NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255) NOT NULL,
Age int
);

drop table persons;

create table persons(
ID int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255) NOT NULL,
Age int,
CONSTRAINT UC_Person UNIQUE (ID, LastName)
);

ALTER TABLE persons
ADD CONSTRAINT PK_Person PRIMARY KEY (ID, LastName)


ALTER TABLE persons
DROP CONSTRAINT UC_Person;

insert into persons (ID, LastName, FirstName, Age) 
values (1, 'Filan', 'Fisteku', 24)
insert into persons (ID, LastName, FirstName, Age) 
values (2, 'Filan', 'Fisteku', 24);
insert into persons (ID, LastName, FirstName, Age) 
values (3, 'Filan', 'Fisteku', 24);
insert into persons (ID, LastName, FirstName, Age) 
values (4, 'Filan', 'Fisteku', 24);

select * from persons

drop table persons;
