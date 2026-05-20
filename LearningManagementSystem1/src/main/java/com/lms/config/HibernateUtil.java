package com.lms.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.lms.entity.Student;
import com.lms.entity.Course;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class) // Explicitly add this
                    .addAnnotatedClass(Course.class)  // Explicitly add this
                    .buildSessionFactory();
        } catch (Exception ex) {
            // Log the exception to help with debugging
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}