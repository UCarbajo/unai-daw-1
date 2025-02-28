<!-- DIRECTIVA %@ MODIFICAR COMPORTAMIENTO DE LA PÁGINA-->
<!-- DECLARACIONES %! VARIABLES/METODOS GLOBALES -->
<!-- EXPRESIONES %= MOSTRAR UN VALOR (PRINT) JAVA -->
<!-- CODIGO JAVA % PODEMOS AÑADIR CUALQUIER CODIGO JAVA -->
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
	<div>
		<h2>Iniciar Sesión</h2>
		<form action="login" method="post">
			<input type="text" name="username" placeholder="Nombre de Usuario">
			<input type="password" name="password" placeholder="Contraseña">
			<button type="submit">Entrar</button>
			<button type="reset">Borrar</button>
		</form>
		<% if(request.getSession().getAttribute("error") != null) {%>
		<p>
			Usuario o contraseña incorrecto.
		</p>
		<%} %>
	</div>
</body>
</html>