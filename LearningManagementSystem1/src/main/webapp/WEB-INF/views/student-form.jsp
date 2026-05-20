<%--
  Created by IntelliJ IDEA.
  User: ROHIT
  Date: 13-05-2026
  Time: 01:17 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Register Student</title>
</head>
<body>
<h2>Register New Student</h2>

<!-- action="save" matches the @PostMapping("/save") in StudentController -->
<%--@elvariable id="student" type=""--%>
<form:form action="save" modelAttribute="student" method="POST">
    <table>
        <tr>
            <td><label>Student Name:</label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><label>Email ID:</label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Register Now" /></td>
        </tr>
    </table>
</form:form>

<br>
<hr>
<a href="${pageContext.request.contextPath}/student/view">View All Students</a> |
<a href="${pageContext.request.contextPath}/course/showForm">Add New Course</a>
</body>
</html>
