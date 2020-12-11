/*
 * @author ColeKeffel
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Exam exam = new Exam(reader);
		exam.calcGrades();
		exam.printGrade();
		exam.accepted();
	}
	
}
