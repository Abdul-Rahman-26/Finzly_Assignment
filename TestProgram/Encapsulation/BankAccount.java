package TestProgram.Encapsulation;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private float balance;
	
	BankAccount(String accountNumber,String ownerName,float balance){
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(float amount) {
		if(amount > 0) {
			balance+= amount;
			System.out.println("Dear "+ownerName+", your Deposit amount: "+balance);
		}
		else {
			System.out.println("Error,Invalid");
		}
	}
	
	public void withdraw(float amount) {
		if(amount > 0) {
			balance-= amount;
			System.out.println("Dear "+ownerName+", your balance amount: "+balance);
		}
		else {
			System.out.println("Error,Invalid");
		}
	}
	
	public float getBalance() {
		return balance;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}
	public String getownerName() {
		return ownerName;
	}
	
	public static void main(String[] args) {
		BankAccount user1 = new BankAccount("17890342","AB",5000);
		user1.deposit(1000);
		System.out.println("Balance: "+user1.getBalance());
		user1.withdraw(575);
		System.out.println("Hi "+user1.getownerName());
		System.out.println("Your Acc No: "+user1.getaccountNumber());
		System.out.println("Balance: "+user1.getBalance());
		
	}
}


