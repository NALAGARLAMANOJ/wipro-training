package com.lms.controller;

import com.lms.entity.Student;
import com.lms.entity.Course;
import com.lms.service.StudentService;
import com.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;  // ADD THIS

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student s) {
        studentService.saveStudent(s);
        return "redirect:/student/view";
    }

    @GetMapping("/enrollForm")
    public String showEnrollForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("allStudents", studentService.getAllStudents());
        model.addAttribute("allCourses", courseService.getAllCourses());
        return "enroll-form";
    }

    @PostMapping("/processEnroll")
    public String processEnroll(@RequestParam("id") int studentId,
                                @RequestParam(value="courses", required=false) List<Integer> courseIds) {
        Student existingStudent = studentService.getStudentById(studentId);
        List<Course> courses = new ArrayList<>();  // FIXED
        if (courseIds != null) {
            courses = courseIds.stream()
                    .map(courseService::getCourseById)
                    .collect(Collectors.toList());
        }
        existingStudent.setCourses(courses);
        studentService.saveStudent(existingStudent);
        return "redirect:/student/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "view";
    }
}