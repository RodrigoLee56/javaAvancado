
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página inicial</title>
<link rel="stylesheet" href="css/indexStyle.css">
</head>
<body>
	<c:out value="${'Bem vindo ao JSTL'}"/>
	<br>
	<h1>Java Avançado</h1>
	
	<form action="LoginServlet" method="post">
		<input type="text" name="login" id="login" placeholder="Digite seu login:" /> 
		<input type="password" name="senha" id="senha" placeholder="Digite sua senha:" /> 
		<input type="submit" value="Entrar" />
	</form>
	
</body>
</html>