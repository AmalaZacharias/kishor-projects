package cts.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory getSessionFactory(){
		SessionFactory sf = null;
		
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
		return sf;
	}

}
