import java.util.Scanner;

public class findSmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		double[] numbers = new double[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.print("The minimum number is: " + min(numbers));
	}
	
	public static double min(double[] array) {
		double lowestNumber = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowestNumber) {
				lowestNumber = array[i];
			}
		}
		return lowestNumber;
	}
}
