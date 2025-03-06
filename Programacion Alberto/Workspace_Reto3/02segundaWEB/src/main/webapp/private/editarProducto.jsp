<%@page import="com.empresa.model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% Producto p = (Producto) request.getAttribute("producto"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar producto</title>
<link rel="stylesheet" href="styles/editarProductoStyle.css">
</head>
<body>
<div class="container-producto">
    <h1>Editar Producto</h1>
    <form action="editarproducto" method="post">
        <div class="input-group">
            <label>Nombre</label>
            <input type="text" name="nombre" value="<%= p.getNombre() %>">
        </div>
        <div class="input-group">
            <label>Precio</label>
            <input type="text" name="precio" value="<%= p.getPrecio() %>">
        </div>
        <div class="input-group">
            <label>Stock</label>
            <input type="text" name="stock" value="<%= p.getStock() %>">
        </div>
        <div class="input-group">
            <label>Descripción</label>
            <input type="text" name="descripcion" value="<%= p.getDescripcion() %>">
        </div>
        <div class="button-group">
            <button type="submit" name="action" value="guardar">Guardar</button>
            <a href="productomostrar">Volver</a>
        </div>
    </form>
</div>
</body>
</html>
