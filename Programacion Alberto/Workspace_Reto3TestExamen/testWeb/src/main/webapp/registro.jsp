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
	<form action="registro" method="post">
		<label>Usuario</label>
		<input type="text" name="usuario" placeholder="Usuario" required>
		<label>Password</label>
		<input type="password" name="password" placeholder="Contraseña" required>
		<label>Rol</label>
		<select name="rol" required>
			<c:forEach var="rol" items="${listaRoles}">
				<option value="${rol.id}">${rol.tipo}</option>
			</c:forEach>
		</select>
		<button type="submit">Registrarse</button>
		<button type="reset">Borrar campos</button>
	</form>
</body>
</html>