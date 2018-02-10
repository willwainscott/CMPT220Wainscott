import java.util.Scanner;

public class daysInAMonth {

	public static void main(String[]  args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		System.out.print("This month has ");
		switch (month) {
			case 1: System.out.print("31 days.");
				break;
			case 2: if (year % 4 == 0) {
						System.out.print("29 days");
					} else {
						System.out.print("28 days");
					}
				break;
			case 3: System.out.print("31 days.");
				break;
			case 4: System.out.print("30 days.");
				break;
			case 5: System.out.print("31 days.");
				break;
			case 6: System.out.print("30 days");
				break;
			case 7: System.out.print("31 days.");
				break;
			case 8: System.out.print("31 days.");
				break;
			case 9: System.out.print("30 days");
				break;
			case 10: System.out.print("31 days.");
				break;
			case 11: System.out.print("30 days");
				break;
			case 12: System.out.print("31 days.");
				break;
		}	
	}
}
