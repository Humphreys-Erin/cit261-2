/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myfamily;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author woo13
 */
public class MyFamily {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        try {
            //50 is age of family member
            Family family = (Family)session.get(Family.class, 50);
            
            System.out.println("Family name = " + family.getFirstname());
            
            
        }
        
        catch(Exception e) {
          System.out.println(e.getMessage());
            
        }
        
        finally {
            session.close();
        }
    }
    
}
