import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingCharacters {

	public static void main(String[] args) throws FileNotFoundException {
		
		File sourceFile = new File(args[0]);
		
		Scanner wordCount = new Scanner(sourceFile);
		Scanner lineCount = new Scanner(sourceFile);
		
		int characters = 0;
		int words = 0;
		int lines = 0;
		
		while (wordCount.hasNext()) {
			String s = wordCount.next();
			words++;
			characters += s.length();
		}
		
		while (lineCount.hasNextLine()) {
			lines++;
			lineCount.nextLine();
		}
		
		System.out.println("File " + sourceFile.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}
