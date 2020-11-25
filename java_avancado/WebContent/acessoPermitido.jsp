<jsp:useBean id="calcula" class="model.Login" type="model.Login" scope="page"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty property="*" name="calcula"/>
	<h3>Acesso Liberado</h3>
	<p>Seja bem vindo ao Sistema em JSP</p>
</body>
</html>