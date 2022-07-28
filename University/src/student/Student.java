package student;

public class Student extends People{

	
	public Student(String name, String surname, int age, Address address) {
		super(name, surname, age, address);
	}

	public String toString () {
		return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getAddress();
	}
}
