package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDiscriminating {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Criteria crt = s.createCriteria(Person.class);
		@SuppressWarnings("rawtypes")
		List list = crt.list();
		@SuppressWarnings("rawtypes")
		Iterator it = list.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			if(p instanceof Customer){
				Customer c=(Customer)p; 
				System.out.println("Id: "+c.getUid()+" BankName: "+c.getBankName()+" Name: "+c.getName());
			}
			else if(p instanceof Student){
				Student s1 = (Student)p;
				System.out.println("Id: "+s1.getUid()+" Name: "+s1.getName()+" Grades: "+s1.getGrades());
			}
			else
			{
				System.out.println("Id: "+p.getUid()+" Name: "+p.getName());
			}
		}
		s.close();
		sf.close();

	}

}
