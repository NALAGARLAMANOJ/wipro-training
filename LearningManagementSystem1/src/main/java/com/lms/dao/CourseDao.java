package com.lms.dao;

import com.lms.config.HibernateUtil;
import com.lms.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CourseDao {

    private SessionFactory factory = HibernateUtil.getSessionFactory();

    public void saveCourse(Course course) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.persist(course);
        session.getTransaction().commit();
    }

    public List<Course> getAllCourses() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Course> courses = session.createQuery("from Course", Course.class).getResultList();
        session.getTransaction().commit();
        return courses;
    }

    public Course getCourseById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        session.getTransaction().commit();
        return course;
    }
}