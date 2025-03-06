<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="styles/altaProductoStyle.css">
</head>
<body>
	<div class="container-producto">
		<form action="productos" method="post">
            <h1>Añadir nuevo Producto</h1>
        <div class="input-group">
			<label>Nombre del Producto</label>
			<input type="text" name="nombre" placeholder="Nombre del Producto" required>
        </div>
		<div class="input-group">
			<label>Precio</label>
			<input type="number" name="precio" min="0" value="0" placeholder="Precio" required>
        </div>
		<div class="input-group">
			<label>Cantidad</label>
			<input type="number" name="cantidad" min="1" value="1" placeholder="Cantidad" required>
        </div>
		<div class="input-group">
			<label>Nombre del Producto </label>
			<input name="descripcion" placeholder="descripcion" required>
        </div>
        <div class="button-group">
			<button type="submit">Guardar</button>
			<a href="index">Volver</a>
			<button type="reset">Borrar</button>
        </div>
		</form>
	</div>
</body>
</html>