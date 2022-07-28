package student;

public class Address {
	
	private String city;
	private String street;
	private int house;
	private int flat;

	public Address(String city,String street, int house, int flat) {
		this.city = city;
		this.street = street;
		this.house = house;
		this.flat = flat;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
	
	public String getCity () {
		return this.city;
	}
	
	public void setStreet (String street) {
		this.street = street;
	}
	
	public String getStreet () {
		return this.street;
	}
	
	public void setHouse (int house) {
		this.house = house;
	}
	
	public int getHouse () {
		return this.house;
	}
	
	public void setFlat (int flat) {
		this.flat = flat;
	}
	
	public int getFlat () {
		return this.flat;
	}
	
	public String toString () {
		return this.city + " " + this.street + " " + this.house + " " + this.flat;
	}
}
