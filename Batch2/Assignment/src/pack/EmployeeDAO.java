package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	private Employee e;
	
	public void insert(Employee e) {
		template.update("insert into Employee values(?,?,?,?)",new Object[] {e.getId(),e.getName(), e.getSalary(),e.getDesignation()});
	}
	
	public void delete(int id){
		template.update("delete from Employee where id= ?",new Object[]{id});
	}
	
	public void updateName(int id, String name){
		template.update("update employee set name = ? where id = ?",new Object[]{name,id});
	}
	
	public void updateSalary(int id,double salary){
		template.update("update employee set salary = ? where id = ?",new Object[]{salary,id});
	}
	
	public void updateDesignation(int id,String designation){
		template.update("update employee set designation = ? where id = ?",new Object[]{e.getDesignation(),id});
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = template.query("select * from employee", new EmployeeRowMapper());
		return list;
	}

	
}
