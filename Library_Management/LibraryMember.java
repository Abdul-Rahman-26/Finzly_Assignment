package Library_Management;

public abstract class LibraryMember implements Reservable{

	public int memberID;
	public String name;
	public static boolean reserved =false;
	
	public LibraryMember(int memberID,String name) {
		this.memberID = memberID;
		this.name = name;
	}
	public void reserveItem(LibraryItem item) {
		reserved = true;
		System.out.print(name + " you got reserved ");
        item.displayInfo();
        System.out.println("By your Student memberID " + memberID);
	}
	
	public abstract void borrowItem(LibraryItem item);
}
