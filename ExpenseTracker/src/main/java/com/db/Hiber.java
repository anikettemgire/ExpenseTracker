package com.db;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.ExpenseDeatil;
import com.entity.User;
import com.servlet.AddExpense;

public class Hiber {
	private static SessionFactory sf;
	public static SessionFactory getSession() {
		if(sf==null) {
			Configuration cf=new Configuration();
			Properties pp= new Properties();
			pp.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			pp.put(Environment.URL,"jdbc:mysql://localhost:3306/EXPENSE");
			pp.put(Environment.USER, "root");
			pp.put(Environment.PASS, "root");
			pp.put(Environment.HBM2DDL_AUTO, "update");
			pp.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			pp.put(Environment.SHOW_SQL, "true");
			cf.setProperties(pp);
			cf.addAnnotatedClass(User.class);
			cf.addAnnotatedClass(ExpenseDeatil.class);
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();	
		                   sf= cf.buildSessionFactory(sr);
		}
		return sf;
	}

}
