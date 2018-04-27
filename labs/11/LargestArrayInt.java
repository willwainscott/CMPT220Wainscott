import java.util.Scanner;

public class LargestArrayInt {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] integerList = new int[8];
		
		System.out.print("Enter 8 integers to find the largest one: ");
		
		for (int i = 0; i < 8; i++) {
			integerList[i] = input.nextInt();
		}
		
		System.out.print("The largest integer is: " + largestInteger(integerList,0));
	}
	
	public static int largestInteger(int[] a, int index) {
		if (index < 8) {
			if (a[index] > largestInteger(a, index + 1)) {
				return a[index];
			} else {
				return largestInteger(a, index + 1);
			}
		}
		return a[index - 1];
	}
}
