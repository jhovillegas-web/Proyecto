create table sale_detail(
    id bigint auto_increment primary key,
    id_sale bigint not null,
    id_product bigint not null,
    date DATE not null,
    quantity Integer not null
);


