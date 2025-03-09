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
				<form action="listadoUsuarios" method="post" >
					<button type="submit" name="eliminar" value="<%= u.getMail() %>">Eliminar</button>
				</form>	
			</td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>