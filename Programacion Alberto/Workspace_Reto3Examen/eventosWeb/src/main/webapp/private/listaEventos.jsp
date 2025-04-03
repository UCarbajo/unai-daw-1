<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty listaEventos }">


			<table>
				<tr>
					<td>Nombre</td>
					<td>Descripción</td>
					<td>Fecha</td>

				</tr>
				<c:forEach var="evento" items="${listaEventos }">
					<tr>
						<td>${evento.nombre }</td>
						<td>${evento.descripcion }</td>
						<td>${evento.fecha }</td>
						<td>
							<form action="" method="post">
								<input type="hidden" name="id" value="${evento.id }">
								<button type="submit">Borrar</button>
							</form>
						</td>
					</tr>

				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<%
			response.sendRedirect("listaeventos");
			%>
		</c:otherwise>
	</c:choose>
	<a href="anadirevento">Añadir nuevo evento</a>
	<a href="index">Volver</a>
</body>
</html>