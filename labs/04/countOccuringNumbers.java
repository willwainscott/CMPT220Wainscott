import java.util.Scanner;

public class countOccuringNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] inputList = new int[100];
		
		System.out.print("Enter the integers between 1 and 100: ");
		int number = input.nextInt();
		while (number != 0) {
			inputList[number - 1]++;
			number = input.nextInt();
		}
		
		for (int i = 0; i<100; i++) {
			int place = i + 1;
			if (inputList[i] == 1) {
				System.out.print(place + " occurs 1 time\n");
			} else if (inputList[i] != 0) {
				System.out.print(place + " occurs " + inputList[i] + " times\n");
			}
		}
	}
}
