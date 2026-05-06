
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>



    <div class="alert alert-success">
        ✅ You have successfully logged in!
    </div>

    <h3>Product Dashboard</h3>

   

        <%
            List<String> products = (List<String>) request.getAttribute("products");

            for(String product : products){
        %>
      
            <h5 style="border:2px solid black; width=50%"><%= product %></h5>
                    
                    
               <% } %>

  



</body>
</html>