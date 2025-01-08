DROP DATABASE IF EXISTS Automoviles;
CREATE DATABASE Automoviles; 

USE Automoviles;

CREATE TABLE marcas(
cifm INT(10) AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50),
ciudad VARCHAR (50)
);

CREATE TABLE coches (
codCoche INT(10) AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
modelo VARCHAR(30)
);

CREATE TABLE concesionarios(
cifc INT(10) AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
ciudad VARCHAR (50)
);

CREATE TABLE cliente(
dni VARCHAR(9) NOT NULL PRIMARY KEY,
nombre VARCHAR(50),
apellidos VARCHAR (50),
ciudad VARCHAR (50)
);

CREATE TABLE distribucion(
cifconcesionario INT(10),
codCoche INT(10),
cantidad INT (100),
PRIMARY KEY (cifconcesionario, codCoche),
FOREIGN KEY (cifconcesionario) REFERENCES concesionarios(cifc),
FOREIGN KEY (codCoche) REFERENCES coches(codCoche)
);

CREATE TABLE ventas(
cifc INT(10),
dni VARCHAR(9),
codCoche INT(10),
color VARCHAR(30),
PRIMARY KEY (cifc, dni, codCoche),
FOREIGN KEY (cifc) REFERENCES concesionarios(cifc),
FOREIGN KEY (dni) REFERENCES cliente(dni),
FOREIGN KEY (codCoche) REFERENCES coches(codCoche)
);