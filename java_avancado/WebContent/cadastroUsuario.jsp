<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>
	<h3>Cadastro de Usuário</h3>
	<form action="salvarUsuarioServlet" method="post">
		<label for="login">Login:</label>
		<input type="text" name="login" id="login" placeholder="Login: " />
		<label for="senha">Senha:</label>
		<input type="password" name="password" id="password" placeholder="Senha: " />
		<input type="submit" value="Cadastrar"/>
	</form>
	
	<table>
			<thead>
				<tr>
					<th>Usuário</th>
					<th>Senha</th>
					<th>Editar</th>
					<th>Excluir</th>
				</tr>
			</thead>
			
		<!--
			A parte do foreach é simples, items recebe 
			a lista dá classe UsuarioDAO e o atributo var 
			cria um identificado para poder mostrar os valores 
			da lista referente
		-->
		<c:forEach items="${usuarios}" var="user">
			<tbody>
				<tr>
					<td>		
						<c:out value="${user.login}"/>
					</td>
				
					<td>
						<c:out value="${user.senha}"/>
					</td>
					
					<td>
						<a href="salvarUsuarioServlet?acao=edit">
							<img alt="Editar" src="img/svg/update.svg" width="25" height="25">
						</a>	
					</td>
					
					<td>
						<a href="salvarUsuarioServlet?acao=delete">
							<img alt="Excluir" src="img/svg/delete.svg" width="25" height="25">
						</a>
					</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>