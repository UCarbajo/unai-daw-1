<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<th>Descripcion</th>
				<th>Precio</th>
			</tr>
			<c:forEach var="producto" items="${carroProducto}">
				<tr>
					<td>${producto.rutaImagen}</td>
					<td>${producto.nombre}</td>
					<td>${producto.descripcionCorta}</td>
					<td>${producto.precio}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>