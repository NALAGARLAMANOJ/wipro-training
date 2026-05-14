package com.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.entity.Course;
import com.lms.entity.Student;
import com.lms.service.CourseService;
import com.lms.service.StudentService;

@Controller
public class StudentController {

    StudentService studentService =
            new StudentService();

    CourseService courseService =
            new CourseService();


    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "students",
                studentService.getAllStudents());

        return "view";
    }


    @GetMapping("/studentForm")
    public String studentForm() {

        return "student-form";
    }


    @PostMapping("/saveStudent")
    public String saveStudent(Student student) {

        studentService.saveStudent(student);

        return "redirect:/";
    }


    @GetMapping("/enrollForm")
    public String enrollForm(Model model) {

        model.addAttribute(
                "students",
                studentService.getAllStudents());

        model.addAttribute(
                "courses",
                courseService.getAllCourses());

        return "enroll-form";
    }


    @PostMapping("/enrollStudent")
    public String enrollStudent(

            @RequestParam("studentId")
            int studentId,

            @RequestParam("courseIds")
            int[] courseIds) {

        Student student =
                studentService
                        .getStudentById(studentId);

        List<Course> selectedCourses =
                new ArrayList<Course>();


        for(int id : courseIds) {

            Course course =
                    courseService
                            .getCourseById(id);

            selectedCourses.add(course);
        }

        student.setCourses(selectedCourses);

        studentService.saveStudent(student);

        return "redirect:/";
    }

}