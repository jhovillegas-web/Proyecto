create table employee (
    id bigint auto_increment primary key,
    id_store bigint not null,
    name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null unique,
    phone varchar(20) not null unique
);

insert into employee (id_store , name , last_name, email , phone) values
(1, 'Juan', 'Perez', 'juan.perez@falabella.cl', '+56911111111'),
(2, 'Maria', 'Gonzalez', 'maria.gonzalez@paris.cl', '+56922222222'),
(3, 'Pedro', 'Soto', 'pedro.soto@ripley.cl', '+56933333333'),
(4, 'Camila', 'Rojas', 'camila.rojas@maconline.cl', '+56944444444'),
(5, 'Diego', 'Torres', 'diego.torres@miniso.cl', '+56955555555'),
(6, 'Fernanda', 'Diaz', 'fernanda.diaz@zara.cl', '+56966666666'),
(7, 'Luis', 'Martinez', 'luis.martinez@hm.cl', '+56977777777'),
(8, 'Valentina', 'Fuentes', 'valentina.fuentes@adidas.cl', '+56988888888'),
(9, 'Sebastian', 'Vargas', 'sebastian.vargas@nike.cl', '+56999999999'),
(10, 'Daniela', 'Castro', 'daniela.castro@theline.cl', '+56910101010'),
(11, 'Andres', 'Morales', 'andres.morales@spdigital.cl', '+56912121212');