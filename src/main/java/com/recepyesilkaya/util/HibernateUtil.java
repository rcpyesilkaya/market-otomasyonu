package com.recepyesilkaya.util;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory ==null) {
            try {
                Configuration configuration = new Configuration();
                configuration.configure(new File("src/main/resources/hibernate.cfg.xml"));
                sessionFactory = configuration.buildSessionFactory();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;

    }
}