/*
 * @author ColeKeffel
 */
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> lib = new ArrayList<Book>();
	
	public Library() {
		
	}
	
	public void addBook(Book newBook) {
		this.lib.add(newBook);
	}
	
	public void printBooks() {
		for(Book book : this.lib) {
			System.out.println(book);
		}
	}
	
	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> found = new ArrayList<Book>();
		
		for(Book book : this.lib) {
			if(StringUtils.included(book.title(), title)) {
				found.add(book);
			}
		}
		
		return found;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> found = new ArrayList<Book>();
		
		for(Book book : this.lib) {
			if(StringUtils.included(book.publisher(), publisher)) {
				found.add(book);
			}
		}
		
		return found;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();
		
		for(Book book : this.lib) {
			if(book.year() == year) {
				found.add(book);
			}
		}
		return found;
	}

}
