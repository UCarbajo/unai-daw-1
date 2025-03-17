<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear rol</title>
</head>
<body>
	<form action="altaRol" method="post">
		<c:if test="${not empty rol }">
			<input type='hidden' name='id' value="${rol.id }">
		</c:if>
		<input type="text" placeholder="Rol" name="nombre"
			value="${ not empty rol ? rol.nombre : ''} ">
		<button type="submit">Guardar</button>

	</form>
</body>
</html>