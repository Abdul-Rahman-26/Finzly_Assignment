package library_inventory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

    private Hibernate(){}
    private static final SessionFactory factory = sessionFactory();

    public static SessionFactory sessionFactory() {
        try{
            return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();
        }
        catch (Exception e){
            System.err.println("Error: "+e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return  factory;
    }

    public static void closeSessionFactory(){
        if(factory != null || !factory.isClosed()){
            factory.close();
        }
    }
}
