DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda;
USE tienda;

CREATE TABLE rol (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50)
);

CREATE TABLE usuarios (
id INT AUTO_INCREMENT PRIMARY KEY,
usuario VARCHAR(100) NOT NULL,
password VARCHAR(200) NOT NULL,
rol INT,
FOREIGN KEY (rol) REFERENCES rol(id)
);

CREATE TABLE categoria(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50) NOT NULL
);

CREATE TABLE producto (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
descripcion_corta VARCHAR (100) NOT NULL,
descripcion_larga VARCHAR (500) NOT NULL,
precio DOUBLE NOT NULL,
stock INT NOT NULL,
ruta_imagen VARCHAR(200),
categoria INT NOT NULL,
FOREIGN KEY (categoria) REFERENCES categoria(id)
);

CREATE TABLE carrito (
	id_c INT AUTO_INCREMENT,
	id_u INT NOT NULL,
	id_p INT NOT NULL,
	total INT NOT NULL,
	PRIMARY KEY (id_c, id_u, id_p),
	FOREIGN KEY (id_u) REFERENCES usuarios (id),
	FOREIGN KEY (id_p) REFERENCES producto (id)
);

INSERT INTO rol (nombre) 
VALUES 
('Administrador');

INSERT INTO usuarios (usuario, PASSWORD, rol)
VALUES
('Unai', '12345', 1);