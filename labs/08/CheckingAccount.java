
public class CheckingAccount extends Account {
	
	private boolean overdraft = true;
	private double overdraftLimit;
	
	public CheckingAccount() {}
	
	public CheckingAccount(int id, double balance, double annualInterestRate,
			double limit) {
		super(id, balance, annualInterestRate);
		overdraftLimit = limit;
	}
	
	public String toString() {
		return super.toString() +"\nAccount can overdraft: " + overdraft +
			"\nAccount overdraft limit: " + overdraftLimit;
	}
}
