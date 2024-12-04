DROP DATABASE if EXISTS vuelos;

/*Creación de la BD de vuelos*/
CREATE DATABASE IF NOT EXISTS vuelos;

/* También vale
DROP DATABASE IF EXISTS vuelos;
CREATE DATABASE vuelos; */


USE vuelos;

/*Creación de las tablas*/

/*Se puede poner CREATE TABLE IF NOT EXISTS avion para evitar advertencias*/

CREATE TABLE if not exists avion (
  tipoavion VARCHAR(100) PRIMARY KEY,
  capacidad INT NOT NULL,
  longitud INT NOT NULL,
  envergadura INT NOT NULL,
  velocidadcrucero INT NOT NULL

);

CREATE TABLE if not exists vuelo (
  numvuelo VARCHAR(100) PRIMARY KEY,
  origen VARCHAR(100) NOT NULL,
  destino VARCHAR(100) NOT NULL,
  horasalida TIME NOT NULL,
  tipoavion VARCHAR(100) NOT NULL,

  FOREIGN KEY (tipoavion) REFERENCES avion(tipoavion)

);

CREATE TABLE if not exists reserva (
  numvuelo VARCHAR(100) NOT NULL,
  numreserva VARCHAR(100) NOT NULL,
  fechasalida DATE NOT NULL,
  plazaslibres INT NOT NULL,
  
  primary key(numvuelo, numreserva),/*pk compuesta*/

  FOREIGN KEY (numvuelo) REFERENCES vuelo(numvuelo)

);





INSERT INTO avion VALUES('320', 187, 42, 32, 856);
INSERT INTO avion VALUES('72S', 160, 36, 25, 820);
INSERT INTO avion VALUES('737', 172, 38, 29, 793);
INSERT INTO avion VALUES('73S', 185, 44, 30, 815);
INSERT INTO avion VALUES('D9S', 110, 38, 28, 815);


INSERT INTO vuelo VALUES('AF577', 'Bilbao', 'París', '10:10:00', '737');
INSERT INTO vuelo VALUES('BA467', 'Madrid', 'Londres', '20:40:00', '73S');
INSERT INTO vuelo VALUES('IB023', 'Madrid', 'Tenerife', '21:20:00', '72S');
INSERT INTO vuelo VALUES('IB0640', 'Madrid', 'Barcelona', '06:45:00', '320');
INSERT INTO vuelo VALUES('IB318', 'Sevilla', 'Madrid', '10:45:00', '72S');
INSERT INTO vuelo VALUES('IB327', 'Madrid', 'Sevilla', '18:05:00', '72S');
INSERT INTO vuelo VALUES('IB368', 'Málaga', 'Barcelona', '22:25:00', 'D9S');
INSERT INTO vuelo VALUES('IB3709', 'Dublín', 'Barcelona', '14:35:00', 'D9S');
INSERT INTO vuelo VALUES('IB3742', 'Madrid', 'Barcelona', '09:15:00', '72S');
INSERT INTO vuelo VALUES('IB510', 'Sevilla', 'Madrid', '07:45:00', '72S');
INSERT INTO vuelo VALUES('IB600', 'Madrid', 'Londres', '10:30:00', '320');
INSERT INTO vuelo VALUES('IB610', 'Málaga', 'Londres', '15:05:00', '73S');
INSERT INTO vuelo VALUES('IB721', 'Barcelona', 'Sevilla', '16:40:00', '72S');
INSERT INTO vuelo VALUES('IB778', 'Barcelona', 'Roma', '09:45:00', '72S');
INSERT INTO vuelo VALUES('LH1349', 'Copenhague', 'Francfort', '10:20:00', '320');



INSERT INTO reserva VALUES('BA467', '0001', '2020-03-21', 49);
INSERT INTO reserva VALUES('BA467', '0002', '2020-03-20', 32);
INSERT INTO reserva VALUES('BA467', '0003', '2020-03-22', 79);
INSERT INTO reserva VALUES('IB0640', '0001', '2020-03-20', 15);
INSERT INTO reserva VALUES('IB0640', '0002', '2020-03-21', 21);
INSERT INTO reserva VALUES('IB0640', '0003', '2020-03-22', 39);
INSERT INTO reserva VALUES('IB3709', '0001', '2020-03-20', 60);
INSERT INTO reserva VALUES('IB3709', '0002', '2020-03-21', 72);
INSERT INTO reserva VALUES('IB3709', '0003', '2020-03-22', 85);
INSERT INTO reserva VALUES('IB510', '0001', '2020-03-20', 19);
INSERT INTO reserva VALUES('IB510', '0002', '2020-03-21', 31);
INSERT INTO reserva VALUES('IB510', '0003', '2020-03-22', 40);
INSERT INTO reserva VALUES('IB600', '0001', '2020-03-20', 46);
INSERT INTO reserva VALUES('IB600', '0002', '2020-03-21', 80);
INSERT INTO reserva VALUES('IB600', '0003', '2020-03-22', 91);


