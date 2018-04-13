
public class SavingsAccount extends Account{

	private boolean overdraft = false;
	
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
	}
	
	public String toString() {
		return super.toString() + "\nAccount can overdraft: " + overdraft;
	}
}
