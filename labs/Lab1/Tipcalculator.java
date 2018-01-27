import java.util.Scanner;

public class Tipcalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and the gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double tip = subtotal * (rate * .01);
		double total = subtotal + tip;
		
		System.out.println("The graduity is $" + tip + "and the total is $" + total);
		
	}
}
