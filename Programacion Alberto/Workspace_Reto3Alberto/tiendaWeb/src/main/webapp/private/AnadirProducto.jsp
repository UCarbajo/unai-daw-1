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
	<h1>
	<c:choose>
		<c:when test="${not empty producto }">
			Editar producto
		</c:when>
		<c:otherwise>
			Añadir producto
		</c:otherwise>
	</c:choose>
	</h1>
	<form action="anadirProducto" method="post" enctype="multipart/form-data">
		<div class="input-group">
			<label>Nombre</label> 
			<input type="text" name="nombre" value="${not empty producto ? producto.nombre:'' }" required>
		</div>
		<div class="input-group">
			<label>Precio</label> 
			<input type="text" name="precio" value="${not empty producto ? producto.precio:'' }" required>
		</div>
		<div class="input-group">
			<label>Descripcion</label> 
			<input type="text" name="descripcionCorta" value="${not empty producto ? producto.descripcionCorta:'' }" required>
		</div>
		<div class="input-group">
			<label>Descripcion larga</label> 
			<input type="text" name="descripcionLarga" value="${not empty producto ? producto.descripcionLarga:'' }" required>
		</div>
		<div class="input-group">
			<label>Stock</label> 
			<input type="text" name="stock" value="${not empty producto ? producto.stock:'' }" required>
		</div>
		<div>
			<label>Imagen producto</label> 
			<input type="file" name="rutaImagen" ${empty producto ? "required":"" }>
		</div>
		<c:if test="${not empty producto}">
			<input type="hidden" name="id" value="${producto.id }">
			<input type="hidden" name="rutaImagenAntigua" value="${producto.rutaImagen }" >
		</c:if>
		<select name="categoria">
			<c:forEach var="categoria" items="${listaCategoria }">
				<option value="${categoria.id }" ${producto.categoria.id == categoria.id ? 'selected':'' }>${categoria.categoria }</option>
			</c:forEach>
		</select>
		<button type="submit">Guardar</button>
	</form>
</body>
</html>