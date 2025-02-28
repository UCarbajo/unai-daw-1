<%@page import="com.centrosanluis.model.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("listaUsuarios"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<% for(Usuario u: listaUsuarios){ %>
	<tr>
		<th><% u.getName(); %></th>
		<th><% u.getLastName(); %></th>
		<th><% u.getPhoneNumber(); %></th>
		<th><% u.getMail(); %></th>
		<th><% u.getUserName(); %></th>
	</tr>
	<% } %>
</table>

</body>
</html>