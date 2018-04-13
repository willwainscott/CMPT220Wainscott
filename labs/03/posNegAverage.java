import java.util.Scanner;

public class posNegAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int pos = 0;
		int neg = 0;
		int total = 0;
		double average = 0;
		int value = input.nextInt();
		
		while (value != 0) {
			total += value;
			if (value < 0) {
				neg++;
			} else {
				pos++;
			}
			value = input.nextInt();
		}
		
		if (total == 0) {
			System.out.print("No numbers are entered except 0");
		} else {
			System.out.println("The number of positives is " + pos);
			System.out.println("The number of negatives is " + neg);
			System.out.println("The total is " + total);
			average = (double) total / (pos + neg);
			System.out.println("The average is " + average);
		}
	}

}
