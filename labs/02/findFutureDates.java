import java.util.Scanner;

public class findFutureDates {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's date: ");
		int today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int future = input.nextInt();
		future = ((future % 7 + today) % 6); 
		
		System.out.print("Today is ");
		
		switch (today) {
			case 0: System.out.print("Sunday");
				break;
			case 1: System.out.print("Monday");
				break;
			case 2: System.out.print("Tuesday");
				break;
			case 3: System.out.print("Wednesday");
				break;
			case 4: System.out.print("Thursday");
				break;
			case 5: System.out.print("Friday");
				break;
			case 6: System.out.print("Saturday");
				break;
		}
		
		System.out.print(" and the future day is ");
		
		switch (future) {
			case 0: System.out.print("Sunday.");
				break;
			case 1: System.out.print("Monday.");
				break;
			case 2: System.out.print("Tuesday.");
				break;
			case 3: System.out.print("Wednesday.");
				break;
			case 4: System.out.print("Thursday.");
				break;
			case 5: System.out.print("Friday.");
				break;
			case 6: System.out.print("Saturday.");
				break;
		}
		
	}
	
}
