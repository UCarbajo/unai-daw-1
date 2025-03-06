<%@page import="com.empresa.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
Usuario u = (Usuario) request.getSession().getAttribute("usuario");
String tipo = u.getTipo();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles/indexStyle.css">
</head>
<body>
    <form action="index" method="post">
        <div class="container">
            <h1>MENU</h1>
            <div class="button-group">
                <button type="submit" name="action" value="verProductos">Ver productos</button>
                <% if (tipo.equals("admin")) { %>
                <button type="submit" name="action" value="addProductos">Añadir productos</button>
                <% } %>
                <button type="submit" name="action" value="cerrarSesion">Cerrar sesión</button>
            </div>
        </div>
    </form>
</body>
</html>
