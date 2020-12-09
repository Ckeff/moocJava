/*
 * @author ColeKeffel
 */
public class NightSky {
	private double density;
	private int width, height;
	private int amtStars;
	
	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
	}
	
	public NightSky(int width, int height) {
		this.density = 0.1;
		this.width = width;
		this.height = height;
		
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
	}
	
	public void printLine() {
		String star = "";
		for(int i = 0; i < this.width; i ++) {
			if(Math.random() > 1.0 - this.density) {
				star += "*";
				this.amtStars++;
			} else {
				star += " ";
			}
		}
		System.out.println(star);
	}
	
	public void print() {
		for (int i = 0; i < this.height; i++){
            this.printLine();
        }
	}
	
	public int starsInLastPrint() {
		int amtStars = this.amtStars;
		return amtStars;
	}
}
