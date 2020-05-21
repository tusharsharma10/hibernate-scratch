package com.ts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ts.entity.Address;
import com.ts.entity.Employee;
import com.ts.hibConfig.HibernateUtil;

public class App {
	
	
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try{
			txn.begin();
			
			Address a = new Address("Jaipur", "Shashtri nagar", "India", 302909, 98);
			
			Employee u1 = new Employee("Jhanwar", a);
			session.persist(u1);
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
