import java.util.Scanner;

public class minutesToYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of minutes: ");
		long minutes = input.nextLong();
		
		long days = minutes / 60 / 24;
		long years = days / 365;
		long leftoverDays = days % 365;
		
		System.out.print(minutes+" minutes is approximatly "+years+" years and "+leftoverDays+" days.");
		
	}
}
