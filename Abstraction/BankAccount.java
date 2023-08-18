package Abstraction;

public abstract class BankAccount {
	protected String accountNumber;
	protected String accountHolderName;
	public double balance;
	
	BankAccount(String accountNumber,String accountHolderName,double balance){
		this.accountNumber= accountNumber;
		this.accountHolderName= accountHolderName;
		this.balance = balance;
	}
	public abstract String getAccountNumber();
	
	public abstract String getAccountHolderName();
	
	public abstract double getBalance();
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
}
