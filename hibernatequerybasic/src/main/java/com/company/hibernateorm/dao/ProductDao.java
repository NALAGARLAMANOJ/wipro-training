package com.company.hibernateorm.dao;


import com.company.hibernateorm.config.HibernateUtil;
import com.company.hibernateorm.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;

public class ProductDao {

    /*hql query based */

   /* public List<Product> getAllProducts() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            // Here you need not to give a table name because HQL runs on Entity class object
            //HQL Query Example
            String hql = "from  Product";
            return (session.createQuery(hql, Product.class).list());

        }
    }

    public List<Product> getByPrice(double price) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){

            // Here you need not to give a table name because HQL runs on Entity class object
            //HQL Query Example
            String hql = "from  Product p where p.price=:price";
            return (session.createQuery(hql, Product.class)
                    .setParameter("price", price)
                    .list());
        }
    }

    public List<Product> searchByKeyword(String Keyword) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("From Product p where p.name like:key", Product.class)
                    .setParameter("key", "%" + Keyword + "%")
                    .list();
        }
    }
    public List<Product> getByCondition(int condition){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("From Product p where p.id>:condition", ProductDao.class)
                    .setParameter("condition",condition)
                    .list());
        }
    }
*/


    /*criteria based */
    /*
    public List<Product> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);

        cq.from(Product.class);
        return session.createQuery(cq).getResultList();
    }

    public List<Product> findByPrice(double price) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> root = cq.from(Product.class);

        cq.where(cb.equal(root.get("price"), price));

        return session.createQuery(cq).getResultList();
    }


    public List<Product> getBetweenPrice(double minPrice, double maxPrice) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> root = cq.from(Product.class);

        cq.where(cb.greaterThan(root.get("price"), minPrice));
        cq.where(cb.lessThan(root.get("price"), maxPrice));
        cq.where(cb.between(root.get("price"), minPrice, maxPrice));

        return session.createQuery(cq).getResultList();

   }

     */

    /* native query based */

    // Scalar query
    public List<Object[]> findAll() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String sql = "select * from products";

            return session.createNativeQuery(sql).list();
        }
    }

    // Entity Based Queries
    public List<Product> getAll() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String sql = "select * from products";

            return session.createNativeQuery(sql, Product.class).list();
        }
    }
    //Parameterized Query

    public List<Product> getById(int id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String sql = "select * from products where id = :id";

            return session.createNativeQuery(sql, Product.class)
                    .setParameter("id", id)
                    .list();
        }

    }




}
