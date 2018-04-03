package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class TestHq {
		public static void main(String[] args) {
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			String hibernateQuery = "select e.id,e.name,e.salary from pack.Employee e";
			Query query = s.createQuery(hibernateQuery);
			List list = query.list();
			Iterator it = list.iterator();
			while(it.hasNext()){
				Object[] obj = (Object[])it.next();
				int id = (int)obj[0];
				String name = (String)obj[1];
				double salary = (double)obj[2];
				System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
			}
			s.close();
			sf.close();
		}

}
