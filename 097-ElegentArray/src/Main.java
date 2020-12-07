/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		int[] array = {5, 1, 3, 4, 2};
		printElegently(array);
		
	}
	
	public static void printElegently(int[] array) {
		for(int i = 0; i < array.length; i++) {
			
			
			//Prints out array separated by a comma until array.length is reached
			if(i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");

			}
		}
	}

}
