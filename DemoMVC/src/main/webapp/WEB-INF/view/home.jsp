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
<%
String name = (String) request.getAttribute("name");
%>


<p>Hello there,<p>
<p>My name is <%=name %></p>

<h1>List for Friends</h1>
<%
List<String> friends = (List<String>) request.getAttribute("friends");
int index = 0;
for(String frnd:friends){
	index ++;
%>
<p><%=index%>) <%=frnd%></p>
<%
}
%>

</body>
</html>