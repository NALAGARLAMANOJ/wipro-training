<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
        String email=request.getParameter("username");
        String password=request.getParameter("password");
        if( password==null || email.isEmpty()){
        	response.sendRedirect("error.jsp");
        	
        }
%>
<h2>
<%
     int a=10, b=20; %>
sum of two numbers:<%= (a+b) %>
welcome,<%= email %></h2>
</body>
</html>