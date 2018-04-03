package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private Identifier id;
	
	@Autowired
	private Address address;
	
	public Customer() {
		super();
	}

	public Customer(Identifier id) {
		super();
		System.out.println("Constructor(Identifier) is called");
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		System.out.println("setId() is called");
		this.id = id;
	}
	
	public void getInformation(){
		id.display();
	}
}
