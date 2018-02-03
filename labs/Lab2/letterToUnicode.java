import java.util.Scanner;

public class letterToUnicode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		
		String s = input.next();
		char letter = s.charAt(0);
		
		int i = (int) letter;
		System.out.print("The Unicode for your caharcter is: " + i + ".");

	}

}
