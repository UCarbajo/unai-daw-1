<%@page import="com.centrosanluis.model.Rol"%>
<%@page import="com.centrosanluis.model.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("listaUsuarios");
Usuario user = (Usuario) request.getAttribute("usuario");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Listado de Usuarios</title>
    <link rel="stylesheet" href="styles/listadoStyles.css">
</head>
<body>
    <div class="container">
        <h1>Listado de Usuarios</h1>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Número de Teléfono</th>
                    <th>Correo Electrónico</th>
                    <th>Nombre de Usuario</th>
                    <th>Rol</th>
                    <th>Acción</th>
                </tr>
            </thead>
            <tbody>
                <%
                for (Usuario u : listaUsuarios) {
                %>        
                <tr>
                    <td><%=u.getName()%></td>
                    <td><%=u.getLastName()%></td>
                    <td><%=u.getPhoneNumber()%></td>
                    <td><%=u.getMail()%></td>
                    <td><%=u.getUserName()%></td>
                    <td><%=u.getRol().getRol()%></td>
                    <td>
                        <form action="listadoUsuarios" method="post">
                            <input type="hidden" name="mail" value="<%= u.getMail() %>">
                            <button type="submit" name="boton" value="eliminar" class="btn-delete">Eliminar</button>
                            <button type="submit" name="boton" value="editar" class="btn-edit">Editar</button>
                        </form>    
                    </td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>

        <% if(user != null) { %>
        <div class="form-container">
            <h2>Editar Usuario</h2>
            <%ArrayList<Rol> listaRoles = (ArrayList<Rol>) request.getAttribute("listaRoles"); %>
            <form action="listadoUsuarios" method="post">
                <div class="input-group">
                    <label>Nombre</label>
                    <input type="text" name="nombre" value="<%= user.getName() %>" required>
                </div>
                <div class="input-group">
                    <label>Apellido</label>
                    <input type="text" name="apellido" value="<%= user.getLastName() %>" required>
                </div>
                <div class="input-group">
                    <label>Teléfono</label>
                    <input type="text" name="telefono" value="<%= user.getPhoneNumber() %>" required>
                </div>
                <div class="input-group">
                    <label>Usuario</label>
                    <input type="text" name="usuario" value="<%= user.getUserName() %>" required>
                </div>
                <div class="input-group">
                    <label>Rol</label>
                    <select name="rol">
                        <option value="<%= user.getRol().getId() %>"><%= user.getRol().getRol() %></option>
                        <% for (Rol r : listaRoles) { 
                            if(r.getId() != user.getRol().getId()) { %>
                            <option value="<%= r.getId() %>"><%= r.getRol() %></option>
                        <% } } %>
                    </select>
                </div>
                <button type="submit" name="boton" value="guardar" class="btn-save">Guardar</button>
            </form>
        </div>
        <% } %>
    </div>
</body>
</html>
