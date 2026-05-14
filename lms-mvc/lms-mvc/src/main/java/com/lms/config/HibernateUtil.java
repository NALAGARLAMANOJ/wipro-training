package com.lms.config;





import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {

        try {

            System.out.println("Hibernate initialization started...");

            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

            System.out.println("Hibernate initialized successfully");

        } catch (Throwable e) {

            System.out.println("REAL ERROR IS BELOW:");

            e.printStackTrace();

            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}