package com.lms.service;

import com.lms.dao.CourseDao;
import com.lms.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void saveCourse(Course c) {
        courseDao.saveCourse(c);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    // ADD THIS METHOD
    public Course getCourseById(int id) {
        return courseDao.getCourseById(id);
    }
}