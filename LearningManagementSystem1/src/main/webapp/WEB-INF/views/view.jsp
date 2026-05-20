<%--
  Created by IntelliJ IDEA.
  User: ROHIT
  Date: 13-05-2026
  Time: 01:17 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<body>
<h2>Student Enrollment List</h2>
<table border="1">
    <tr>
        <th>Student Name</th>
        <th>Email</th>
        <th>Courses</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>
                <c:forEach var="c" items="${s.courses}">
                    ${c.title}<br>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath}/student/showForm">Add Student</a> |
<a href="${pageContext.request.contextPath}/course/showForm">Add Course</a> |
<a href="${pageContext.request.contextPath}/student/enrollForm">Enroll Students</a>
</body>
</html>