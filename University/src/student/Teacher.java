package student;

public class Teacher extends People {
	
	private int salary; 
	
	public Teacher(String name, String surname, int age, Address address, int salary) {
		super(name, surname, age, address);
		this.salary = salary;
	}
	
	public void setSalary (int salary) {
		this.salary = salary;
	}
	
	public int getSalary () {
		return this.salary;
	}
	
	public int monthlySalary (int count) {
		return salary + count;
	}
	
	public String toString () {
		return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getAddress() + this.salary;
	}
}
