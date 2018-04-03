package com.org;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {

		public int store(Employee emp){
			int status = 0;
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(emp);
			tx.commit();
			status = 1;
			s.close();
			sf.close();
			return status;
		}
		
		public List retrieveAll(){
			List list = null;
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			Criteria crt = s.createCriteria(Employee.class);
			list=crt.list();
			s.close();
			sf.close();
			return list;
		}
		public Employee update(int id, double salary) {
			Employee e = null;
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			e = (Employee) s.get(Employee.class, id);
			if(e != null) {
				e.setSalary(salary);
				s.update(e);
				tx.commit();
			}
			s.close();
			sf.close();
			return e;
		}

}
