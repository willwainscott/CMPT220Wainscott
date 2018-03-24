import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to find the factors: ");
		int number = input.nextInt();
		StackOfIntegers test = new StackOfIntegers();
		
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				test.push(i);
				number = number / i;
				i = 1;
			}
		}
		
		while (!test.empty()) {
			System.out.print(test.pop() + " ");
		}
	}
}
	
