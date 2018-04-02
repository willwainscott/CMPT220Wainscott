
public class AccountsTest {
	
	public static void main(String[] args) {
		
		Account account1 = new Account(100, 1000, 5);
		SavingsAccount account2 = new SavingsAccount(200, 2000, 4);
		CheckingAccount account3 = new CheckingAccount(300, 400, 3, 150);
		
		System.out.print(account1.toString() + "\n" +
		account2.toString() + "\n" +
		account3.toString());
	}
}
