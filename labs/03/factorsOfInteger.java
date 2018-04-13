import java.util.Scanner;

public class factorsOfInteger {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to find the factors: ");
		int number = input.nextInt();
		
		while (number % 2 == 0) {
			System.out.print("2 ");
			number = number / 2;
		}
		
		for (int i = 3; i <= number; i += 2) {
			if (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		} 
	}
}
