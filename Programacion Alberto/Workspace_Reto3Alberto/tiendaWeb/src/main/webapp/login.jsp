<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Soy Login</h1>
	<form action="login" method="post">
		<div class="input-group">
			<label>Nombre de usuario</label> 
			<input type="text" name="usuario">
		</div>
		<div class="input-group">
			<label>Contraseña</label> 
			<input type="password" name="password">
		</div>
		<div class="button-group">
			<button type="submit">Iniciar</button>
			<button type="reset">Borrar</button>
		</div>
	</form>
</body>
</html>