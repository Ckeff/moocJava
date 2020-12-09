/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		NightSky sky = new NightSky(0.1 , 8, 4);
		sky.print();
		System.out.println("Number of stars: " + sky.starsInLastPrint() + "\n\n");
		
		sky.print();
		System.out.println("Number of stars: " + sky.starsInLastPrint());
	}

}
