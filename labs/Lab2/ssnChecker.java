import java.util.Scanner;

public class ssnChecker {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Social Security Number: ");
		
		String ssn = input.next();
		boolean valid = true;
		
		if (ssn.length() != 11) {
			valid = false;
		} else {
			for (int i=0;i<=10;i++) {
				char place = ssn.charAt(i);
				if ((i == 3 || i == 6) && (place != '-')) {
					valid = false;
				} else if (!(i == 3 || i == 6) && !(Character.isDigit(place))) {
					valid = false;
				}
			}
		}	
		if (valid) {
			System.out.print(ssn + " is a vaild SSN number.");
		} else {
			System.out.print(ssn + " is not a valid SSN number.");
		}
	}
}
