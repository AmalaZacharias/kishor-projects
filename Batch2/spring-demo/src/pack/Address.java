package pack;

import org.springframework.stereotype.Component;


@Component
public class Address {

	public Address() {
		super();
		System.out.println("Address() is created");
	}
	public void display(){
		System.out.println("Address is displayed");
	}
	

}
