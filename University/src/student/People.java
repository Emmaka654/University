package student;

public class People {
	
	private String name;
	private String surname;
	private int age;
	private Address address;
	
	public People(String name, String surname, int age, Address address) {
		this.name = name;
		this.surname =  surname;
		this.age = age;
		this.address = address;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setSurname (String surname) {
		this.surname = surname;
	}
	
	public String getSurname () {
		return this.surname;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public int getAge () {
		return this.age;
	}
	
	public void setAddress (Address adress) {
		this.address = address;
	}

	public Address getAddress () {
		return this.address;
	}
	
	public String toString () {
		return this.name + " " + this.surname + " " + this.age + " " + this.address;
	}

}
