<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${message}
<a href="#">hello</a>
	<form action="cityToSearch">
		<jstl:forEach var="movie" items="${movies}">
			<tr>
								<td><a>${movie.movieName}</a></td>
			</tr>
		</jstl:forEach>
	</form>
</body>
</html>