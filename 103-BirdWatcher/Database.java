/*
 * @author ColeKeffel
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	private ArrayList<Bird> birdData = new ArrayList<Bird>();
	
	public Database(Scanner reader) {
		while(true) {
			System.out.print("? ");
			String str = reader.nextLine();
			str = str.toLowerCase().trim();
			
			switch(str) {
			case "add":
				this.add(reader);
				break;
			case "observation":
				this.observation(reader);
				break;
			case "statistics":
				this.statistic(reader);
				break;
			case "show":
				this.show(reader);
				break;
			}
		} 
		
	}
	
	public void add(Scanner reader) {
		System.out.print("Name: ");
		String specie = reader.nextLine();
		
		System.out.print("Latin name: ");
		String latinName = reader.nextLine();
		
		Bird bird = new Bird(specie, latinName);
		
		this.birdData.add(bird);
	}
	
	public void observation(Scanner reader) {
		System.out.print("What was observed? ");
		String observation = reader.nextLine();
		
		for(Bird bird : this.birdData) {
			if(bird.getName().contains(observation)) {
				bird.observed();
			} else {
				System.out.print("Is not a bird!");
			}
		}
	}
	
	public void statistic(Scanner reader) {
		for(Bird bird : this.birdData) {
			bird.print();
		}
	}
	
	public void show(Scanner reader) {
		System.out.print("What? ");
		String item = reader.nextLine();
		
		for(Bird bird : this.birdData) {
			if(bird.getName().contains(item)) {
				bird.print();
			}
		}
	}
	
}
