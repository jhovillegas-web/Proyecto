create table type_store(
    id bigint auto_increment primary key,
    name varchar(255) not null
);

insert into type_store (name) values
('Retail por Departamento'),
('Moda y Vestuario'),
('Deportes / Calzado'),
('Tecnología y Electrónica'),
('Accesorios'),
('Hogar y Decoración'),
('Belleza y Cosmética'),
('Juguetería'),
('Multitienda'),
('Variedad y Lifestyle');