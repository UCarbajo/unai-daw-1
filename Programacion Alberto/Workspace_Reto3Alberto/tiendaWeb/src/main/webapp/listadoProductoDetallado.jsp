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
	<c:if test="${not empty producto}">
	<table>
		<tr>
			<th>Imagen</th>
			<th>Descripcion</th>
			<th>Stock</th>
		</tr>
		<tr>
			<td><img alt="${producto.rutaImagen}" src="${producto.rutaImagen}"/></td>
			<td>${producto.descripcionLarga}</td>
			<td>${producto.stock}</td>
			<td>
				<form action="listadoProducto" method="post">
					<input type="hidden" name="id" value="${producto.id }" >
					<button type="submit" >Añadir al carro</button>
				</form>
			</td>
		</tr>
	</table>
	<a href="listadoProducto">Volver</a>
	</c:if>
</body>
</html>