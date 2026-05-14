<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Add Course</title>

</head>

<body>

<h2>Add Course</h2>

<form action="saveCourse"
      method="post">

    Course Name :

    <input type="text"
           name="courseName">

    <br><br>

    Duration :

    <input type="text"
           name="duration">

    <br><br>

    <input type="submit"
           value="Add Course">

</form>

<br>

<a href="/">Back</a>

</body>

</html>
