package Library_Management;


public class LibraryItem {
	private String title;
	private  int itemID;
	
	public LibraryItem(String title,int itemID) {
		this.title = title;
		this.itemID = itemID;
	}
	
	public void displayInfo() {
		System.out.println(title+ " and the Id is "+itemID);

		
	}
	
}
