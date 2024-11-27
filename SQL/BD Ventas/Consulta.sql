CREATE DATABASE IF NOT EXISTS VENTAS;
use VENTAS;

CREATE TABLE IF NOT EXISTS Cliente (
	id_Cliente int(8) NOT NULL PRIMARY KEY,
	Nombre VARCHAR(100),
	Apellido1 VARCHAR(100),
	Apellido2 VARCHAR(100),
	Ciudad VARCHAR(100),
	Categoria INT
);
CREATE TABLE if NOT EXISTS Comercial (
	id_Comercial INT(8) NOT NULL PRIMARY KEY,
	Nombre VARCHAR(100),
	Apellido1 VARCHAR(100),
	Apellido2 VARCHAR(100),
	Comision FLOAT
);
CREATE TABLE IF NOT EXISTS Pedido (
	id_Cliente int(8) NOT NULL,
	id_Comercial INT(8)  NOT NULL,
	Total DOUBLE,
	Fecha DATE,
	PRIMARY KEY(id_Cliente, id_Comercial),
	FOREIGN KEY(id_Cliente) REFERENCES Cliente (id_Cliente),
	FOREIGN KEY(id_Comercial) REFERENCES Comercial (id_Comercial)
);