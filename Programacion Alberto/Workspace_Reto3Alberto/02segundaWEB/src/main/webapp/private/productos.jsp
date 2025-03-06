<%@page import="com.empresa.model.Usuario"%>
<%@page import="com.empresa.model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<Producto> listaProductosJSP = (ArrayList<Producto>) request.getAttribute("listaProductos");
Usuario u = (Usuario) request.getSession().getAttribute("usuario");
String tipo = u.getTipo();
int pagina = (int) request.getAttribute("pagina");
String producto = (String) request.getAttribute("producto");
int min =  (int) request.getAttribute("min");
int max =  (int) request.getAttribute("max");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Productos</title>
<link rel="stylesheet" href="styles/productosStyle.css">
</head>
<body>
	<div class="container">
		<h1>Listado de Productos</h1>
		<table>
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Precio</th>
					<th>Stock</th>
					<th>Descripción</th>
					<%if(tipo.equals("admin")){ %>
					<th>Acción</th>
					<%}; %>
				</tr>
			</thead>
			<tbody>
				<%
				for (Producto p : listaProductosJSP) {
				%>
				<tr>
					<td><%=p.getNombre()%></td>
					<td><%=p.getPrecio()%> €</td>
					<td><%=p.getStock()%></td>
					<td><%=p.getDescripcion()%></td>
					<%if(tipo.equals("admin")){ %>
					<td>
						<form action="productomostrar" method="post">
							<input type="hidden" name="id" value="<%=p.getId()%>">
							<button type="submit" name="action" value="editar">Editar</button>
							<button type="submit" name="action" value="eliminar" onclick="return confirm('¿Eliminar producto');">Eliminar</button>
						</form>
					</td>
					<%}; %>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<div class="pagina-group">
			<a href="productomostrar<% if (pagina > 0) { %>?pagina=<%= pagina - 10 %><% } else { %>?pagina=0<% } if (producto != null && !producto.trim().isEmpty()) { %>&producto=<%= producto %><% } %>&precioMin=<%= min %>&precioMax=<%= max %>">Anterior</a>
			<a href="index">Volver</a>
			<a href="productomostrar?pagina=<%=pagina+10 %><%if(producto != null && !producto.trim().isEmpty()) {%>&producto=<%=producto %><% }%>&precioMin=<%=min%>&precioMax=<%=max%>">Siguiente</a>
		</div>
	</div>
	<div class="container-busqueda">
		<form action="productomostrar" method="get">
			<div class="imput-group">
				<label>Nombre producto</label>
				<input type="text" name="producto" placeholder="Nombre producto">
			</div>
			<div class="precio-group">
				<label>Precio min</label>
				<input type="text" name="precioMin" placeholder="Precio minimo">
				<label>Precio max</label>
				<input type="text" name="precioMax" placeholder="Precio maximo">
			</div>
			
			<div class="button-group">
				<button type="submit" name="action" value="buscarProducto">Buscar</button>
				<a href="productomostrar">Reiniciar busqueda</a>
			</div>
		</form>
	</div>
</body>
</html>