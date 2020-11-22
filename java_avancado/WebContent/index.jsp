<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página inicial</title>
</head>
<body>
	<h1>Java Avançado</h1>
	<%="Java Avançado..." %>
	
	<form action="receber.jsp" method="post">
	<input type="text" name="nome" id="nome" placeholder="Digite seu nome: " /> <br>
	<input type="email" name="email" id="email" placeholder="Digite seu email: " /> <br>
	<input type="submit" value="Enviar"/>
	</form>
</body>
</html>