create table type_employee (
    id bigint auto_increment primary key,
    name varchar(255) not null
);

insert into type_employee (name) values
('Vendedor'),
('Cajero'),
('Reponedor');