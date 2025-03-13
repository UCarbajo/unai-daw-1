<%@page import="com.centrosanluis.model.Rol"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%ArrayList<Rol> listaRoles = (ArrayList<Rol>) request.getAttribute("listaRoles"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Rol</th>
			<th>Acción</th>
		</tr>
	<%for (Rol r: listaRoles) {%>
		<tr>
			<td>
				<%=r.getNombre() %>
			</td>
			<td>
				<form action="altaRol" method="get">
					<input type="hidden" name="nombre" value="<%=r.getNombre()%>">
					<button type="submit" value="<%=r.getId()%>" name="id">Editar</button>
				</form>
				<form action="listadoRol" method="post">
					<button type="submit" value="<%=r.getId()%>" name="id">Borrar</button>
				</form>
			</td>
		</tr>
		<%} %>
	</table>
</body>
</html>