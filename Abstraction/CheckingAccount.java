package Abstraction;

public class CheckingAccount extends BankAccount {
	protected  double overdraftLimit;

	CheckingAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
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
		if(balance<0) {
			System.out.print("You need to return ");
			return (-1*balance);
		}else {
		return balance;
	}
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
			if((balance-amount )> -overdraftLimit) {
			balance -= amount;
			
			System.out.println("Your amount " +amount +" rupees withdraw successfully");
		}
			else {
				System.out.println("Insufficient balance You can withdraw");
			}}
		else {
			System.out.println("Oops, please enter valid");
		}

	}

}
