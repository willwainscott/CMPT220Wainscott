import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors: ");
		int userPick = input.nextInt();
		
		int compPick = (int) ((Math.random() * 10) % 3);
		
		System.out.print("The computer chose ");
		switch (compPick) {
			case 0: System.out.print("rock, ");
				break;
			case 1: System.out.print("paper, ");
				break;
			case 2: System.out.print("scissors, ");
				break;
		}
		
		System.out.print("and you chose ");
		switch (userPick) {
			case 0: System.out.print("rock, ");
				break;
			case 1: System.out.print("paper, ");
				break;
			case 2: System.out.print("scissors, ");
				break;
		}	
		
		if (userPick == 0) {
			if (compPick == 1) {
				System.out.print("you lose.");
			} else if (compPick == 2) {
				System.out.print("you win!");
			} else {
				System.out.print("it's a draw.");
			}
		} else if (userPick == 1) {
			if (compPick == 2) {
				System.out.print("you lose.");
			} else if (compPick == 0) {
				System.out.print("you win!");
			} else {
				System.out.print("it's a draw.");
			}
		} else {
			if (compPick == 0) {
				System.out.print("you lose.");
			} else if (compPick == 1) {
				System.out.print("you win!");
			} else {
				System.out.print("it's a draw.");
			} 
		}
	}

}
