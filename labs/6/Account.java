import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account() {}
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Date dateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 100) / 12;
	}
	
	public double getmonthyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public double withdraw(double amount) {
		return balance -= amount;
	}
	
	public double deposit(double amount) {
		return balance += amount;
	}

		
}
