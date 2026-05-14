create table stock(
    id         bigint auto_increment primary key,
    id_product bigint         not null,
    id_store   bigint         not null,
    price      decimal(10, 2) not null,
    quantity   int            not null,
    status     varchar(50)
);

insert into stock(id_product,id_store,price,quantity,status) values 
(1, 11, 699990, 5, 'Disponible'),       -- RTX 4070 | SP Digital
(2, 11, 79990, 10, 'Disponible'),       -- RAM | SP Digital
(3, 11, 129990, 8, 'Disponible'),       -- Teclado Logitech | SP Digital
(4, 11, 249990, 6, 'Disponible'),       -- Monitor | SP Digital
(5, 11, 89990, 12, 'Disponible'),       -- SSD | SP Digital
(6, 11, 49990, 15, 'Disponible'),       -- Mouse Razer | SP Digital
(7, 11, 109990, 4, 'Disponible'),       -- Fuente poder | SP Digital
(8, 11, 189990, 3, 'Disponible'),       -- Placa madre | SP Digital


(9, 1, 499990, 10, 'Disponible'),       -- Refrigerador | Falabella
(9, 2, 489990, 8, 'Disponible'),        -- Refrigerador | Paris
(9, 3, 0, 0, 'No disponible'),          -- Refrigerador | Ripley

(10, 1, 379990, 7, 'Disponible'),       -- TV | Falabella
(10, 2, 0, 0, 'No disponible'),         -- TV | Paris

(11, 1, 459990, 5, 'Disponible'),       -- Notebook | Falabella
(11, 3, 0, 0, 'No disponible'),         -- Notebook | Ripley
(11, 11, 469990, 3, 'Disponible'),      -- Notebook | SP Digital


(12, 8, 69990, 15, 'Disponible'),       -- Adidas zapatillas
(13, 9, 89990, 12, 'Disponible'),       -- Nike zapatillas


(14, 6, 9990, 30, 'Disponible'),        -- Zara polera
(14, 7, 0, 0, 'No disponible'),         -- H&M polera

(19, 6, 39990, 18, 'Disponible'),       -- Jeans Zara
(19, 7, 0, 0, 'No disponible'),         -- Jeans H&M


(15, 4, 999990, 3, 'Disponible'),       -- MacBook
(29, 4, 899990, 5, 'Disponible'),       -- iPhone 13
(30, 4, 1099990, 3, 'Disponible'),      -- iPhone 14
(31, 4, 0, 0, 'No disponible'),         -- iPhone 15 Pro

(16, 5, 0, 0, 'No disponible'),         -- Peluche
(17, 10, 12990, 20, 'Disponible'),      -- Vela


(24, 1, 549990, 5, 'Disponible'),       -- PS5 Falabella
(24, 2, 0, 0, 'No disponible'),         -- PS5 Paris
(24, 11, 559990, 3, 'Disponible'),      -- PS5 SP Digital

(25, 1, 89990, 10, 'Disponible'),       -- Audífonos Falabella
(25, 11, 0, 0, 'No disponible'),        -- Audífonos SP Digital

(28, 11, 129990, 0, 'No disponible'),   -- Silla gamer
(29, 11, 49990, 15, 'Disponible');      -- Mouse gamer