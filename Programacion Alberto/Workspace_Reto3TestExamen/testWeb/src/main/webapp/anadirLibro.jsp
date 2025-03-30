<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="anadirlibro" method="post" enctype="multipart/form-data">
		<label>Título</label>
		<input type="text" name="titulo" placeholder="Título" required>
		<label>Autor</label>
		<input type="text" name="autor" placeholder="Autor" required>
		<label>Año de publicación</label>
		<input type="date" name="fecha" required>
		<select name="categoria">
			<c:forEach var="cat" items="${listaCategoria }">
				<option value="${cat.id}">${cat.tipo}</option>
			</c:forEach>
		</select>
		<label>Portada libro</label>
		<input type="file" name="portada" required>
		<button type="submit">Guardar libro</button>
		<button type="reset">Reiniciar</button>
	</form>
</body>
</html>