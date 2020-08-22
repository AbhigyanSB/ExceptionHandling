package sarmabaruaabhigyan_OOP_07;

//Customer class implementing the Comparable interface.
public class Customer implements Comparable<Customer> {
	
	//Declaring the four private variables for the ID, age, name and phone number, along with the static variable count.
	private int id;
	private int age;
	private String name;
	private int phone;
	private static int count = 0;			//Declaring a static variable for counting the IDs.
	
	//The constructor using the field.
	public Customer(int age, String name, int phoneNumber) {
		this.age = age;
		this.name = name;
		this.phone = phoneNumber;
		this.id = ++count;
	}
	
	//Getters and Setters against the private variables name, age and phone number.
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhoneNumber() {
		return phone;
	}
	
	@Override
	//The toString method to display the IDs, names, phone number and age of the customers.
	public String toString() {
		
		return this.id + " " + this.name + ", " + this.phone + ", " + this.age;
	
	}
	
	@Override
	//The compareTo method to compare two customers using their ages.
	public int compareTo(Customer C) {
		
		if (this.age > C.age) {
			return this.age;
		}
		return -1;
		
	}
	
}
