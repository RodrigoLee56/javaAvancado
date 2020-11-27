<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aprendendo include</title>
</head>
<body>
	<%-- 	<%@include file="cabecalho.jsp"%> --%>
	<jsp:include page="cabecalho.jsp" />
	<main>principal</main>
	<jsp:include page="rodape.jsp" />
	<%-- 	<%@include file="rodape.jsp"%> --%>
</body>
</html>