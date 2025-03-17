
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de usuario</title>
</head>
<body>
<div class="register-container">
	<h2>
	<c:choose>
		<c:when test="${not empty usuario }">
			Editar usuario
		</c:when>
		<c:otherwise>
			Alta de usuario
		</c:otherwise>
	</c:choose>
	</h2>
	<form action="${not empty usuario ? editarUsuario:registro}" method="post">
		<input type="text" name="nombre" value="${not empty usuario ? usuario.nombre:'' }" placeholder="Nombre" required>
		<input type="text" name="apellidos" value="${not empty usuario ? usuario.apellidos:'' }" placeholder="Apellidos" required>
		<input type="text" name="email" value="${not empty usuario ? usuario.email:'' }" placeholder="Correo electronico" required>
		<input type="text" name="telefono" value="${not empty usuario ? usuario.telefono:'' }" placeholder="Telefono" required>
		<input type="text" name="usuario" value="${not empty usuario ? usuario.usuario:'' }" ${not empty usuario ? "readonly":'' } placeholder="Usuario" required>
		
		<c:if test="${empty usuario }">
			<input type="text" name="contrasena" placeholder="Contraseña" required>
		</c:if>
		
		<select name="rol">
			<c:forEach var="rol" items="${roles}">
				<option value="${rol.id }" ${usuario.rol.id == rol.id ? 'selected':'' }>${rol.nombre }</option>
			</c:forEach>
		</select>
		
		<!-- input type="file" name="imagen" required -->
		<button type="submit">
		<c:choose>
			<c:when test="${not empty usuario }">
				Editar Usuario
			</c:when>
			<c:otherwise>
		 		Crear Usuario
		 	</c:otherwise>
		 </c:choose>
		 </button>
	</form>
	<c:choose>
	<c:when test="${not empty usuario }">
		<a href="private/index.jsp">Volver al index</a>
	</c:when>
	<c:otherwise>
		<a href="login.jsp">Volver al login</a>
	</c:otherwise>
	</c:choose>
</div>
</body>
</html>