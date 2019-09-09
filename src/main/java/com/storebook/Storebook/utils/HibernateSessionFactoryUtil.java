/*
package com.storebook.Storebook.utils;

import com.storebook.Storebook.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(Media.class);
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(Author.class);
                configuration.addAnnotatedClass(PaymentMethod.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.err.println("Exception!" + e);
            }
        }
        return sessionFactory;
    }
}
*/
