<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%--     import="org.json.JSONObject,org.json.JSONException,java.util.*"%>
 --%> <%@ page isELIgnored="false"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}
<form action="cityToSearch">
	<h1>Welcome to online ticket booking system</h1>
	Search: <input type="search" name="cityToSearch"/>
			<input type="submit" value="submit"/>
			
</form>			
</body>
</html>