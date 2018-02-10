import java.util.Scanner;

public class palindromeInteger {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer to see if it's a palindrome: ");
		int startingNumber = input.nextInt();
		
		if (palindrome(startingNumber)) {
			System.out.print("The number is a palindrome");
		} else {
			System.out.print("The number is not a plaindrome");
		}
		
	}
	
	public static int reverse(int number) {
		String originalString = Integer.toString(number);
		String convertedString = "";
		
		for (int i=originalString.length();i > 0;i--) {
			char a = originalString.charAt(i-1);
			String b = Character.toString(a);
			convertedString += b;
		}
		int convertedNumber = Integer.parseInt(convertedString);
		return convertedNumber;	
	}
	
	public static boolean palindrome(int number) {
		return number == reverse(number);
	}
}
