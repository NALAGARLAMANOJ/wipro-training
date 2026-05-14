<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="com.lms.entity.Student" %>
<%@ page import="com.lms.entity.Course" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>LMS Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>

<body>

<h1>Learning Management System</h1>

<hr>

<a class="btn btn-primary" href="studentForm"  role="button">Add Student</a>
<br><br>

<a class="btn btn-primary" href="courseForm" role="button">Add Course</a>
<br><br>

<a class="btn btn-primary" href="enrollForm" role="button">Enroll Student</a>
<br><br>

<!-- <a class="btn btn-primary" href="/" role="button">View Enrollments</a> -->

<hr>

<h2>Enrollment Details</h2>

<table border="1" cellpadding="10" class="table table-striped">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Courses</th>
    </tr>

    <%

        List<Student> students =
                (List<Student>) request.getAttribute("students");

        if (students != null) {

            for (Student s : students) {

    %>

    <tr>

        <td><%= s.getId() %></td>

        <td><%= s.getName() %></td>

        <td><%= s.getEmail() %></td>

        <td>

            <%

                try {

                    Collection courses = s.getCourses();

                    if (courses != null) {

                        Iterator iterator = courses.iterator();

                        while (iterator.hasNext()) {

                            Course c = (Course) iterator.next();

            %>

            <%= c.getCourseName() %><br>

            <%

                }

            } else {

            %>

            No Courses Assigned

            <%

                }

            } catch (Exception e) {

            %>

            Error Loading Courses

            <%

                }

            %>

        </td>

    </tr>

    <%

            }

        }

    %>

</table>

</body>
</html>