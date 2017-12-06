package database;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class passerelle {
	public static Session session = null;
    private static SessionFactory sessionFactory = null;
    private static final String CONF_FILE = "database/Candidat.cfg.xml";
    
    //Configuration

    static {
        try {
            Configuration configuration = new Configuration()
                    .configure(CONF_FILE);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException ex) {
            throw new RuntimeException("Problème de Configuration : "
                    + ex.getMessage(), ex);
        }
    }

    //OUVRE UN NOUVEL OBJET SESSION
    public static void open() {
        session = sessionFactory.openSession();
    }
    
    
    // FERME L'OBJET SESSION
    public static void close() {
        session.close();
    }
    
    
    //MODIFICATION
    public static void update(Object o){
    	Transaction tx = session.beginTransaction();
        session.update(o);
        tx.commit();
    }
    
    //RAFRAICHIR
    public static void refresh(Object o){
        session.refresh(o);
    }
    
    //SUPPRESSION
    public static void delete(Object o) {
        Transaction tx = session.beginTransaction();
        session.delete(o);
        tx.commit();
    }
    
    //SAUVEGARDER
    public static void save(Object o) {
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
    }    
}
