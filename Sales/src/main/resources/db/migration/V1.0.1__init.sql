create table sales (
    id bigint auto_increment primary key,
    id_client bigint not null,
    id_store bigint not null,
    total varchar(20)
);

insert into sales (id_client , id_store ,total) values
(1,5,'$14990')