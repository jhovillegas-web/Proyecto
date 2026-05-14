create table store (
    id bigint auto_increment primary key,
    id_owner bigint not null,
    id_type bigint not null,
    name varchar(255) not null
);

insert into store (id_owner, id_type, name) values
(1, 1, 'Falabella'),
(2, 1, 'Paris'),
(3, 1, 'Ripley'),
(4, 4, 'MacOnline'),
(5, 10, 'Miniso'),
(6, 2, 'Zara'),
(7, 2, 'H&M'),
(8, 3, 'Adidas'),
(9, 3, 'Nike'),
(10, 10, 'The Line'),
(11, 4, 'SP Digital');