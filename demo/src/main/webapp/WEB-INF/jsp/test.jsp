<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>Hello! ${name}</h2>
<div>JSP List Test</div>
<c:forEach var="item" items="${list}" varStatus="idx">
${idx.index}, ${item} <br />
</c:forEach>

</body>
</html>