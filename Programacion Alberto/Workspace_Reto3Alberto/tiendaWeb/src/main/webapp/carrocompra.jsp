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
				<th>Cantidad</th>
				<th>Descripción</th>
				<c:set var="total" value="0" scope="page"></c:set>
			</tr>
			<c:forEach var="producto" items="${carroProducto}">
				<tr>
					<td>${producto.rutaImagen}</td>
					<td>${producto.nombre}</td>
					<td>${producto.descripcionCorta}</td>
					<td>${producto.precio} €</td>
				</tr>
				<c:set var="total" value="${total + producto.precio}" scope="page"></c:set>
			</c:forEach>
		</table>
		<p>Total = <c:out value="${total}"/>€</p>
			<form action="carroCompra" method="post">
				<button type="submit">Vaciar</button>
			</form>
	</c:if>
</body>
</html>