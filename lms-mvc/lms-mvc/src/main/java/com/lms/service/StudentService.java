package com.lms.service;

import java.util.List;

import com.lms.dao.StudentDao;
import com.lms.entity.Student;

public class StudentService {

    StudentDao dao = new StudentDao();


    public void saveStudent(Student student) {

        dao.saveStudent(student);
    }


    public List<Student> getAllStudents() {

        return dao.getAllStudents();
    }


    public Student getStudentById(int id) {

        return dao.getStudentById(id);
    }

}