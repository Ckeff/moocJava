/*
 * @author ColeKeffel
 */
public class Main {

	public static void main(String[] args) {
		Money a = new Money(10, 0);
		Money b = new Money (5, 0);
		
		//Exercise 95.1 Plus
		Money c = a.plus(b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c + "\n\n");
		
		a = a.plus(c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c + "\n\n");
		
		//Exercise 95.2 Less
		Money aLess = new Money(10,0);
		Money bLess = new Money(3,0);
		Money cLess = new Money(5,0);
		
		System.out.println(aLess.less(bLess));
		System.out.println(bLess.less(cLess) + "\n\n");
		
		//Exercise 95.3 Minus
		Money aMin = new Money(10, 0);
		Money bMin = new Money(3, 50);
		
		Money cMin = aMin.minus(bMin);
		
		System.out.println(aMin);
		System.out.println(bMin);
		System.out.println(cMin);
	}

}
