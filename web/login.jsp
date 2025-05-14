<%-- 
    Document   : login
    Created on : 11 may. 2025, 10:56:05 p. m.
    Author     : Usuario
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Iniciar Sesión</title>
    <link rel="stylesheet" type="text/css" href="Resources/css/styles.css">
</head>
<body class="login-body">
    <div class="login-container">
        <h2 class="login-title">Bienvenido</h2>
        <form class="login-form" action="LoginServlet" method="post">
            <input class="login-input" type="text" name="usuario" placeholder="Usuario" required>
            <input class="login-input" type="password" name="clave" placeholder="Contraseña" required>
            <button class="login-button" type="submit">Iniciar sesión</button>
        </form>
    </div>
</body>
</html>
