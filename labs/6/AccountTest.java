
public class AccountTest {

	public static void main(String[] args) {
		
		Account myAccount = new Account(1122, 20000, 4.5);
		
		
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getmonthyInterest());
		System.out.println(myAccount.dateCreated());
	}
}
