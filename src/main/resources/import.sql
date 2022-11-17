
INSERT INTO Generos (id_genero,nombre) VALUES (1,'ACCION');
INSERT INTO Generos (id_genero,nombre) VALUES (2,'ANIMACION');
INSERT INTO Generos (id_genero,nombre) VALUES (3,'AVENTURA');
INSERT INTO Generos (id_genero,nombre) VALUES (4,'BELICAS');
INSERT INTO Generos (id_genero,nombre) VALUES (5,'BIOGRAFICA');
INSERT INTO Generos (id_genero,nombre) VALUES (6,'CIENCIA FICCION');
INSERT INTO Generos (id_genero,nombre) VALUES (7,'CINE 2D');
INSERT INTO Generos (id_genero,nombre) VALUES (8,'CINE 3D');
INSERT INTO Generos (id_genero,nombre) VALUES (9,'COMEDIA');
INSERT INTO Generos (id_genero,nombre) VALUES (10,'CRIMEN');
INSERT INTO Generos (id_genero,nombre) VALUES (11,'DEPORTIVAS');
INSERT INTO Generos (id_genero,nombre) VALUES (12,'DOCUMENTAL');
INSERT INTO Generos (id_genero,nombre) VALUES (13,'DRAMA');
INSERT INTO Generos (id_genero,nombre) VALUES (14,'FANTASIA');
INSERT INTO Generos (id_genero,nombre) VALUES (15,'FUTURISTAS');
INSERT INTO Generos (id_genero,nombre) VALUES (16,'HISTORICAS');
INSERT INTO Generos (id_genero,nombre) VALUES (17,'INDEPENDIENTE');
INSERT INTO Generos (id_genero,nombre) VALUES (18,'INFANTIL');
INSERT INTO Generos (id_genero,nombre) VALUES (19,'MELODRAMA');
INSERT INTO Generos (id_genero,nombre) VALUES (20,'MUSICAL');
INSERT INTO Generos (id_genero,nombre) VALUES (21,'POLICIACAS');
INSERT INTO Generos (id_genero,nombre) VALUES (22,'RELIGIOSAS');
INSERT INTO Generos (id_genero,nombre) VALUES (23,'ROMANCE');
INSERT INTO Generos (id_genero,nombre) VALUES (24,'SUSPENSO');
INSERT INTO Generos (id_genero,nombre) VALUES (25,'TERROR');
INSERT INTO Generos (id_genero,nombre) VALUES (26,'WESTERN');



INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (1,'EL CISNE NEGRO',109,2010);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (2,'EL CLUB DE LA PELEA',139,1999);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (3,'MATRIX',131,1999);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (4,'ESPERANDO LA CARROZA',87,1985);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (5,'EL REY LEON',85,1994);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (6,'EL PADRINO',175,1972);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (7,'JOKER',121,2019);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (8,'COCO',109,2017);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (9,'SPIDER - MAN',121,2002);
INSERT INTO Peliculas (id_pelicula,titulo,duracion,anio_estreno) VALUES (10,'EL VIAJE DE CHIHIRO',124,2001);

INSERT INTO peliculas_generos (id_pelicula,id_genero) VALUES (1,13);
INSERT INTO peliculas_generos (id_pelicula,id_genero) VALUES (1,10);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (2,13);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (2,24);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (3,6);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (3,1);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (4,9);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (5,2);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (5,3);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (5,18);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (5,20);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (6,10);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (6,13);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (7,10);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (7,13);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (8,2);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (8,9);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (8,13);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (9,1);

INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (10,2);
INSERT INTO PeliculasGeneros (id_pelicula,id_genero) VALUES (10,3);

INSERT INTO Personas (id_persona,nombre,apellido) VALUES (1,'HAYAO','MIYAZAKI');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (2,'ROB','MINKOFF');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (3,'ROGER','ALLERS');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (4,'ANTONIO','GASALLA');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (5,'CHINA','ZORRILLA');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (6,'KEANU','REEVES');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (7,'LILLY','WACHOWSKI');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (8,'LANA','WACHOWSKI');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (9,'TOBEY','MAGUIRE');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (10,'NATALIE','PORTMAN');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (11,'EDWARD','NORTON');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (12,'BRAD','PITT');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (13,'JOAQUIN','PHOENIX');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (14,'MARLON','BRANDO');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (16,'LEE','UNKRICH');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (17,'ANGELINA','JOLIE');
INSERT INTO Personas (id_persona,nombre,apellido) VALUES (18,'ROBERT','DE NIRO');