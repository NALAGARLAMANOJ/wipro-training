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
welcome,<%= email %></h2>
<a href="dashboard.jsp">dashboard</a>

</body>
</html>