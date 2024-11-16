create table student (
studentNum int primary key 
);

create table course (
courseNum int primary key
);

create table account (
userID int primary key
);

create table enrolledIN (
studentNum int,
courseNum int,
foreign key (studentNum) references student(studentNum),
foreign key (courseNum) references course(courseNum)
);

create table courseAccount (
    ID_e_Userit int,
    studentNum int,
    courseNum int,
    expirationDate date,
    constraint Test1 foreign key (ID_e_Userit) references account(userID),
    constraint Test2 foreign key (studentNum) references student(studentNum),
    constraint Test3 foreign key (courseNum) references course(courseNum)
);

insert into account values (1);
insert into account values (2);
insert into account values (3);
insert into account values (4);
insert into account values (5);

insert into course values (1);
insert into course values (2);
insert into course values (3);
insert into course values (4);
insert into course values (5);

insert into student values (1);
insert into student values (2);

insert into courseAccount (ID_e_Userit, studentNum, courseNum, expirationDate)
values (1, 1, 1, '2024-12-10');

select * from course;
select * from courseAccount;

create table autori (
    autorID int primary key,
    emri varchar(50) not null
);

create table libri (
    libri_ID int primary key,
    autorID int,
    titulli varchar(100) not null,
    foreign key (autorID) references autori(autorID)
);

create table anetari (
    anetarID int primary key,
    emri varchar(50) not null
);

create table huazimi (
    ID int primary key,
    libri_ID int,
    anetarID int,
    data_marrjes date,
    data_kthimit date,
    foreign key (libri_ID) references libri(libri_ID),
    foreign key (anetarID) references anetari(anetarID)
);

insert into autori values (1, 'Ismail Kadare');
insert into autori values (2, 'Dritero Agolli');
insert into autori values (3, 'Agatha Christie');

insert into libri values (1, 1, 'Piramida');
insert into libri values (2, 1, 'Gjenerali i ushtrise se vdekur');
insert into libri values (3, 2, 'Mesdite');

insert into anetari values (1, 'Filan');
insert into anetari values (2, 'Fisteku');

insert into huazimi (ID, libri_ID, anetarID, data_marrjes, data_kthimit)
values (1, 1, 1, '2024-11-05', '2024-12-05');

insert into huazimi (ID, libri_ID, anetarID, data_marrjes, data_kthimit)
values (2, 2, 2, '2024-11-05', '2024-12-05');

select * from autori;
select * from libri;
select * from anetari;
select * from huazimi;