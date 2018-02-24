import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		numbers = eliminateDuplicates(numbers);
		
		System.out.print("The distinct numbers are: ");		
		for (int m = 0; m < numbers.length; m++) {
			if (numbers[m] != 0) {
				System.out.print(numbers[m] + " ");
			}
		}
	}
	

	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctNumbers = new int[10];
		for (int i = 0; i < list.length; i++) {
			int number = list[i];
			boolean unique = true;
			for (int j = 0; j < distinctNumbers.length; j++) {
				if (distinctNumbers[j] == number) {
					unique = false;
				}
			}
			if (unique) {
				distinctNumbers[i] = number;
			}
		}
		return distinctNumbers;
	}
}
