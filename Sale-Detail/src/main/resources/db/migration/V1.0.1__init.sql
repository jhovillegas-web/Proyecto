create table sale_detail(
    id bigint auto_increment primary key,
    id_sale bigint not null,
    id_product bigint not null,
    date DATE not null,
    quantity Integer not null
);

insert into sale_detail (id_sale,id_product,date,quantity) values
(1,16,'2026-05-11',1);
