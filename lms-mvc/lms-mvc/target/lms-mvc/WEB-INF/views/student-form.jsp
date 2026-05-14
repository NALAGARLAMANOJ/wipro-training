<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Add Student</title>

</head>

<body>

<h2>Add Student</h2>

<form action="saveStudent"
      method="post">

    Name :

    <input type="text"
           name="name">

    <br><br>

    Email :

    <input type="text"
           name="email">

    <br><br>

    <input type="submit"
           value="Add Student">

</form>

<br>

<a href="/">Back</a>

</body>

</html>