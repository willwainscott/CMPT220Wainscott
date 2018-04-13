import java.util.Scanner;

public class printDistinctNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		
		int[] numbers = new int[10];
		int amountOfDistinctNumbers = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int number = input.nextInt();
			if (distinct(numbers,number)) {
				numbers[i] = number;
				amountOfDistinctNumbers++;
			}		
		}
		
		System.out.println("The number of distinct numbers is " + amountOfDistinctNumbers);
		System.out.print("The distinct numbers are: ");
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] != 0) {
				System.out.print(numbers[j] + " ");
			}
		}
		
	}
	
	public static boolean distinct(int[] numbers, int number) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				return false;
			}
		}
		return true;
	}
}
