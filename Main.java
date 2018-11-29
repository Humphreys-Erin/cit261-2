/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myhibernatetest;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author woo13
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        try {
            // 123 = id of customer
            Customer customer = (Customer)session.get(Customer.class, 123);
            
            System.out.println("Customer name = " + customer.getLastname());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            session.close();
        }
    }
    
}
