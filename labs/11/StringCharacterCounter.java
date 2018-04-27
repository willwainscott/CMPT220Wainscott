
public class StringCharacterCounter {

	public static int count(String str, char a) {
		if (str.indexOf(a) != -1) {
			return 1 + count(str.substring(str.indexOf(a) + 1), a);
		} else {
			return 0;
		}
	}
	
	public static int count(String str, char a, int high) {
		String shorterString = str.substring(0, high + 1);
		/* The ending index of the substring is high + 1 because the method 
		 * automatically subtracts one from the int parameter, because the nth 
		 * number in a string is actually the nth - 1 index of that string */
		return count(shorterString,a);
	}
	
	
}
