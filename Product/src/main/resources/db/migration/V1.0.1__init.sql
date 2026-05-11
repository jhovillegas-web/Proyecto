create table product(
    id bigint auto_increment primary key,
    name varchar(255) not null,
    type varchar(255) not null,
    description varchar(255) not null
);

INSERT INTO product (name, type, description) VALUES
('Tarjeta Gráfica NVIDIA RTX 4070', 'Grafica', 'Tarjeta gráfica de alto rendimiento para gaming y edición de video'),
('Memoria RAM Corsair 16GB DDR4', 'RAM', 'Memoria RAM DDR4 de 16GB, ideal para gaming y productividad'),                                                   ('Teclado Mecánico Logitech G Pro', 'Teclado', 'Teclado mecánico con switches Romer-G y retroiluminación RGB'),
('Monitor Samsung 27" 2K', 'Monitor', 'Monitor de 27 pulgadas, resolución 2560x1440, panel IPS'),
('Disco SSD Samsung 1TB', 'Almacenamiento', 'SSD NVMe de 1TB con alta velocidad de lectura y escritura'),
('Mouse Razer DeathAdder', 'Mouse', 'Mouse gaming ergonómico con sensor de alta precisión'),
('Fuente de Poder Corsair 650W', 'Fuente', 'Fuente de poder certificación 80 Plus Gold, 650W'),
('Placa Madre ASUS ROG Strix', 'Placa Madre', 'Placa madre para procesadores Intel con chipset Z790');