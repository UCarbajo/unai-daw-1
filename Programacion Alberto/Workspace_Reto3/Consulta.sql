DROP DATABASE IF EXISTS paginaWeb;
CREATE DATABASE paginaWeb;
USE paginaWeb;

CREATE TABLE usuarios (
	name VARCHAR(50),
	lastName VARCHAR(50),
	mail VARCHAR(100),
	userName VARCHAR(50) NOT NULL PRIMARY KEY,
	passWord VARCHAR(255),
	phoneNumber INT
);

INSERT INTO usuarios (userName, passWord) VALUES
('admin', '1234'),
('unai', '4321');
