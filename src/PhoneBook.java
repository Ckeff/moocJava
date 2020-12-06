/*
 * @author ColeKeffel
 */

import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<Person> phoneBook = new ArrayList<Person>();
	
	public PhoneBook() {
		
	}
	
	public void add(String name, String number) {
		Person person = new Person(name, number);
		this.phoneBook.add(person);
		
	}
	
	public void printAll() {
		for(Person person : this.phoneBook) {
			System.out.println(person);
		}
		
	}
	
	public String searchNumber(String name) {
		for(Person person : this.phoneBook) {
			if(person.getName() == name) {
				return person.getNumber();
			}
		}
		return "Number not known";
	}
}
