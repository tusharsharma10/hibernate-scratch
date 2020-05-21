package com.ts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ts.entity.Student;
import com.ts.entity.Subject;
import com.ts.hibConfig.HibernateUtil;

public class App {
	
	
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try{
			txn.begin();
			
			Subject sub1 = session.get(Subject.class,5L);
			
			Student s1 = new Student("Djokovic", sub1);
			
			System.out.println(s1.getSubject());
			
			session.save(s1);
			
			
			
			txn.commit();
			
		}catch(Exception e){
			if(txn!=null)
				txn.rollback();
			e.printStackTrace();
		}
		finally{
			if(session!=null)
				session.close();
		}
	}
}
