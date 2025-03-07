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

	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Teléfono</th>
			<th>Correo</th>
			<th>Nombre de usuario</th>
			<th>Rol</th>
			<th>Acción</th>
		</tr>
		<%
		for (Usuario u : listaUsuarios) {
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
			</td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>