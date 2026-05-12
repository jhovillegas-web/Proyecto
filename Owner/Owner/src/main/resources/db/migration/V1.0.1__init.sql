create table owner (
    id bigint auto_increment primary key,
    name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null unique,
    phone varchar(20) not null unique
);

INSERT INTO owner (name, last_name, email, phone) VALUES
('Ignacio', 'Morales', 'ignacio.morales@falabella.cl', '+56991112233'),
('Paula', 'Vega', 'paula.vega@paris.cl', '+56992223344'),
('Tomás', 'Riquelme', 'tomas.riquelme@ripley.cl', '+56993334455'),
('Fernanda', 'Soto', 'fernanda.soto@maconline.com', '+56994445566'),
('Cristóbal', 'Araya', 'cristobal.araya@miniso.cl', '+56995556677'),
('Josefa', 'Contreras', 'josefa.contreras@zara.com', '+56996667788'),
('Matías', 'León', 'matias.leon@hm.com', '+56997778899'),
('Antonia', 'Sepúlveda', 'antonia.sepulveda@adidas.cl', '+56998889900'),
('Benjamín', 'Campos', 'benjamin.campos@nike.cl', '+56999990011'),
('Catalina', 'Reyes', 'catalina.reyes@theline.cl', '+56990001122'),
('Vicente', 'Salazar', 'vicente.salazar@spdigital.cl', '+56993456789');