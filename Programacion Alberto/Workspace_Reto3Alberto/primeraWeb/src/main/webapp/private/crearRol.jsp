<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
=======
<%@page import="java.awt.print.Printable"%>
<%@page import="com.centrosanluis.model.Rol"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%Rol rol = (Rol) request.getAttribute("rol"); %>
>>>>>>> 6e42ed3b3b43565fef325dcb42757c8c0558298f
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear rol</title>
</head>
<body>
<<<<<<< HEAD
<form action="../altaRol" method="post">
	<input type="text" placeholder="Rol" name="nombre" />
	<button type="submit">Guardar</button>
=======
<form action="${pageContext.request.contextPath}/altaRol" method="post">
	<%= rol != null ? "<input type='hidden' name='id' value='" + rol.getId() + "'>" : "" %>
	<input type="text" placeholder="Rol" name="nombre" <%= rol != null ? "value='" + rol.getNombre() + "'" : "" %> />
	<button type="submit">Guardar</button>

>>>>>>> 6e42ed3b3b43565fef325dcb42757c8c0558298f
</form>
</body>
</html>