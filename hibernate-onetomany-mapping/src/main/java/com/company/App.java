package com.company;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.company.model.Course;
import com.company.model.ReportCard;
import com.company.model.Student;
import com.company.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // to obtain/get the session from sessionfactory (It can be multiple session based on multiple services or work)
        Session session = HibernateUtil.getSessionFactory().openSession();

        // To create a  transaction ( Transient + Persistent) -- Transient when you do not to reflect and save in backend  but persistent to save into a backend

        Transaction tx = session.beginTransaction();


        Student s1 = new Student("Niti");
        s1.addCourse(new Course("Java"));
        s1.addCourse(new Course("PD"));

        ReportCard rc1 = new ReportCard(450);
        s1.setReportcard(rc1);


        Student s2 = new Student("Rahul");
        s2.addCourse(new Course("Spring"));
        s2.addCourse(new Course("Hibernate"));

        ReportCard rc2 = new ReportCard(500);
        s2.setReportcard(rc2);


        Student s3 = new Student("Amit");
        s3.addCourse(new Course("React"));
        s3.addCourse(new Course("JS"));

        ReportCard rc3 = new ReportCard(420);
        s3.setReportcard(rc3);

//  Persist all (cascade will handle children)
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);

        tx.commit();

        session.close();

        Session getSession = HibernateUtil.getSessionFactory().openSession();
        Student stud = getSession.get(Student.class,1);
        System.out.println("Student Details :" + stud.getName());
        stud.getCourses().forEach(c->System.out.println("Courses enrolled for : "+ c.getTitle()));



        getSession.close();

       /* for bidirectional
         Course c = session.get(Course.class,1L)
         // One course is enrolled by multiple students
         System.out.println("Course :" + c.getTitle() + " belongs to Student: " + c.getStudent().getName());
        */

    }
}

