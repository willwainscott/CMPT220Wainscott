import java.util.Scanner;

public class DigitSum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to see the sum of its digits: ");
		System.out.print("The sum of the digits is: " + sumDigits(input.nextLong()));
	}
	
	public static int sumDigits(long n) {
		if (n/10 == 0) {
			return (int) n;
		} else {
			return (int) (n % 10 + sumDigits(n/10));
		}
	}

}
