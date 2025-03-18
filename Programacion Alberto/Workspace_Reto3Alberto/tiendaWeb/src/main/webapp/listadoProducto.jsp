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
	<table>
		<tr>
			<th>Imagen</th>
			<th>Nombre</th>
			<th>Descripción</th>
			<th>Precio</th>

		</tr>
		<tbody>
			<c:forEach var="producto" items="${listaProducto}">
				<tr>
					<td>${producto.rutaImagen }</td>
					<td>${producto.nombre}</td>
					<td>${producto.descripcionCorta }</td>
					<td>${producto.precio }€</td>
					<td> 
						<form action="listadoProducto" method="post">
							<button type="submit" name="id" value="${producto.id}">Añadir al carro</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="carroCompra">Carro de compra</a>
</body>
</html>