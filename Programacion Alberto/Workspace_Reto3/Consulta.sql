DROP DATABASE IF EXISTS paginaWeb;
CREATE DATABASE paginaWeb;
USE paginaWeb;

CREATE TABLE roles(
id INT AUTO_INCREMENT PRIMARY KEY,
rol VARCHAR(50) NOT NULL
);

CREATE TABLE usuarios (
	name VARCHAR(50),
	lastName VARCHAR(50),
	mail VARCHAR(100) UNIQUE,
	userName VARCHAR(50) NOT NULL PRIMARY KEY,
	passWord VARCHAR(255),
	phoneNumber INT,
	id_rol INT,
	FOREIGN KEY (id_rol) REFERENCES roles (id)
);

INSERT INTO roles (rol) VALUES
('admin'),
('user'),
('centro escolar'),
('profesor');
