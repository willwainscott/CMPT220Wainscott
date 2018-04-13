import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
	public static void main(String[] args) throws Exception {
		
		File sourceFile = new File(args[1]);
		
		File tempFile = new File("TempFile.txt");
		
		try (
			Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(tempFile);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[0],"");
				output.println(s2);
			}
		}
		sourceFile.delete();
		tempFile.renameTo(sourceFile);
	}
}
