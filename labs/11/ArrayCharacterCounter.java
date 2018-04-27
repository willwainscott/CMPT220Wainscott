import java.util.Arrays;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class ArrayCharacterCounter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many characters are you entering?: ");
		char[] charList = new char[input.nextInt()];
		
		System.out.print("Enter the characters to add them to an array: ");
		
		for(int i = 0; i < charList.length; i++) {
			charList[i] = input.next().charAt(0);	
		}
		
		System.out.print("Enter a char to see how many times you entered it: ");
		char specificChar = input.next().charAt(0);
		
		System.out.print("You entered " + specificChar + " " + 
				count(charList, specificChar) + " times.");
	}
	
	public static int count(char[] chars, char ch) {
		String charsString = Arrays.toString(chars);
		
		if (charsString.indexOf(ch) != -1) {
			return 1 + count(charsString.substring(charsString.indexOf(ch) + 1).toCharArray(), ch);
		} else {
			return 0;
		}
	}
	
	public static int count(char[] chars, char ch, int high) {
		String charsString = chars.toString().substring(0, high + 1);
		
		return count(charsString.toCharArray(),ch);
	}
}
