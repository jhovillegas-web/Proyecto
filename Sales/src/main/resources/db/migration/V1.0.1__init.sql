create table sales (
    id bigint auto_increment primary key,
    id_client bigint not null,
    id_store bigint not null,
    total varchar(20)
);

