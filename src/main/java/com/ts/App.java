package com.ts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ts.entity.Message;
import com.ts.hibConfig.HibernateUtil;

public class App {
	
	
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try{
			txn.begin();
			
			Message m1 = new Message("Hello Folks!");
			session.save(m1);
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
