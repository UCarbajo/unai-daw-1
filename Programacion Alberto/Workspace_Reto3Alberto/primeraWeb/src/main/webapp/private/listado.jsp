<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Email</th>
			<th>Telefono</th>
			<th>Usuario</th>
			<th>Rol</th>
			<th></th>
		</tr>
		<c:if test="${not empty listadoUsuarios }">
			<c:forEach var="usuario" items="${listadoUsuarios}">
				<tr>
					<td>${usuario.nombre}</td>
					<td>${usuario.apellidos}</td>
					<td>${usuario.email}</td>
					<td>${usuario.telefono}</td>
					<td>${usuario.usuario}</td>
					<td>${usuario.rol.nombre}</td>
					<td>
						<form action="iniciarRegistro" method="get">
							<input type="hidden" value="${usuario.usuario}" name="usuario">
							<button type="submit">Editar</button>
						</form>
						<form action="borrarUsuario" method="post">
							<input type="hidden" value="${usuario.usuario}" name="usuario">
							<button type="submit">Borrar</button>
						</form>
					</td>
				</tr>
				</c:forEach>
			</c:if>
	</table>
	<a href="private/index.jsp">Volver a index</a>
</body>
</html>