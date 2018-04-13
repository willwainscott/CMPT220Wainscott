import java.util.Scanner;

public class LinearEquationsTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for a, b, c, d, e, and f ");
		
		LinearEquation testEq = new LinearEquation(input.nextDouble(), input.nextDouble(),
				input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		if (!testEq.isSolvable()) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("x = " + testEq.getX() + " and y = " + testEq.getY());
		}
		
		
			
	}
}
