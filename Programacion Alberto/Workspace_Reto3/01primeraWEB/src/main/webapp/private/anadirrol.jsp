<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles/anadirRolStyle.css">
</head>
<body>
	<form action="anadirrol" method="post">
		<div class="input-group">
			<label>Introduce el nuevo rol</label> 
			<input type="text" name="nuevoRol">
		</div>
		<div class="button-group">
			<button type="submit">Guardar</button>
			<a href="inicio">Volver</a>
		</div>
	</form>
</body>
</html>