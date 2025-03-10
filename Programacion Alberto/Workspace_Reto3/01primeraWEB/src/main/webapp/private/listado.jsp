<%@page import="com.centrosanluis.model.Rol"%>
<%@page import="com.centrosanluis.model.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("listaUsuarios");
Usuario user = (Usuario) request.getAttribute("usuario");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Número de teléfono</th>
			<th>Correo electronico</th>
			<th>Nombre de usuario</th>
			<th>Rol</th>
			<th>Acción</th>
		</tr>
		<%
		for (Usuario u : listaUsuarios) {
		%>		
		<tr>
			<td><%=u.getName()%></th>
			<td><%=u.getLastName()%></th>
			<td><%=u.getPhoneNumber()%></th>
			<td><%=u.getMail()%></th>
			<td><%=u.getUserName()%></th>
			<td><%=u.getRol().getRol()%></th>
			<td>
				<form action="listadoUsuarios" method="post">
					<input type="hidden" name="mail" value="<%= u.getMail() %>">
					<button type="submit" name="boton" value="eliminar">Eliminar</button>
					<button type="submit" name="boton" value="editar">Editar</button>
				</form>	
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<% if(user != null){%>
	<%ArrayList<Rol> listaRoles = (ArrayList<Rol>) request.getAttribute("listaRoles"); %>
	<form action="listadoUsuarios" method="post">
		<label>Nombre</label>
		<input type="text" name="nombre" value="<%= user.getName() %>">
		<input type="text" name="apellido" value="<%= user.getLastName() %>">
		<input type="text" name="telefono" value="<%= user.getPhoneNumber() %>">
		<input type="hidden" name="email" value="<%= user.getMail() %>">
		<input type="text" name="usuario" value="<%= user.getUserName() %>">
		<select name="rol">
		<%for (Rol r : listaRoles) { %>
			<option value="<%=r.getId() %>"><%=r.getRol() %></option>
		<%} %>
		</select>
		<button type="submit" name="boton" value="guardar">Guardar</button>
	</form>
	<%} %>

</body>
</html>