import java.util.Scanner;

public class HeadsAndTails {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int size = input.nextInt();
		
		String s = Integer.toBinaryString(size); //converts the integer to a binary string
		
		while (s.length() < 9) {
			s = "0" + s;			//Adds 0's to the front of the binary string if 
		}							//it is not already 9 characters long
		
		for (int i = 0; i < s.length(); i++) {
			if (i == 3 || i == 6) {
				System.out.print("\n");
			} 
			if (s.charAt(i) == '0') {
				System.out.print("H ");
			} else {
				System.out.print("T ");
			}
		}
	}
}
