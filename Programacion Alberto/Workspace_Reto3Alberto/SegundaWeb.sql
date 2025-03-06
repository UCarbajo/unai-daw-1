DROP DATABASE IF EXISTS inventario;
CREATE DATABASE IF NOT EXISTS inventario;
USE inventario;

CREATE TABLE productos (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	descripcion VARCHAR(500),
	precio DECIMAL(10,2),
	stock INT
);

CREATE TABLE usuarios (
	username VARCHAR(50) NOT NULL PRIMARY KEY,
	PASSWORD VARCHAR(100) NOT NULL,
	tipo VARCHAR(10) NOT NULL
);

INSERT INTO usuarios(username, PASSWORD, tipo)
VALUES
('Usuario', '12345', 'user'),
('Administrador', '12345', 'admin');

INSERT INTO productos (nombre, descripcion, precio, stock)
VALUES
('Producto A', 'Descripción A', 50.00, 20),
('Producto B', 'Descripción B', 75.50, 15),
('Producto C', 'Descripción C', 120.00, 8),
('Producto D', 'Descripción D', 55.00, 10),
('Producto E', 'Descripción E', 65.00, 12),
('Producto F', 'Descripción F', 80.00, 18),
('Producto G', 'Descripción G', 90.00, 7),
('Producto H', 'Descripción H', 110.00, 9),
('Producto I', 'Descripción I', 95.00, 14),
('Producto J', 'Descripción J', 85.00, 16),
('Producto K', 'Descripción K', 130.00, 5),
('Producto L', 'Descripción L', 70.00, 20),
('Producto M', 'Descripción M', 100.00, 10),
('Producto N', 'Descripción N', 115.00, 11),
('Producto O', 'Descripción O', 105.00, 13),
('Producto P', 'Descripción P', 90.50, 22),
('Producto Q', 'Descripción Q', 125.00, 6),
('Producto R', 'Descripción R', 140.00, 4),
('Producto S', 'Descripción S', 160.00, 8),
('Producto T', 'Descripción T', 175.00, 9),
('Producto U', 'Descripción U', 80.00, 10),
('Producto V', 'Descripción V', 95.00, 12),
('Producto W', 'Descripción W', 100.00, 7),
('Producto X', 'Descripción X', 110.00, 14),
('Producto Y', 'Descripción Y', 120.00, 11),
('Producto Z', 'Descripción Z', 130.00, 8),
('Producto AA', 'Descripción AA', 140.00, 6),
('Producto AB', 'Descripción AB', 150.00, 10),
('Producto AC', 'Descripción AC', 160.00, 15),
('Producto AD', 'Descripción AD', 170.00, 5),
('Producto AE', 'Descripción AE', 180.00, 12),
('Producto AF', 'Descripción AF', 190.00, 9),
('Producto AG', 'Descripción AG', 200.00, 15),
('Producto AH', 'Descripción AH', 210.00, 8),
('Producto AI', 'Descripción AI', 220.00, 6),
('Producto AJ', 'Descripción AJ', 230.00, 10),
('Producto AK', 'Descripción AK', 240.00, 5),
('Producto AL', 'Descripción AL', 250.00, 7),
('Producto AM', 'Descripción AM', 260.00, 14),
('Producto AN', 'Descripción AN', 270.00, 11),
('Producto AO', 'Descripción AO', 280.00, 9),
('Producto AP', 'Descripción AP', 290.00, 13),
('Producto AQ', 'Descripción AQ', 300.00, 4),
('Producto AR', 'Descripción AR', 310.00, 16),
('Producto AS', 'Descripción AS', 320.00, 10),
('Producto AT', 'Descripción AT', 330.00, 5),
('Producto AU', 'Descripción AU', 340.00, 7),
('Producto AV', 'Descripción AV', 350.00, 9),
('Producto AW', 'Descripción AW', 360.00, 12),
('Producto AX', 'Descripción AX', 370.00, 8),
('Producto AY', 'Descripción AY', 380.00, 6),
('Producto AZ', 'Descripción AZ', 390.00, 15),
('Producto BA', 'Descripción BA', 400.00, 10),
('Producto BB', 'Descripción BB', 410.00, 7),
('Producto BC', 'Descripción BC', 420.00, 9),
('Producto BD', 'Descripción BD', 430.00, 5),
('Producto BE', 'Descripción BE', 440.00, 14),
('Producto BF', 'Descripción BF', 450.00, 11),
('Producto BG', 'Descripción BG', 460.00, 12),
('Producto BH', 'Descripción BH', 470.00, 8);
