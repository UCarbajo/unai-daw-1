<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Rol</th>
			<th>Acción</th>
		</tr>
	<c:forEach var="rol" items="${listaRoles}">	
		<tr>
			<td>
				${rol.nombre}
			</td>
			<td>
				<form action="altaRol" method="get">
					<input type="hidden" name="nombre" value="${rol.nombre}">
					<button type="submit" value="${rol.id}" name="id">Editar</button>
				</form>
				<form action="listadoRol" method="post">
					<button type="submit" value="${rol.id}" name="id">Borrar</button>
				</form>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>