package exceptionHandling.hotelManagementSystem2;

public class Guest {

	private String guestName;
	private long contactNumber;
	private String address;
	
	
	public Guest(String guestName, long contactNumber, String address) {
		super();
		this.guestName = guestName;
		this.contactNumber = contactNumber;
		this.address = address;
	}


	public String getGuestName() {
		return guestName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public String getAddress() {
		return address;
	}
	
}
