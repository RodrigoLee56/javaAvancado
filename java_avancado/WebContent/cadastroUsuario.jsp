<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>
	<h3>Cadastro de Usuário</h3>
	<form action="salvarUsuario">
		<label for="login">Login:</label>
		<input type="text" name="login" id="login" placeholder="Login: " />
		<label for="senha">Login:</label>
		<input type="password" name="password" id="password" placeholder="Senha: " />
		<input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>