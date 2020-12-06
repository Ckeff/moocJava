/*
 * @author ColeKeffel
 */

public class Person {
	private String name;
	private String phoneNumber;
	
	public Person(String name) {
		this(name, "");
	}
	
	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public String getNumber() {
		return this.phoneNumber;
		
	}
	
	public void changeNumber(String newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	
	public String toString() {
		return this.name + " - number: " + this.phoneNumber;
	}
}
