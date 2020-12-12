/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		
		System.out.println(smallest(values));
	}
	
	public static int smallest(int[] array) {
		//smallest == 6
		int smallest = array[0];
		
		for(int i = 0; i < array.length; i++) {
			//if (6 > 5) - loops through array
			if(smallest > array[i]) {
				//smallest == 5
				smallest = array[i];
			}
		}
		return smallest;
	}
}
