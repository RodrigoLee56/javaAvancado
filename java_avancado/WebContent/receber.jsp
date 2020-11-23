<jsp:useBean id="calcula" class="beans.BeanCursoJSP" type="beans.BeanCursoJSP"/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%="<h2>Nome Recebido: " + request.getParameter("nome") + "</h2>"%> --%>
	<jsp:setProperty property="*" name="calcula"/>
	<h3>Cabecalho</h3>
	<jsp:getProperty property="nome" name="calcula"/>
	<hr>
	<jsp:getProperty property="ano" name="calcula"/>
	<hr>
	<jsp:getProperty property="sexo" name="calcula"/>
</body>
</html>