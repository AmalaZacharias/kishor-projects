package com.org;

import java.util.List;

public class EmployeeService {
	private EmployeeDAO dao = null;
	public EmployeeService(){
		dao = new EmployeeDAO();
	}
	
	public int insert(int id,String name,double salary){
		Employee emp=new Employee(id, name, salary);
		int status = dao.store(emp);
		return status;
	}
	public int insertObject(Employee emp) {
		int status = dao.store(emp);
		return status;
	}
	

	
	/*public List displayAll() {
		List list = dao.retrieveAll();
		//sort logic
		return list;
	}*/
	
	public Employee updateSalary(int id, double salary) {
		return dao.update(id, salary);
	}

}
