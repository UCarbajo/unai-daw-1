create database if not exists tiendaDeDeportes;
USE tiendaDeDeportes;

CREATE TABLE if NOT EXISTS Clientes(
	CodCliente VARCHAR(8) NOT NULL PRIMARY KEY,
	DNI VARCHAR(9),
	Nombre VARCHAR(15),
	FechaNacimiento DATE,
	Ciudad VARCHAR(20)
);
CREATE TABLE if NOT EXISTS Sucursal(
	NumSuc VARCHAR(8) NOT NULL PRIMARY KEY,
	Direccion VARCHAR(50),
	Ciudad VARCHAR(20)
);
CREATE TABLE IF NOT EXISTS Empleados (
	CodEmpleado VARCHAR(8) NOT NULL PRIMARY KEY,
	DNI VARCHAR(9)
	NombreEmpleado
	Domicilio
);