package ua.com.owu;

import ua.com.owu.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;


public class UserDAO {
    private SessionFactory sessionFactory;


    public UserDAO() {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Product.class).buildSessionFactory();
    }

    public void save(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    public void update(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
    }
public  void delete(User user)
{
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.delete(user);
    session.getTransaction().commit();
    session.close();
}



}
