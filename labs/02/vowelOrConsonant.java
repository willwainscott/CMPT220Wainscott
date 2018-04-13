import java.util.Scanner;

public class vowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Letter: ");
		
		String s = input.next();
		s = s.toLowerCase();
		char letter = s.charAt(0);
		
		int l = (int) letter;
		
		if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
			System.out.print("This letter is a vowel.");
		} else if (l >= 'a' && l <= 'z') {
			System.out.print("This letter is a consonant");
		} else {
			System.out.print("Your input was not a letter.");
		}
	
	}
}
