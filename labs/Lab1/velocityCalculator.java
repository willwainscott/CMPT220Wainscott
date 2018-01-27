import java.util.Scanner;

public class velocityCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acell = Math.abs((v0 - v1)/t);
		
		System.out.print("The average acelleration is: " + acell);
		
	}
}
