<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página Principal</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
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
			<c:if test="${idUsuario == 1 }">
				<a href="anadirProducto">Añadir producto</a>
			</c:if>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
