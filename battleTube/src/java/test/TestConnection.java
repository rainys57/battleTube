/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author yagmur
 */
public class TestConnection {
    static SessionFactory factory;
    static{
        try{
                factory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
                System.err.println("Failed to create sessionFactory object." + ex);
                throw new ExceptionInInitializerError(ex);
        }
    }
    public static void main(String arc[]){
        Session session = factory.openSession(); 
	Transaction tx = null;
        User user = null;
        try{
                tx = session.beginTransaction();
                user = (User)session.get(User.class, 1);
                System.out.println("User: " + user.getUsername());
                tx.commit();
        }catch(NullPointerException e){System.out.println("nullpointer");}
        catch (HibernateException e) {
                if (tx!=null) tx.rollback();
                e.printStackTrace();
        }finally {
                session.close();
        }

    }
}
