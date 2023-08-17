package TestProgram.Final_Constructor;

public class AntiVirus {
	private String productKey;
	private boolean activate;
	
	AntiVirus(String productKey){
		this.productKey = productKey;
		this.activate = false;
	}
	
	public void isactivate() {
		if(activate) {
			System.out.println("Yeah, AntiVirus is Running Succesfully");
		}
		else {
			System.out.println("You are using free version,please upgrade");
		}
	}
	public void transaction(Transaction isDone) {
		if(isDone.iscompleted()) {
		activate = true;
		System.out.println("Wow, Transaction completed, product Key is approved");
		}
		else {
			System.out.println("Transaction is not done-please pay first to activate product key");
		}
	}
	
	public static void main(String[] args) {
		Transaction user1 = new Transaction(false);
		AntiVirus mcfee = new AntiVirus("Mc001xoo1");
		mcfee.transaction(user1);
		mcfee.isactivate();
		System.out.println();
		Transaction user2 = new Transaction(true);
		AntiVirus smadev = new AntiVirus("Smadev001xoo1");
		smadev.transaction(user2);
		smadev.isactivate();
	}
}
