<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina Principal</title>
<link rel="stylesheet" href="styles/indexStyle.css">
</head>
<body>
	<div class="container">
		<h1>TIENDA ECOL�GICA SAN LUIS</h1>
		<div class="ContainerEnlaces">
			<c:choose>
				<c:when test="${not empty usuario}">
					<form action="inicio" method="post">
						<button type="submit">Cerrar sesi�n</button>
					</form>
				</c:when>
				<c:otherwise>
					<a href="login">Iniciar sesi�n</a>
				</c:otherwise>
			</c:choose>
			<a href="listadoProducto">Listado de productos</a> 
			<a href="carroCompra">Carro de compra</a>
			<c:if test="${usuario.rol.id == 1 }">
				<a href="anadirProducto">A�adir producto</a>
			</c:if>
		</div>
	</div>
</body>
</html>
