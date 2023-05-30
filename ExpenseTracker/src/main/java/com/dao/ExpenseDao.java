package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.Hiber;
import com.entity.ExpenseDeatil;
import com.entity.User;

public class ExpenseDao {
	
	private static SessionFactory sf=null;
	private static Session s=null;
	private static Transaction tr=null;
	public static boolean save( ExpenseDeatil es) {
	
		boolean f=false;
		try {
			 sf=Hiber.getSession();
			  s=sf.openSession();
			  tr=s.beginTransaction();
			  s.save(es);
			  f=true;
			  tr.commit();
			  s.close();
			 
			
		}catch(Exception e) {
			if(tr!=null) {
				f=false;
				e.printStackTrace();
			}
		}
		return f;
	}
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static List<ExpenseDeatil> getDeatil(User u) {
		
		List<ExpenseDeatil> l = new ArrayList<ExpenseDeatil>();
		try {
		sf=Hiber.getSession();
		s=sf.openSession();
		   Query q= s.createQuery("from ExpenseDeatil where u=:x");
		            q.setParameter("x", u);
		               l= q.list();
		
		
		s.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return l;
		
	}
	public static boolean deleteExpense(int id) {
		sf=Hiber.getSession();
		int i=0;
		boolean f=false;
		try {
		s=sf.openSession();
		tr=s.beginTransaction();
		      ExpenseDeatil e=s.get(ExpenseDeatil.class, id);
		    
	           s.delete(e);
	          
	           tr.commit();
	           f=true;
		s.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	@SuppressWarnings("deprecation")
	public static ExpenseDeatil getExpenseDeatil(int id) {
		ExpenseDeatil se=null;
		try {
		sf=Hiber.getSession();
		s=sf.openSession();
		   @SuppressWarnings("rawtypes")
		Query q=s.createQuery("from ExpenseDeatil where eid=:id");
		   q.setParameter("id", id);
		           se=(ExpenseDeatil) q.uniqueResult();
		s.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return se;
	}
	public static boolean updateExpense(ExpenseDeatil eu) {
		boolean b=false;
		try {
		
			sf=Hiber.getSession();
			s=sf.openSession();
			tr=s.beginTransaction();
			System.out.println();
			s.saveOrUpdate(eu);
			
			
			tr.commit();
			b=true;
			s.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	 
		return b;
		
	}
	
	

}
