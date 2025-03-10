<%@page import="com.centrosanluis.model.Rol"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
<%ArrayList<Rol> listaRoles = (ArrayList<Rol>) request.getAttribute("listaRoles"); %>
    <html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Registro de Usuario</title>
        <link rel="stylesheet" href="styles/registroStyle.css">
    </head>

    <body>
        <div class="container-formulario">
            <form action="registro" method="POST">
                <h2>Formulario de Registro</h2>
                <div class="input-group">
                    <input type="text" name="name" placeholder="Nombre" required>
                    <input type="text" name="lastName" placeholder="Apellidos" required>
                </div>
                <div class="input-group">
                    <input type="tel" name="phoneNumber" placeholder="Teléfono" required>
                    <input type="email" name="mail" placeholder="Correo Electrónico" required>
                </div>
                <div class="input-group">
                    <input type="text" name="userName" placeholder="Nombre de Usuario" required>
                    <input type="password" name="passWord" placeholder="Contraseña" required>
                </div>
               
                <div class="select-group">
                	<select name="rolID">
                	 <%for(Rol r : listaRoles) { %>
                	 	<option value="<%=r.getId()%>"><%=r.getRol()%></option>
                	  <%} %>
                	</select>	
                </div>
               
                <div class="button-group">
                    <button type="submit">Registrar</button>
                    <a href="login">Volver</a>
                    <button type="reset">Borrar</button>
                </div>
 					
				<%if(request.getSession().getAttribute("errorUsuario") !=null){%>
					<p class="mensaje-error">NOMBRE DE USUARIO NO VÁLIDO</p>
				<% }%>
				<%if(request.getSession().getAttribute("errorCampo") !=null){%>
					<p class="mensaje-error">RELLENA LOS CAMPOS CORRECTAMENTE</p>
				<% }%>
            </form>
        </div>
    </body>

    </html>