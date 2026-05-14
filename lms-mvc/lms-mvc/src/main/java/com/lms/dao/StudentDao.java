package com.lms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lms.config.HibernateUtil;
import com.lms.entity.Student;

public class StudentDao {

    // SAVE OR UPDATE STUDENT
    public void saveStudent(Student student) {

        Transaction tx = null;

        try (
                Session session = HibernateUtil
                        .getSessionFactory()
                        .openSession()
        ) {

            tx = session.beginTransaction();

            // FIX:
            // merge() handles both new and detached entities
            session.merge(student);

            tx.commit();

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();
        }
    }


    // GET ALL STUDENTS
    public List<Student> getAllStudents() {

        try (
                Session session = HibernateUtil
                        .getSessionFactory()
                        .openSession()
        ) {

            return session.createQuery(
                    "from Student",
                    Student.class
            ).list();
        }
    }


    // GET STUDENT BY ID
    public Student getStudentById(int id) {

        try (
                Session session = HibernateUtil
                        .getSessionFactory()
                        .openSession()
        ) {

            return session.get(Student.class, id);
        }
    }


    // DELETE STUDENT
    public void deleteStudent(int id) {

        Transaction tx = null;

        try (
                Session session = HibernateUtil
                        .getSessionFactory()
                        .openSession()
        ) {

            tx = session.beginTransaction();

            Student student =
                    session.get(Student.class, id);

            if (student != null) {
                session.remove(student);
            }

            tx.commit();

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();
        }
    }


    // UPDATE STUDENT
    public void updateStudent(Student student) {

        Transaction tx = null;

        try (
                Session session = HibernateUtil
                        .getSessionFactory()
                        .openSession()
        ) {

            tx = session.beginTransaction();

            session.merge(student);

            tx.commit();

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();
        }
    }
}