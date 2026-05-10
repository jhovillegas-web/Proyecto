create table client (
    id bigint auto_increment primary key,
    name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null unique,
    phone varchar(20) not null unique
);

insert into client (name, last_name, email, phone) values ('Jhon','Villegas','jho.villegas@duocuc.cl', '+569 1234 5678');