/*
 * @author ColeKeffel
 */

public class Main {

	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 4, 2 };
		printArrayAsStars(array);

	}

	public static void printArrayAsStars(int[] array) {
		for (int i = 0; i < array.length; i++) {
			String star = "";

			for (int j = 0; j < array[i]; j++) {
				star += "*";
			}
			System.out.println(star);

		}
	}

}