package pack;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee emp = (Employee)context.getBean("employeeObject");
		Scanner sc = new Scanner(System.in);
		int input;
		String x;
		
		do{
			System.out.println("*********Employee Management System*********");
			System.out.println("1) Add  2)Delete by Id  3)DisplayAll  4)Update by Id  5)Exit");
			System.out.println("Input:");
		    input = sc.nextInt();
			
			switch(input)
			{
			case 1:
				System.out.println("****Performing Insert****");
				System.out.println("Enter Id");
				emp.setId(sc.nextInt());
				System.out.println("Enter Name");
				emp.setName(sc.next());
				System.out.println("Enter Salary");
				emp.setSalary(sc.nextDouble());
				System.out.println("Enter Designation");
				emp.setDesignation(sc.next());
				service.insert(emp);
				System.out.println("*********Employee information stored successfully**********");
				break;
			case 2:
				System.out.println("****Performing Deletion****");
				System.out.println("Enter the Id");
				int n = sc.nextInt();
				service.delete(n);
				System.out.println("Employee deleted successfully");
				break;
			case 3:
				System.out.println("*****Displaying all the Employees******");
				List<Employee> employeeList = service.getEmployees();
				for(Employee e : employeeList) {
					System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
				}
				break;
			case 4:
				
				do{
					System.out.println("*****A sub menu to update the following*****");
					System.out.println("a)Name  b)Salary  c)Designation  d)Exit");
				    x = sc.next();
				
				
				switch(x){
				
				case "a":
					System.out.println("Enter the Id");
					int m = sc.nextInt();
					String a = sc.next();
					service.updateName(m,a);
					break;
					
					
				case "b":
					System.out.println("Enter the Id");
					int l = sc.nextInt();
					double z = sc.nextDouble();
					service.updateSalary(l,z);
					break;
				
				case "c":
					System.out.println("Enter the Id");
					int y = sc.nextInt();
					String r = sc.next();
					service.updateDesignation(y,r);
					break;
					
				case "d":
					System.out.println("sub menu exits");
					System.exit(0);
				}
				
				}while(x!="d");
				
			case 5:
				System.out.println("****Main menu exits****");
				System.exit(0);
			}
			
		}while(input!=5);
		
		System.out.println("*****Thank you for visiting****");

	}

}
