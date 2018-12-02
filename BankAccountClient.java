//client program for BankAccount class
public class BankAccountClient {

	public static void main(String[] args) {
		//initiate a new BankAccount object
		BankAccount james = new BankAccount("James");
		
		//deposit $200, balance is not $200
		james.deposit(200);
		System.out.println(james.toString());
		
		//withdraw $25 + $5, balance is now $170
		james.setTransactionFee(5);
		james.withdraw(25);
		System.out.println(james.toString());
		
		//withdraw $150 + $2.50, balance is now $17.50
		james.setTransactionFee(2.5);
		james.withdraw(150);
		System.out.println(james.toString());
		
		//attempt to withdraw $16 + $2.50, not enough money
		//balance stays at $17.50
		james.withdraw(16);
		System.out.println(james.toString());

	}

}
