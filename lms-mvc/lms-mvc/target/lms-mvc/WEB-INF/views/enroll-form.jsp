<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>

<%@ page import="com.lms.entity.Student" %>

<%@ page import="com.lms.entity.Course" %>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Enroll Student</title>

</head>

<body>

<h2>Enroll Student</h2>

<form action="enrollStudent"
      method="post">

    Select Student :

    <select name="studentId">

        <%

            List<Student> students =
                    (List<Student>)
                            request.getAttribute("students");

            for(Student s : students){

        %>

        <option value="<%=s.getId()%>">

            <%=s.getName()%>

        </option>

        <%

            }

        %>

    </select>

    <br><br>

    Select Courses :

    <br>

    <%

        List<Course> courses =
                (List<Course>)
                        request.getAttribute("courses");

        for(Course c : courses){

    %>

    <input type="checkbox"
           name="courseIds"
           value="<%=c.getId()%>">

    <%=c.getCourseName()%>

    <br>

    <%

        }

    %>

    <br>

    <input type="submit"
           value="Enroll">

</form>

<br>

<a href="/">Back</a>

</body>

</html>