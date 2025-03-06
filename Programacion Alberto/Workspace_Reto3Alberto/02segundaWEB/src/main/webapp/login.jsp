<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="styles/loginStyle.css">
</head>
<body>
	<div class="container-login">
		<form action="login" method="post">
			<h2>Iniciar Sesión</h2>
			<div class="input-group">
				<input type="text" name="username" placeholder="Nombre de Usuario">
				<input type="password" name="password" placeholder="Contraseña">
			</div>
			<div class="button-group">
				<button type="submit">Entrar</button>
				<button type="reset">Borrar</button>
			</div>
		</form>
		<%
		if (request.getSession().getAttribute("errorLogin") != null) {
		%>
		<p>Usuario o contraseña incorrecto.</p>
		<%
		}
		%>
	</div>
</body>
</html>