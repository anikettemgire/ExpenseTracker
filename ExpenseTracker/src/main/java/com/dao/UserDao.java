package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.Hiber;
import com.entity.User;

public class UserDao {
	private static SessionFactory sf=null;
	private static Session s=null;

	
	public static boolean Save(User u) {
		
		
		Transaction tr=null;
		boolean f=false;
		try {
			sf=Hiber.getSession();
			s=sf.openSession();
			tr=s.beginTransaction();
			s.save(u);
			f=true;
			tr.commit();
			s.close();
			
		}catch(Exception e)
		{
			if(tr!=null) {
				e.printStackTrace();
				f=false;
			}
		}
		
		return f;
		}
	
		@SuppressWarnings({ "deprecation", "rawtypes" })
		public static User findUser(String emil,String pass) {
			SessionFactory sf=Hiber.getSession();
			s=sf.openSession();
			Query q=s.createQuery("from User where email=:x and pass=:y");
			q.setParameter("x", emil);
			q.setParameter("y", pass);
			User u=(User)q.uniqueResult();
			s.close();
			return u;
		}
}
