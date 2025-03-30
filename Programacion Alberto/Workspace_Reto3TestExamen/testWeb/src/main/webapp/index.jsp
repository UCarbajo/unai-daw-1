<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
	<c:when test="${not empty usuario }">
		<form action="index" method="post">
			<button type="submit">Cerrar sesión</button>
		</form>
	</c:when>
	<c:otherwise>
		<a href="login">Iniciar Sesión</a>
	</c:otherwise>
	</c:choose>
		<a href="registro">Registrarse</a>
		<c:if test="${usuario.rol.id == 1 || usuario.rol.id == 2}">
			<a href="anadirlibro">Añadir libro</a>
			
		</c:if>
		<c:if test="${not empty usuario }">
			<a href="listalibros">Lista de libros</a>
		</c:if>
</body>
</html>