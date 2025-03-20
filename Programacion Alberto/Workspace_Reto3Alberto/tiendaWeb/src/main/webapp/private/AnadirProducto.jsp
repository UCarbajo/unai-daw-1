<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Añadir producto</title>
</head>
<body>
	<form action="anadirProducto" method="post" enctype="multipart/form-data">
		<div class="input-group">
			<label>Nombre</label> <input type="text" name="nombre" required>
		</div>
		<div class="input-group">
			<label>Precio</label> <input type="text" name="precio" required>
		</div>
		<div class="input-group">
			<label>Descripcion</label> <input type="text" name="descripcionCorta" required>
		</div>
		<div class="input-group">
			<label>Descripcion larga</label> <input type="text" name="descripcionLarga" required>
		</div>
		<div class="input-group">
			<label>Stock</label> <input type="text" name="stock" required>
		</div>
		<div>
			<label>Imagen producto</label> <input type="file" name="rutaImagen" required>
		</div>

		<select name="categoria">
			<c:forEach var="categoria" items="${listaCategoria }">
				<option value="${categoria.id }">${categoria.categoria }</option>
			</c:forEach>
		</select>
		<button type="submit">Guardar</button>
	</form>
</body>
</html>