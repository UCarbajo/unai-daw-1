<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta de usuario</title>
</head>
<body>
	<form action="altaUsuario" method="POST">
        <input type="text" name="name" placeholder="Nombre">
        <input type="text" name="lastName" placeholder="Apellidos"> <br><br>
        <input type="text" name="phoneNumber" placeholder="Telefono">
        <input type="email" name="mail" placeholder="Correo electronico"><br><br>
        <input type="text" name="userName" placeholder="Nombre de Usuario">
        <input type="password" name="passWord" placeholder="Contraseña"><br><br>
        <button type="submit">Entrar</button>
        <button type="reset">Borrar</button>
    </form>
    <%if(request.getSession().getAttribute("errorUsuario") != null){%>
    	<p>NOMBRE DE USUARIO NO VÁLIDO</p>
   	<% }%> 
</body>
</html>