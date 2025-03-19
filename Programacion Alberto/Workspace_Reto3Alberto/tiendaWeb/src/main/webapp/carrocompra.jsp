<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Soy CarroCompra</h1>
	<c:if test="${not empty carroProducto }">
		<table>
			<tr>
				<th>Imagen</th>
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Precio</th>
			</tr>
			<c:forEach var="producto" items="${carroProducto}">
				<tr>
					<td>${producto.rutaImagen}</td>
					<td>${producto.nombre}</td>
					<td>${producto.descripcionCorta}</td>
					<td>${producto.precio} €</td>
				</tr>
			</c:forEach>
		</table>
			<form action="carroCompra" method="post">
				<button type="submit">Vaciar</button>
			</form>
	</c:if>
</body>
</html>