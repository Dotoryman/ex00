<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02List.jsp</title>
</head>
<body>
	<h1>ex02List.jsp</h1>
	<ul>
		<c:forEach var="name" items="${ids}">
			<li> 이름은 : ${name }</li>
		</c:forEach>
	</ul>
	<p>ids = ${ids }</p>
</body>
</html>