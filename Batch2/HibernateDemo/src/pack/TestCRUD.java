package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Doing the update operation by passing at runtime");
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println("Enter an Id");
		int tempId = sc.nextInt();
		Employee e = (Employee)s.get(Employee.class, tempId);
		if(e!=null)
		{
			System.out.println("Enter the Name to update");
			String tempName = sc.next();
			e.setName(tempName);
			s.update(e);
			tx.commit();
		}
		else{
			System.err.println("Sorry Id "+tempId+" not found!");
		}
		s.close();
		sf.close();
		sc.close();
		
	}

}
