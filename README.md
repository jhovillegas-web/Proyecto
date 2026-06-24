#Creacion de las bases de datos

create database clients_db;
create database employees_db;
create database owners_db;
create database products_db;
create database sale_details_db;
create database sales_db;
create database stocks_db;
create database store_db;
create database type_store_db;
create database type-employee_db;


--- 1) # Microservicio Clients


GET   http://localhost:8081/api/v1/clients
Muestra Todos los clientes

GET   http://localhost:8081/api/v1/clients/{id}
Muestra el cliente por id

DELETE http://localhost:8081/api/v1/clients/{id}
Elimina el cliente por id

PUT - POST  http://localhost:8081/api/v1/clients
Insertar un nuevo cliente
{
    "name": "",
    "lastName": "",
    "email": "",
    "phone": ""
}



--- 2) # MicroServicio Employee


GET http://localhost:8089/api/v1/employees
Muestra Todos los Empleados

GET http://localhost:8089/api/v1/employees/{id}
Muestra el empleado por id

GET http://localhost:8089/api/v1/employees/with-stores
Muestra los empleados con el nombre de la tienda

DELETE http://localhost:8089/api/v1/employees/{id}
Elimina el empleado por id

PUT - POST  http://localhost:8089/api/v1/employees
Insertar un nuevo cliente
{
    "id_store": ,
    "name": "",
    "lastName": "",
    "email": "",
    "phone": ""
}


--- 3) # MicroServicio Owner


GET http://localhost:8083/api/v1/owners
Muestra Todos los Dueños

GET http://localhost:8083/api/v1/owners/{id}
Muestra el dueño por id

DELETE http://localhost:8083/api/v1/owners/{id}
Elimina el dueño por id; 

PUT - POST  http://localhost:8083/api/v1/owners
Insertar un nuevo dueño
{
    "name": "",
    "lastName": "",
    "email": "",
    "phone": ""
}


--- 4) # MicroServicio Product

GET http://localhost:8082/api/v1/products
Muestra Todos los Productos

GET http://localhost:8082/api/v1/products/{id}
Muestra el producto por id

DELETE http://localhost:8082/api/v1/products/{id}
Elimina el producto por id

PUT - POST http://localhost:8082/api/v1/products
Insertar un nuevo producto
{
    "name": "",
    "type": "",
    "description": ""
}


--- 5) # MicroServicio Sale

GET http://localhost:8087/api/v1/sales
Muestra Todos los Sale

GET http://localhost:8087/api/v1/sales/{id}
Muestra el sale por id

DELETE http://localhost:8087/api/v1/sales/{id}
Elimina el sale-details por id

PUT - POST http://localhost:8087/api/v1/sales
Insertar un nuevo sale
{
    "id_client": ,
    "id_store": ,
    "total": "$"
}



--- 6) # MicroServicio Sale-Detail


GET http://localhost:8088/api/v1/sale-details
Muestra Todos los Sale-Details

GET http://localhost:8088/api/v1/sale-details/{id}
Muestra el sale-details por id

GET http://localhost:8088/api/v1/sale-details/with-all
Muestra el sale-details con toda la informacion

DELETE http://localhost:8088/api/v1/sale-details/{id}
Elimina el sale-details por id

PUT - POST http://localhost:8088/api/v1/sale-details
Insertar un nuevo sale-details
{
      "id_sale": ,
      "id_product": ,
      "date": "YYYY-MM-DD",
      "quantity": 
}



--- 7) #MicroServicio Stock


GET http://localhost:8086/api/v1/stocks
Muestra Todos los Stocks

GET http://localhost:8086/api/v1/stocks/{id}
Muestra el stock por id

GET http://localhost:8086/api/v1/stocks/with-all
Muestra el stock con toda la informacion

DELETE http://localhost:8086/api/v1/stocks/{id}
Elimina el stock por id

PUT - POST http://localhost:8086/api/v1/stocks
Insertar un nuevo producto
{
    "id_product": ,
    "id_store": ,
    "price": ,
    "quantity": ,
    "status": "Disponible - No Disponible"
},




--- 8) MicroServicio Type-Store

GET http://localhost:8084/api/v1/typestores
Muestra Todos los tipos de tienda

GET http://localhost:8084/api/v1/typestores/{id}
Muestra el tipo de tienda por id

DELETE http://localhost:8084/api/v1/typestores/{id}
Elimina el tipo de tienda por id

PUT - POST http://localhost:8084/api/v1/typestores
Insertar un tipo de tienda
{
    "name": ""
}


--- 9) #MicroServicio Store


GET http://localhost:8085/api/v1/stores
Muestra Todos las tiendas

GET http://localhost:8085/api/v1/stores/{id}
Muestra la tienda por id

GET http://localhost:8085/api/v1/stores/with-owners
Muestra la tienda y su dueño

GET http://localhost:8085/api/v1/stores/with-types
Muestra la tienda con su tipo de tienda

DELETE http://localhost:8085/api/v1/stores/{id}
Elimina la tienda por id

PUT - POST http://localhost:8085/api/v1/stores
Insertar una tienda nueva
{
  "id_owner": ,
  "id_type": ,
  "name": ""
}



--- 10) #MicroServicio Types-Employee


GET http://localhost:8090/api/v1/types-employee
Muestra Todos los tipos de empleados

GET http://localhost:8084/api/v1/types-employee/{id}
Muestra el tipo de empleado por id

DELETE http://localhost:8084/api/v1/typestores/{id}
Elimina el tipo de empleado por id

PUT - POST http://localhost:8084/api/v1/typestores
Insertar un tipo de empleado
{
    "name": ""
}
























