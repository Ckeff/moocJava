/*
 * @author ColeKeffel
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
	private ArrayList<Integer> result = new ArrayList<Integer>();
	private ArrayList<Integer> grade = new ArrayList<Integer>();
	private int accepted;

	public Exam(Scanner reader) {
		System.out.println("Type exam scores, -1 completes:\n");

		while (true) {
			int result = Integer.parseInt(reader.nextLine());

			if (result == -1) {
				break;
			} else if (result >= 0 && result <= 60) {
				this.result.add(result);
			} else {
				continue;
			}
		}

	}

	public int grade(int result) {
		if (result >= 0 && result <= 9) {
			return 0;

		} else if (result >= 10 && result <= 19) {
			this.accepted++;
			return 1;

		} else if (result >= 20 && result <= 29) {
			this.accepted++;
			return 2;
		} else if (result >= 30 && result <= 39) {
			this.accepted++;
			return 3;
		} else if (result >= 40 && result <= 49) {
			this.accepted++;
			return 4;
		} else if (result >= 50 && result <= 60) {
			this.accepted++;
			return 5;
		} else {
			return -1;
		}
	}
	
	public ArrayList<Integer> calcGrades(){
		for(int results : result) {
			grade.add(grade(results));
		}
		
		return grade;
	}

	public void printGrade() {
		System.out.println("Grade Distribution: \n");

		String zero = "0: ";
		String one = "1: ";
		String two = "2: ";
		String three = "3: ";
		String four = "4: ";
		String five = "5: ";

		for (int grades : grade) {
			switch (grades) {
			case 0:
				zero += "*";
				break;
			case 1:
				one += "*";
				break;
			case 2:
				two += "*";
				break;
			case 3:
				three += "*";
				break;
			case 4:
				four += "*";
				break;
			case 5:
				five += "*";
			}
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
	}
	
	public void accepted() {
		double acceptance = 100 * this.accepted / this.result.size();
		System.out.println("Acceptance percentage: " + acceptance + "%");
	}
}
