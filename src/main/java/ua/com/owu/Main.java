package ua.com.owu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        UserDAO userDAO = new UserDAO();
        List<Product> products = new ArrayList<>();

            User petro = new User("Petro" , 12);
            User sanya = new User("Sanya" , 14);
            Product potato = new Product("potato");
            Product orange = new Product("orange");
            Product tomat =  new Product("Tomat");
            products.add(potato);
            products.add(orange);
            products.add(tomat);
            petro.setProductList(products);
            sanya.setProductList(products);
            potato.setUser(petro);
            orange.setUser(sanya);
            tomat.setUser(petro);
            userDAO.save(petro);
            userDAO.save(sanya);
            productDAO.save(potato);
            productDAO.save(orange);
            productDAO.save(tomat);





    }
}
