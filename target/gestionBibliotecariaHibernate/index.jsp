<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Iniciar sesión</title>
</head>
<body>
<h2>Inicio de Sesión</h2>

<% String error = (String) request.getAttribute("error");
   if (error != null) { %>
    <p style="color:red;"><%= error %></p>
<% } %>

<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
    <label>Correo:</label><br>
    <input type="text" name="correo" required><br><br>

    <label>Contraseña:</label><br>
    <input type="password" name="contrasena" required><br><br>

    <button type="submit">Iniciar sesión</button>
</form>
</body>
</html>
