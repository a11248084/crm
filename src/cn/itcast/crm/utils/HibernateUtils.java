package cn.itcast.crm.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate 操作工具类
 * 
 */
public class HibernateUtils {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;

	static {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public static Session openSession() {
		return sessionFactory.openSession();
	}

	public static void main(String[] args) {
	}
}
