
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página inicial</title>
<style type="text/css">
body {
	font-family: Helvetica, Arial, Sans-serif;
	width: 600px;
	margin: auto;
}

h1 {
	box-sizing: border-box;
	padding: 0px;
	margin: 0px;
	text-align: center;
	background-color: tomato;
	color: white;
	border: none;
	width: 100%;
	border-radius: 10px 10px 0 0;
}

hr {
	
}

form {
	width: 600px;
	padding: 10px 20px;
	border-right: 1px solid tomato;
	border-left: 1px solid tomato;
	border-bottom: 1px solid tomato;
	
	border-radius: 0 0 10px 10px;
	box-sizing: border-box;
}

input {
	display: block;
	margin: 12px auto;
	padding: 10px 12px;
	width: 440px;
	font-size: 16px;
	border: none;
	border-bottom: 1px solid tomato;
}

input[type="submit"] {
	border: 1px solid rgba(0, 0, 0, .6);
	background-color: rgba(255, 255, 255, .6);
	width: 220px;
	border: 1px solid tomato;
	box-sizing: border-box;
	text-transform: uppercase;
	font-weight: bold;
}

input[type="submit"]:hover {
	background-color: tomato;
	color: white;
	border: 1px solid tomato;
}
</style>
</head>
<body>
	<c:out value="${'Bem vindo ao JSTL'}"/>
	<br>
	<h1>Java Avançado</h1>
	<%-- <%="Java Avançado..." %>
	
	<form action="receber.jsp" method="post">
	<input type="text" name="nome" id="nome" placeholder="Digite seu nome: " /> <br>
	<input type="email" name="email" id="email" placeholder="Digite seu email: " /> <br>
	<input type="submit" value="Enviar"/>
	</form> --%>
	<%-- <%=calcula.calcula(50) %> --%>
	<form action="LoginServlet" method="post">
		<input type="text" name="login" id="login" placeholder="Digite seu login:" /> 
		<input type="password" name="senha" id="senha" placeholder="Digite sua senha:" /> 
		<input type="submit" value="Entrar" />
	</form>
	
</body>
</html>