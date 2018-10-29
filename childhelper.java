package children;

import org.hibernate.Session;

/**
 *
 * @author woo13
 */
public class ChildHelper {
    
    Session session = null;

    public ChildHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}
