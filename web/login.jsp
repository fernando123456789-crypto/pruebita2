<%-- 
    Document   : login
    Created on : 11 may. 2025, 10:56:05 p. m.
    Author     : Usuario
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
    <link rel="stylesheet" type="text/css" href="Resources/css/styles.css">
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label for="correo">Correo:</label>
        <input type="text" id="correo" name="correo" required><br><br>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Ingresar">
    </form>
</body>
</html>