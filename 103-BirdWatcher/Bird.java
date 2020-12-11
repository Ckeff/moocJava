/*
 * @author ColeKeffel
 */

public class Bird {
	private String specie;
	private String latinName;
	private int numObserved;
	
	public Bird(String specie, String latinName) {
		this.numObserved = 0;
		this.specie = specie;
		this.latinName = latinName;
	}
	
	public String getName() {
		return this.specie;
	}
	
	public void setName(String specie) {
		this.specie = specie;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	public void observed(int numObserved) {
		this.numObserved++;
	}
	
	public int observed() {
		return this.numObserved;
	}
	
	public void print() {
		System.out.println(this.specie + "(" + this.latinName + "): " + this.numObserved + " observations");
	}
}
