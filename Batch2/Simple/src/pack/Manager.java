package pack;

public class Manager extends Employee {
	private int employeeCount;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int age, String name, int employeeCount) {
		super(age, name);
		this.employeeCount = employeeCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
