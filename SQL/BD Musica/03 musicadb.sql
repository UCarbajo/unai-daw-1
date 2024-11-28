/*vamos a crear la BD de musica*/
create database if not exists musicaBD;
/*vamos a decir que nos metemos en esa BD para crear sus tablas*/
use musicaBD;
/*creamos tabla a tabla*/
create table if not exists discograficas(
    id_disc varchar(6) not null primary key,
    nombre varchar(65) default 'Discográfica independiente',
    anyo_origen int(4) check(anyo_origen > 1980)
);
create table if not exists artistas(
    id_artista varchar(6) not null primary key,
    nombre varchar(65),
    lugar_nacimiento varchar(65) 
);
create table if not exists tipos_musica(
    id_tipomus varchar(6) not null primary key,
    nombre varchar(65)
);
/*ALBUMES(id_album, nombre, fecha, id_disc)*/
create table if not exists albumes(
    id_album varchar(6) not null primary key, 
    nombre varchar(255), 
    fecha date,
    id_discograf varchar(6),  /*el tipo de esta columna debe ser igual al tipo de la columna a la que hace referencia*/
    foreign key (id_discograf) references discograficas(id_disc) on delete cascade
);
/*ART_ALB(id_artista, id_album)
TIPMUS_ALB(id_tipo, id_album)*/
create table if not exists art_alb(
    id_artista varchar(6) not null,
    id_album varchar(6) not null,
    primary key(id_artista, id_album),/*pk compuesta*/
    foreign key (id_artista) references artistas(id_artista),
    foreign key (id_album) references albumes(id_album)
);

create table if not exists tipmus_alb(
    id_tipo varchar(6) not null,/* primary key,*/
    id_album varchar(6) not null,/* primary key, */
    primary key(id_tipo, id_album),/*pk compuesta*/
    foreign key (id_tipo) references tipos_musica(id_tipomus),
    foreign key (id_album) references albumes(id_album)
);

/* 4. Consultas para verificar */
