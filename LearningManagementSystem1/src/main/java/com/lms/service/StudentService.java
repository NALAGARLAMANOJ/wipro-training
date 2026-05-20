package com.lms.service;

import com.lms.dao.StudentDao;
import com.lms.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void saveStudent(Student s) {
        studentDao.saveStudent(s);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getById(id);
    }
}