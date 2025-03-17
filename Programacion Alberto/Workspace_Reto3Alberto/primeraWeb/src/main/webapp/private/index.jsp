<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HOLA, ${usuario.usuario } (${usuario.rol.nombre})</h1>
<p><a href="../listadoUsuarios">Listado Usuarios</a></p>
<c:if test="${usuario.rol.id == 1 }">
	<p><a href="../altaRol">Crear Rol</a></p>
	<p><a href="../listadoRol">Listado Rol</a></p>
</c:if>
</body>
</html>