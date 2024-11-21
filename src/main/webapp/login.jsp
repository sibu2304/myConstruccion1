<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Iniciar Sesi�n</h2>
    <form action="LoginServlet" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <label for="contrase�a">Contrase�a:</label>
        <input type="password" id="contrase�a" name="contrase�a" required>
        <br>
        <input type="submit" value="Iniciar Sesi�n">
    </form>
</body>
</html>
