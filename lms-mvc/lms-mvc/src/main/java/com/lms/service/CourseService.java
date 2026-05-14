package com.lms.service;

import java.util.List;

import com.lms.dao.CourseDao;
import com.lms.entity.Course;

public class CourseService {

    CourseDao dao = new CourseDao();


    public void saveCourse(Course course) {

        dao.saveCourse(course);
    }


    public List<Course> getAllCourses() {

        return dao.getAllCourses();
    }


    public Course getCourseById(int id) {

        return dao.getCourseById(id);
    }

}