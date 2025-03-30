<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        img {
            width: 80px;
            height: auto;
        }
    </style>
</head>
<body>
    <h2>Lista de Libros</h2>
	<form action="listalibros" method="get">
		<label>Titulo</label>
		<input type="text" name="titulo">
		<label>Autor</label>
		<input type="text" name="autor">
		<select name="categoria">
			<option value="0">Todos</option>
			<c:forEach var="categoria" items="${listaCategoria }">
				<option value="${categoria.id }">${categoria.tipo}</option>
			</c:forEach>
		</select>
		<button type="submit">Buscar</button>
	</form>
    <table>
        <thead>
            <tr>
                <th>Título</th>
                <th>Autor</th>
                <th>Fecha de Publicación</th>
                <th>Categoría</th>
                <th>Portada</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="libro" items="${listaLibros}">
                <tr>
                    <td>${libro.titulo}</td>
                    <td>${libro.autor}</td>
                    <td>${libro.anioPublicacion}</td>
                    <td>${libro.categoria.tipo}</td>
                    <td>
                        <img src="${libro.rutaImg}" alt="Portada">
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
