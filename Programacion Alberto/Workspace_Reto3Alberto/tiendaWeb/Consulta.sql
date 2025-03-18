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

INSERT INTO categoria (nombre)
VALUES
('Carne'),
('Verdura'),
('Soda'),
('Alcohol'),
('Frutas'),
('Panadería');

INSERT INTO producto (nombre, descripcion_corta, descripcion_larga, precio, stock, ruta_imagen, categoria)
VALUES
('Pollo', 'Pollo fresco', 'Pollo fresco de alta calidad, ideal para asar o guisar.', 5.99, 50, 'imagenes/pollo.jpg', 1),
('Lechuga', 'Lechuga fresca', 'Lechuga orgánica, perfecta para ensaladas frescas.', 1.49, 100, 'imagenes/lechuga.jpg', 2),
('Coca Cola', 'Refresco Coca Cola', 'Coca Cola en botella de 2L.', 2.99, 200, 'imagenes/coca_cola.jpg', 3),
('Vodka', 'Vodka premium', 'Vodka de alta calidad, ideal para cócteles.', 12.99, 30, 'imagenes/vodka.jpg', 4),
('Manzana', 'Manzana roja', 'Manzana fresca y jugosa, ideal para comer o hacer jugo.', 1.20, 150, 'imagenes/manzana.jpg', 5),
('Pan integral', 'Pan integral fresco', 'Pan integral de horno, ideal para sandwiches o desayunos.', 1.80, 80, 'imagenes/pan_integral.jpg', 6),
('Costillas de cerdo', 'Costillas de cerdo', 'Costillas de cerdo marinadas, listas para cocinar.', 7.99, 40, 'imagenes/costillas.jpg', 1),
('Tomate', 'Tomate fresco', 'Tomate rojo y jugoso, perfecto para ensaladas y salsas.', 2.50, 120, 'imagenes/tomate.jpg', 2),
('Cerveza', 'Cerveza artesanal', 'Cerveza artesanal con sabor único y refrescante.', 3.99, 60, 'imagenes/cerveza.jpg', 4),
('Pan de molde', 'Pan de molde', 'Pan de molde suave, ideal para hacer sandwiches.', 2.10, 90, 'imagenes/pan_molde.jpg', 6);

SELECT p.*, c.nombre
FROM producto p
JOIN categoria c ON c.id = p.categoria
