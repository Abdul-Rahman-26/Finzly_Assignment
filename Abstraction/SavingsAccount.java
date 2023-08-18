package Abstraction;

public  class SavingsAccount extends BankAccount{
	protected static double interestRate;

	SavingsAccount(String accountNumber, String accountHolderName, double balance,double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
		
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		return accountHolderName;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Your amount " +amount +" rupees deposited successfully");
		}
		else {
			System.out.println("Oops, please enter valid");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0) {
			if((balance-amount )>0) {
			balance -= amount;
			
			System.out.println("Your amount " +amount +" rupees withdraw successfully");
		}
			else {
				System.out.println("Insufficient balance You cannot withdraw");
			}}
		else {
			System.out.println("Oops, please enter valid");
		}
		
	}

}
