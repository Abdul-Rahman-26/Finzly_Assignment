package Library_Management;

public class DVD extends LibraryItem{
	
	private  int duration;
	
	public DVD(String title,int itemID,int duration) {
		super(title,itemID);
		this.duration = duration;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Duration of this Item is "+duration+" s");		
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	}
