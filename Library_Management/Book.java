package Library_Management;

public class Book extends LibraryItem {

	private String author;
	
	public Book(String title, int itemID,String author) {
		super(title, itemID);
		this.author= author;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Author is  "+author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
