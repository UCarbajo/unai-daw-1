-- Encuentra los apellidos de los clientes que nunca han comprado un coche de color rojo
SELECT c.apellidos, v.color
FROM clientes c
LEFT JOIN ventas v ON v.dni = c.dni
WHERE v.color != 'rojo'

-- Obten el nombre y apellidos de los clientes que han comprado coches en concesionarios de la ciudad 'Madrid'

SELECT c.nombre, c.apellidos
FROM clientes c
JOIN ventas v ON v.dni = c.dni
JOIN concesionarios con ON con.cifc = v.cifc
WHERE con.ciudad = 'Madrid'

-- Encuentra el nombre y modelo de todos los coches de la marca 'seat'

SELECT co.nombre, co.modelo
FROM coches co
JOIN marco mar ON mar.codcoche = co.codcoche
JOIN marcas ma ON ma.cifm = mar.cifm
WHERE ma.nombre = 'seat'

-- Obten el nombre de los concesionarios en Madrid y la cantidad total de coches en distrubucion por cada concesionario

SELECT con.cifc, con.nombre, con.ciudad, SUM(dis.cantidad) AS total_distribuido
FROM concesionarios con
LEFT JOIN distribución dis ON dis.cifc = con.cifc
GROUP BY con.cifc
HAVING con.ciudad = 'Madrid'

-- Encuentra el nombre de los clientes que viven en Madrid y el numero de coches que han comprado

SELECT c.nombre, COUNT(v.codcoche)
FROM clientes c
JOIN ventas v ON v.dni = c.dni
WHERE c.ciudad = 'Madrid'
GROUP BY c.dni


-- Obten el nombre de los concesionarios y el promedio de coches en distribucion por cada concesionario en Barcelona

SELECT con.nombre, con.ciudad, AVG(dis.cantidad)
FROM concesionarios con
JOIN distribución dis ON dis.cifc = con.cifc
WHERE con.ciudad = 'Barcelona'
GROUP BY con.cifc

-- Encuentra el nombre de los concesionarios que tienen mas de 10 coches en distribucion

SELECT con.nombre
FROM concesionarios con
JOIN distribución dis ON dis.cifc = con.cifc
GROUP BY con.cifc
HAVING COUNT(dis.cantidad) > 10

-- Obten el nombre de los coches y el numero de concesionarios que tienen cada coche en distribucion en Bilbao
-- Obten el nombre de los concesionarios y el numero de coches diferentes que tienen un distribucion en Madrid, para los concesionarios que distribuyan mas de 2 coches
-- Obten el nombre de los concesionarios y la cantidad total de coches vendidos, para concesionarios con ventas totales de mas de 1 coche