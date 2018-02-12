import java.util.Scanner;

public class sortThreeNumbers {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter three numbers to see them in increasing order: ");
	double number1 = input.nextDouble();
	double number2 = input.nextDouble();
	double number3 = input.nextDouble();
	
	displaySortedNumbers(number1,number2,number3);
	
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double highest = Math.max(Math.max(num1,num2),num3); // JA
		double lowest = Math.min(Math.min(num1,num2),num3);
		double middle;
		
		if (num1 != highest && num1 != lowest) {
			middle = num1;
		} else if (num2 != highest && num2 != lowest) {
			middle = num2;
		} else {
			middle = num3;
		}
		
		if (num1 == num2 || num1 == num3) {
			middle = num1;
		} else if (num2 == num3) {
			middle = num2;
		}
		
		System.out.print(lowest + " " + middle + " " + highest);
	}
}
