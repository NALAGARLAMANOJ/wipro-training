package com.lms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lms.config.HibernateUtil;
import com.lms.entity.Course;

public class CourseDao {

    public void saveCourse(Course course) {

        Session session =
                HibernateUtil
                        .getSessionFactory()
                        .openSession();

        Transaction tx =
                session.beginTransaction();

        session.save(course);

        tx.commit();

        session.close();
    }


    public List<Course> getAllCourses() {

        Session session =
                HibernateUtil
                        .getSessionFactory()
                        .openSession();

        List<Course> courses =
                session.createQuery(
                        "from Course",
                        Course.class
                ).list();

        session.close();

        return courses;
    }


    public Course getCourseById(int id) {

        Session session =
                HibernateUtil
                        .getSessionFactory()
                        .openSession();

        Course course =
                session.get(Course.class, id);

        session.close();

        return course;
    }

}