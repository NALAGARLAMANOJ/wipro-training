package com.lms.dao;

import com.lms.entity.Student;
import com.lms.config.HibernateUtil; // Import your utility
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentDao {

    // Use the utility instead of creating a new Configuration() here
    private SessionFactory factory = HibernateUtil.getSessionFactory();

    public void saveStudent(Student s) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        // Use merge for Hibernate 6/Tomcat 10
        session.merge(s);
        session.getTransaction().commit();
    }

    public List<Student> getAllStudents() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> list = session.createQuery("from Student", Student.class).getResultList();
        session.getTransaction().commit();
        return list;
    }

    public Student getById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        session.getTransaction().commit();
        return s;
    }
}