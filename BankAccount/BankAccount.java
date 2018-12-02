//Each BankAccount object represents one user's account
//information including name and balance of money.
public class BankAccount {
	private String name;
	//balance and transactionFee default to 0
	private double balance = 0;
	private double transactionFee = 0.0;
	
	//constructor
	public BankAccount(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		//subtracts amount + transaction fee if balance will not become negative
		//does nothing if amount + transactionFee exceeds the balance
		if (balance >= amount + transactionFee) {
			balance -= amount + transactionFee;
		}
	}
	
	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $%.2f", name, balance);
	}
	
}
