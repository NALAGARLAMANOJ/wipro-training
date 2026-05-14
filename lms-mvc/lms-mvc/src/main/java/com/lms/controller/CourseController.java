package com.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lms.entity.Course;
import com.lms.service.CourseService;

@Controller
public class CourseController {

    CourseService courseService =
            new CourseService();


    @GetMapping("/courseForm")
    public String courseForm() {

        return "course-form";
    }


    @PostMapping("/saveCourse")
    public String saveCourse(Course course) {

        courseService.saveCourse(course);

        return "redirect:/";
    }

}