<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
<h2>Enroll Student in Courses</h2>

<form action="${pageContext.request.contextPath}/student/processEnroll" method="POST">
    <label>Select Student:</label>
    <select name="id" required>
        <option value="">-- Select Student --</option>
        <c:forEach var="student" items="${allStudents}">
            <option value="${student.id}">${student.name} (${student.email})</option>
        </c:forEach>
    </select>

    <br><br>

    <label>Select Courses:</label><br>
    <c:forEach var="course" items="${allCourses}">
        <input type="checkbox" name="courses" value="${course.id}">
        ${course.title}<br>
    </c:forEach>

    <br><br>
    <input type="submit" value="Complete Enrollment" />
</form>

<br>
<a href="${pageContext.request.contextPath}/student/view">View Enrollments</a>
</body>
</html>