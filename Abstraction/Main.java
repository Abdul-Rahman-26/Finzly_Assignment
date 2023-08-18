package Abstraction;

public class Main {
public static void main(String[] args) {
	SavingsAccount savings = new SavingsAccount("BOI000DD2334","AB",5000,4);
	CheckingAccount check = new CheckingAccount("SBIxx001234", "Kerthik", 10000, 5000);
	System.out.println("Name of the Accountant: "+savings.getAccountHolderName());
	savings.deposit(500);
	savings.withdraw(5700);
	System.out.println("Balance: "+savings.getBalance());
	savings.withdraw(3000);
	System.out.println("Balance: "+savings.getBalance());
	System.out.println();
	
	System.out.println("Name of the Accountant: "+check.getAccountHolderName());
	check.deposit(10000);
	check.withdraw(24000);
	System.out.println("Balance: "+check.getBalance());
	
}
}
