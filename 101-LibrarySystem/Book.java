/*
 * @author ColeKeffel
 */
public class Book {
	private String title;
	private String publisher;
	private int publishYear;
	
	public Book(String title, String publisher, int publishYear) {
		this.title = title;
		this.publisher = publisher;
		this.publishYear = publishYear;
		
	}
	
	public String title() {
		return this.title;
	}
	
	public String publisher() {
		return this.publisher;
	}
	
	public int year() {
		return this.publishYear;
	}
	
	public String toString() {
		return this.title + ", " + this.publisher + ", " + this.publishYear;
	}
	
 }
