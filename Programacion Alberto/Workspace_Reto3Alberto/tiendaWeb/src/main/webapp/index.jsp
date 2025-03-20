<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<div class="ContainerEnlaces">
			<c:choose>
				<c:when test="${not empty usuario}">
					<form action="inicio" method="post">
						<button type="submit">Cerrar sesión</button>
					</form>
				</c:when>
				<c:otherwise>
					<a href="login">Iniciar sesión</a>
				</c:otherwise>
			</c:choose>
			<a href="listadoProducto">Listado de productos</a> 
			<a href="carroCompra">Carro de compra</a>
			<c:if test="${usuario.rol.id == 1 }">
				<a href="anadirProducto">Añadir producto</a>
			</c:if>
		</div>
	</div>
</body>
</html>
