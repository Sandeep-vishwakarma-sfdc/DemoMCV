<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Help</h1>
We use Technologies like

<%
List<String> technologies = (List<String>) request.getAttribute("technologies");
for (String tech:technologies){
%>
<p><%=tech %>
<%
}
%>
</body>
</html>