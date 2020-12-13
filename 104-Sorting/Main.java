import java.util.Arrays;

/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		int[] values = {-1, 6, 9, 8, 12};
		
		System.out.println(smallest(values));
		System.out.println(indexOfSmallest(values));
		System.out.println(indexOfSmallestStartingFrom(values, 2));
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
	
	public static int indexOfSmallest(int[] array) {
		int smallestIndex = 0;
		int smallest = array[0];
		for(int i = 0; i < array.length; i++) {
			if(smallest > array[i]) {
				smallest = array[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	
	public static int indexOfSmallestStartingFrom(int[] array, int index) {
		int smallestIndex = index;
		int smallest = array[index];
		
		for(int i = index; i < array.length; i++) {
			if(smallest > array[i]) {
				smallest = array[i];
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}
}
