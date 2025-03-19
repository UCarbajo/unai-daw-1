<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Principal</title>
<link rel="stylesheet" href="styles/indexStyle.css">
</head>
<body>
    <div class="container">
    <h1>TIENDA ECOLÓGICA SAN LUIS</h1>
        <div class="header">
            <c:choose>
                <c:when test="${not empty usuario}">
                    <form action="inicio" method="post" class="logout-form">
                        <button type="submit" class="btn">Cerrar sesión</button>
                    </form>
                </c:when>
                <c:otherwise>
                    <a href="login" class="btn">Iniciar sesión</a>
                </c:otherwise>
            </c:choose>
        </div>
        <div class="links">
            <a href="listadoProducto" class="btn">Listado de productos</a>
            <a href="carroCompra" class="btn">Carro de compra</a>
            <a href="anadirProducto">Añadir producto</a>
        </div>
    </div>
</body>
</html>
