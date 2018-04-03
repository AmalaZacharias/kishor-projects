package pack;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name = "ObjType")
@DiscriminatorValue(value ="p")
public class Person {
	@Id
	private int uid;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
