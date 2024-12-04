CREATE DATABASE IF NOT EXISTS vuelo;
USE vuelo;

CREATE TABLE IF NOT EXISTS Avion (
	Tipoavion VARCHAR (15) NOT NULL PRIMARY KEY,
	Capacidad INT(5),
	Longitud INT(5),
	Envergadura INT(5),
	Velocidadcrucero INT(5)
);

CREATE TABLE if NOT EXISTS Vuelo(
	Numvuelo VARCHAR (10) NOT NULL PRIMARY KEY,
	Origen VARCHAR (50),
	Destino VARCHAR (50),
	Horasalida TIME,
	Tipoavion VARCHAR (5) NOT NULL,
	FOREIGN KEY (tipoavion) REFERENCES Avion(Tipoavion)
);

CREATE TABLE if NOT EXISTS Reserva(
	Numvuelo VARCHAR (10) NOT NULL, 
	Numreserva VARCHAR (5) NOT NULL, 
	Fechasalida DATE, 
	Plazaslibres INT (5),
	PRIMARY KEY (Numreserva, Numvuelo),
	FOREIGN KEY (Numvuelo) REFERENCES vuelo(Numvuelo)
);