package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		/*
		Transaction tx = s.beginTransaction();
		Employee emp = new Employee(115, "Bala", 15000);
		s.save(emp);
		tx.commit();
		*/
		Employee e=(Employee)s.get(Employee.class, 112);
		System.out.println("Id= "+e.getId()+",Name= "+e.getName()+"Salary: "+e.getSalary());
		s.close();
		sf.close();
		System.out.println("Id= "+e.getId()+",Name= "+e.getName()+"Salary: "+e.getSalary());
		System.out.println("*****DONE*****");
	}

}
