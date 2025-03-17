-- Total de ventas por ciudad
SELECT c.ciudad, SUM(p.total) AS ventas_totales
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY c.ciudad

-- Numero de pedidos por comercial
SELECT c.id, c.nombre, COUNT(p.id_comercial) AS pedidos_totales
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY c.id

-- Promedio de ventas por ciudad
SELECT c.ciudad, AVG(p.total)
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY c.ciudad

-- Total de ventas por comercial
SELECT c.nombre, c.apellido1, SUM(p.total)
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY c.id

-- Clientes sin pedidos
SELECT *
FROM cliente c
LEFT JOIN pedido p ON p.id_cliente = c.id
WHERE p.id_cliente IS NULL

-- Ventas totales y promedio por comercial
SELECT c.nombre, SUM(p.total) AS Ventas_totales, AVG(p.total) AS Promedio
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY c.id

-- Ventas totales por categoria de cliente
SELECT c.categoria, SUM(p.total)
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY c.categoria

-- Comerciales con ventas superiores a 1000
SELECT c.id, c.nombre, SUM(p.total) AS ventas_totales
FROM comercial c
LEFT JOIN pedido p ON c.id = p.id_comercial
GROUP BY c.id, c.nombre
HAVING SUM(p.total) > 1000;

-- Ventas totales por año
SELECT YEAR(p.fecha) AS anio, SUM(p.total) AS ventas_totales
FROM pedido p
GROUP BY anio
ORDER BY anio;

-- Clientes con mas de un pedido
SELECT c.id, c.nombre
FROM cliente c
LEFT JOIN pedido p ON p.id_cliente = c.id
GROUP BY c.id
HAVING COUNT(p.id_cliente) > 1

-- Ventas totales por cliente y comercial
SELECT c.nombre AS Cliente, cm.nombre AS Comercial, SUM(p.total) AS ventas_totales
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
LEFT JOIN comercial cm ON cm.id = p.id_comercial
GROUP BY c.id, c.nombre, cm.id, cm.nombre;

-- Promedio de ventas por categoria de cliente
SELECT c.categoria, AVG(p.total)
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY c.categoria

-- Ventas totales por ciudad y año
SELECT c.ciudad, YEAR(p.fecha), SUM(p.total)
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY c.ciudad, YEAR(p.fecha)

-- Clientes con ventas superior al promedio
SELECT DISTINCT c.*
FROM cliente c
JOIN pedido p ON p.id_cliente = c.id
	WHERE p.total > (
	SELECT AVG(total)
	FROM pedido
)

-- Comerciales con mas de 5 pedidos
SELECT c.id, c.nombre, COUNT(p.id_comercial) AS num_pedidos
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY p.id_comercial
HAVING num_pedidos > 3

-- Ventas totales y promedio por ciudad y año
SELECT YEAR(p.fecha), c.ciudad, SUM(p.total) AS ventas_totales, AVG(p.total) AS promedio
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY YEAR(p.fecha), c.ciudad

-- Clientes con ventas superiores a 2000
SELECT c.id, c.nombre, SUM(p.total) AS ventas_totales
FROM pedido p
LEFT JOIN cliente c ON c.id = p.id_cliente
GROUP BY p.id_cliente
HAVING ventas_totales > 2000

-- Ventas totales por comercial y año
SELECT c.id, c.nombre, YEAR(p.fecha) AS anio, SUM(p.total) AS ventas_totales
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY c.id, c.nombre, anio
ORDER BY c.id, anio DESC

-- Promedio de ventas por comercial y año
SELECT c.id, c.nombre, YEAR(p.fecha) AS anio, AVG(p.total) AS ventas_totales
FROM pedido p
LEFT JOIN comercial c ON c.id = p.id_comercial
GROUP BY c.id, anio
ORDER BY c.id, anio DESC

-- Clientes con ventas superiores al promedio por ciudad
SELECT c.id, c.nombre, c.ciudad, SUM(p.total) AS ventas_totales
FROM pedido p
INNER JOIN cliente c ON p.id_cliente = c.id
GROUP BY c.id, c.nombre, c.ciudad
HAVING SUM(p.total) > (
    SELECT AVG(p2.total)
    FROM pedido p2
    INNER JOIN cliente c2 ON p2.id_cliente = c2.id
    WHERE c2.ciudad = c.ciudad
);

