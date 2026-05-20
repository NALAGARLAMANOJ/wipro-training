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
<body>
<h2>Add New Course</h2>
<form:form action="save" modelAttribute="course" method="POST">
    Course Title: <form:input path="title" />
    <input type="submit" value="Save Course" />
</form:form>
<br>
<a href="${pageContext.request.contextPath}/student/view">View All Enrollments</a>
</body>
</html>
