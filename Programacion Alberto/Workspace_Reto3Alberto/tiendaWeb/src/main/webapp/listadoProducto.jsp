<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Productos</title>
</head>
<body>
 <a href="carroCompra">Carro de compra</a>
    <c:forEach var="producto" items="${listaProducto}">
        <div>
            <img width="32" alt="${producto.nombre}" src="${producto.rutaImagen}">
            <p>Nombre: ${producto.nombre}</p>
            <p>Descripción: ${producto.descripcionCorta}</p>
            <p>Precio: ${producto.precio}€</p>

            <form action="listadoProducto" method="post">
                <button type="submit" name="id" value="${producto.id}">Añadir al carro</button>
            </form>

            <form action="detalles" method="get">
                <input type="hidden" name="id" value="${producto.id}">
                <input type="hidden" name="rutaImagen" value="${producto.rutaImagen}">
                <input type="hidden" name="descripcionLarga" value="${producto.descripcionLarga}">
                <input type="hidden" name="stock" value="${producto.stock}">
                <button type="submit">Detalles</button>
            </form>

            <form action="EditarProducto" method="get">
                <input type="hidden" name="id" value="${producto.id}">
                <button type="submit">Editar</button>
            </form>
        </div>
    </c:forEach>
</body>
</html>
