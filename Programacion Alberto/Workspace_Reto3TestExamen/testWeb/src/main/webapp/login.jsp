<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<label>Usuario</label>
		<input type="text" name="usuario" placeholder="Usuario" required>
		<label>Password</label>
		<input type="password" name="password" placeholder="Introduce tu contraseña" required>
		<input type="checkbox" name="recordar"> Mantener sesión iniciada
		<button type="submit">Acceder</button>
		<button type="reset">Borrar</button>
	</form>
</body>
</html>