<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Persona" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bienvenido</title>
</head>
<body>
    <h1>Lista de Personas</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
        </tr>
        <%
            List<Persona> personas = (List<Persona>) request.getAttribute("personas");
            if (personas != null) {
                for (Persona p : personas) {
        %>
        <tr>
            <td><%= p.getId() %></td>
            <td><%= p.getNombre() %></td>
            <td><%= p.getApellido() %></td>
        </tr>
        <% 
                }
            } else {
        %>
        <tr><td colspan="3">No hay personas para mostrar</td></tr>
        <% } %>
    </table>
</body>
</html>
