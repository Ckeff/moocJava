/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		Person pekka = new Person("Pekka Mikkola", "040-123123");
		
		//Exercise 94.1 getting person simple info
		System.out.println(pekka.getName());
		System.out.println(pekka.getNumber() + "\n");
		
		System.out.println(pekka);
		pekka.changeNumber("123-456-7890");
		System.out.println(pekka);
		
		PhoneBook book = new PhoneBook();
		
		// Exercise 94.2 adding persons to book
		book.add("Cole Keffel", "724-797-1234");
		book.add("Brian Brooke", "111-222-3333");
		book.add("Brett Brooks", "999-888-7777");
		
		
		//Exercise 94.3 searching for numbers from the phonebook
		String num = book.searchNumber("Martti Tienari");
		
		System.out.println(num);
	}

}
