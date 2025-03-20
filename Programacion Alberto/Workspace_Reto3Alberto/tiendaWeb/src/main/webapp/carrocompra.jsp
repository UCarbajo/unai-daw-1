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
	<c:if test="${not empty carrito }">
		<table>
			<tr>
				<th>Imagen</th>
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Cantidad</th>
				<th>Precio</th>
				<c:set var="total" value="0" scope="page"></c:set>
			</tr>
			<c:forEach var="entry" items="${carrito}">
				<tr>
					<td>${entry.key.rutaImagen}</td>
					<td>${entry.key.nombre}</td>
					<td>${entry.key.descripcionCorta}</td>
					<td>
						<form action="carroCompra" method="post">
							<input type="hidden" name="id" value="${entry.key.id }"> 
							<button type="submit" name="action" value="restar">-</button>
								<p>${entry.value}</p>
 							<button type="submit" name="action" value="sumar">+</button>
						</form>
					</td>
					<td>${entry.key.precio * entry.value} €</td>
				</tr>
				<c:set var="total" value="${total + (entry.key.precio * entry.value)}" scope="page"></c:set>
			</c:forEach>
		</table>
		<p>Total = <c:out value="${total}"/>€</p>
			<form action="carroCompra" method="post">
				<button type="submit" name="action" value="vaciar">Vaciar</button>
			</form>
	</c:if>
</body>
</html>