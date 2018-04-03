package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		String hibernateQuery = "select obj from pack.Employee obj where obj.salary > 30000";
		Query query = s.createQuery(hibernateQuery);
		@SuppressWarnings("rawtypes")
		List list = query.list();
		@SuppressWarnings("rawtypes")
		Iterator it = list.iterator();
		while(it.hasNext()){
			Employee e = (Employee)it.next();
			System.out.println("Id: "+e.getId()+" Name: "+e.getName()+" Salary: "+e.getSalary());
		}
		String hibernateQuery1 = "select obj.name from pack.Employee obj where obj.salary between 30000 and 40000";
		Query query1 = s.createQuery(hibernateQuery1);
		@SuppressWarnings("rawtypes")
		List list1 = query1.list();                                       
		@SuppressWarnings("rawtypes")
		Iterator it1 = list1.iterator();
		while(it1.hasNext()){
			String empNames = (String)it1.next();
			System.out.println(empNames);
		}		
		s.close();
		sf.close();
	}
}
