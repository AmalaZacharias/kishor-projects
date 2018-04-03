package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

	@Autowired
private EmployeeDAO dao;
	
	public void insert(Employee e) {
		dao.insert(e);
	}
	
	public void delete(int id){
		dao.delete(id);
	}
	
	public void updateName(int id,String name){
		dao.updateName(id,name);
	}
	
	public void updateSalary(int id, double salary){
		dao.updateSalary(id,salary);
	}
	
	public void updateDesignation(int id,String designation){
		dao.updateDesignation(id,designation);
	}
	
	public List<Employee> getEmployees() {
		return dao.getAllEmployees();
	}

}

