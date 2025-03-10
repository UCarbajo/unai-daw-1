<%@page import="com.centrosanluis.model.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("listaUsuarios");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD

	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Teléfono</th>
			<th>Correo</th>
=======
	<table>
	<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Número de teléfono</th>
			<th>Correo electronico</th>
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
			<th>Nombre de usuario</th>
			<th>Rol</th>
			<th>Acción</th>
		</tr>
		<%
		for (Usuario u : listaUsuarios) {
<<<<<<< HEAD
		%>
		<tr>
			<td><%=u.getName()%></td>
			<td><%=u.getLastName()%></td>
			<td><%=u.getPhoneNumber()%></td>
			<td><%=u.getMail()%></td>
			<td><%=u.getUserName()%></td>
			<td><%=u.getRol().getRol()%></td>
			<td>
			<form action="listadoUsuarios" method="post">
				<button type="submit" name="action" value="<%= u.getMail() %>">Borrar</button>
			</form>
=======
		%>		
		<tr>
			<td><%=u.getName()%></th>
			<td><%=u.getLastName()%></th>
			<td><%=u.getPhoneNumber()%></th>
			<td><%=u.getMail()%></th>
			<td><%=u.getUserName()%></th>
			<td><%=u.getRol().getRol()%></th>
			<td>
				<form action="listadoUsuarios" method="post" >
					<button type="submit" name="eliminar" value="<%= u.getMail() %>">Eliminar</button>
				</form>	
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
			</td>
		</tr>
		<%
		}
		%>
<<<<<<< HEAD

=======
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519
	</table>

</body>
</html>