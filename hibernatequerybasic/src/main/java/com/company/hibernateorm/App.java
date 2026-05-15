package com.company.hibernateorm;

import com.company.hibernateorm.config.HibernateUtil;
import com.company.hibernateorm.dao.ProductDao;
import com.company.hibernateorm.entity.Category;
import com.company.hibernateorm.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class App
{
    public static void main( String[] args )
    {
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {

            Transaction tx = session.beginTransaction();

//            Category category1 = new Category("Electronics");
//            Category category2 = new Category("Stationary");
//            Category category3 = new Category("PoojaItems");
//
//            session.save(category1);
//            session.save(category2);
//            session.save(category3);
//
//            session.save(new Product("Laptop",50000 ,category1 ));
//            session.save(new Product("Tablet",50000 ,category1 ));
//            session.save(new Product("Mouse",50000 ,category1 ));
//
//            session.save(new Product("Book",150 ,category2 ));
//            session.save(new Product("Pencil",10 ,category2 ));
//            session.save(new Product("Pen",150 ,category2 ));

            ProductDao dao = new ProductDao();

            /* Part-1 */

            //            System.out.println("1. To list out all the products");
            //            //System.out.println(dao.getAllProducts());
            //          //  dao.getAllProducts().forEach(System.out::println);
            //            dao.getAllProducts().forEach(p->System.out.println(p.getName()));
            //
            //            System.out.println("1. To list out all the products based on Price");
            //            //System.out.println(dao.getByPrice(50000));
            //            dao.getByPrice(50000).forEach(System.out::println);
            //
            //
            //            System.out.println("1. To list out all the products based on SearchByKeyword");
            //           // System.out.println(dao.searchByKeyword("Lap"));
            //            dao.searchByKeyword("Lap").forEach(System.out::println);
            //            tx.commit();
            //

            /* Part-2 */

//                System.out.println("Output Criteria Based Queries ");
//                System.out.println("To display all products ");
//                dao.findAll().forEach(System.out::println);
//
//                System.out.println("To display all products based on Price");
//                dao.findByPrice(50000).forEach(System.out::println);
//
//                System.out.println("To display all products based on Price Range(Min & Max)");
//                dao.getBetweenPrice(50 ,50000).forEach(System.out::println);


            /* Part-3 */

            System.out.println("Native SQL Based Queries ");
            System.out.println("To display all products by Object");
            dao.findAll().forEach(p -> System.out.println(p[0] + " " + p[1]));

            System.out.println("To display products by an entity class (Generic type) ");
            dao.getAll().forEach(System.out::println);

            System.out.println("To display all products by id");
            dao.getById(2).forEach(System.out::println);

        }
    }
}
