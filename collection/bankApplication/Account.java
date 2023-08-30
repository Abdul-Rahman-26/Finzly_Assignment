package collection.bankApplication;

public class Account {
	
	Account(String accountantName, double balance){
		this.accountantName = accountantName;
		this.balance = balance;
	}
	
	private String accountantName;
	private static double balance;
	
	public String getAccountantName() {
		return accountantName;
	}

	public static double getBalance() {
		return balance;
	}

	public static void deposit(double amount) {
		balance += amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	public static void withdraw(double amount) {
		if(amount>0) {
		balance -= amount;
		System.out.println("Amount Withrawal Successfully");
	}else {
		System.out.println("Insufficient Balance");
	}
	
}
}
