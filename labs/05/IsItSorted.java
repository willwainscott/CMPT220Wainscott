import java.util.Arrays;
import java.util.Scanner;

public class IsItSorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the list: ");
		int length = input.nextInt();
		int[] numbers = new int[length];
		System.out.print("Enter the contents of the list: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.print("The list has " + length + " integers ");
		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j] + " ");
		}
		
		if (isSorted(numbers)) {
			System.out.print("\nThe list is already sorted");
		} else {
			System.out.print("\nThe list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list) {
		int[] nonSorted = list.clone();
		Arrays.sort(list);
		return (Arrays.equals(nonSorted, list));
	}
}
