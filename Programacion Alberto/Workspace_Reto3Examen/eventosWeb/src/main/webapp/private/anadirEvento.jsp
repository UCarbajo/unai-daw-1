<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="anadirevento" method="post">
		<label>Nombre</label>
		<input type="text" name="nombre" required>
		<label>Fecha</label>
		<input type="date" name="fecha" required>
		<label>Descripcion</label>
		<!--  <input type="text" name="descripcion" required>-->
		<textarea name="descripcion" rows="8" cols="8" required></textarea>
		<button type="submit">Guardar</button>
	</form>
<a href="index">Volver</a>
</body>
</html>